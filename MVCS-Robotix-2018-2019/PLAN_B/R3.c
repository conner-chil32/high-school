#pragma config(Sensor, in2,    potAuton,       sensorPotentiometer)
#pragma config(Sensor, in3,    potClaw,        sensorPotentiometer)
#pragma config(Sensor, dgtl1,  encLift,        sensorQuadEncoder)
#pragma config(Sensor, dgtl3,  LED,            sensorLEDtoVCC)
#pragma config(Sensor, dgtl4,  jumper,         sensorDigitalIn)
#pragma config(Sensor, dgtl5,  encFR,          sensorQuadEncoder)
#pragma config(Sensor, dgtl7,  sonarLeft,      sensorSONAR_raw)
#pragma config(Sensor, dgtl9,  sonarRight,     sensorSONAR_raw)
#pragma config(Sensor, dgtl11, encFL,          sensorQuadEncoder)
#pragma config(Motor,  port2,           mBL,           tmotorVex393_MC29, openLoop, reversed)
#pragma config(Motor,  port3,           mBR,           tmotorVex393_MC29, openLoop, reversed)
#pragma config(Motor,  port4,           mIntake,       tmotorVex393_MC29, openLoop)
#pragma config(Motor,  port5,           mFL,           tmotorVex393_MC29, openLoop)
#pragma config(Motor,  port6,           mFR,           tmotorVex393_MC29, openLoop, reversed)
#pragma config(Motor,  port7,           mClaw,         tmotorVex393_MC29, openLoop)
#pragma config(Motor,  port8,           mFlyWheelR,    tmotorVex393HighSpeed_MC29, openLoop)
#pragma config(Motor,  port9,           mFlyWheelL,    tmotorVex393HighSpeed_MC29, openLoop)
#pragma config(Motor,  port10,          mLift,         tmotorVex393_HBridge, openLoop, reversed)
//*!!Code automatically generated by 'ROBOTC' configuration wizard               !!*//

/*

--- README ---

8U: Set flyWheel full speed
8L: Set flyWheel half speed
8D: Set flyWheel zero speed (turn off)
*there is no flyWheel toggle button

7R: Toggle assist

*/

// potClaw {up: 4096, down: 600}

#pragma platform(VEX2)

#pragma competitionControl(Competition)

#include "Vex_Competition_Includes.c"

#define __DRIVE_SPEED_FACTOR_SLOW 0.5
#define __FLYWHEEL_SECONDARY_SPEED 67


void pre_auton() {
	//	bStopTasksBetweenModes = true;
}
bool flippingOnBot = false, clawInAction = false;

/*
goForward function doc
direction can be one of the four: 12, 3, 6, 9
let flyWheel be 12 o'clock
lift facing 6 o'clock, etc
*/
int walldistR = 600;
int walldistL = 600;
float adjL = 0.3;
float adjR = 0.3;
//1.2

/*
goForward function doc
direction can be one of the four: 12, 3, 6, 9
let flyWheel be 12 o'clock
lift facing 6 o'clock, etc
*/
int mListDirection[4][13] = // 0: FL, 1: FR, 2: BL, 3: BR
{{0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1},
	{0, 0, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1},
	{0, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1},
	{0, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 1}};

int mListDrive[13][4] = {{0, 0, 0, 0},
	{0, 0, 0, 0}, {0, 0, 0, 0}, {1, 3, 0, 2},  //  3 o'clock
	{0, 0, 0, 0}, {0, 0, 0, 0}, {3, 2, 1, 0},  //  6 o'clock
	{0, 0, 0, 0}, {0, 0, 0, 0}, {2, 0, 3, 1},  //  9 o'clock
	{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 1, 2, 3}}; // 12 o'clock

int encListDrive[13][4] = {{0, 0, 0, 0},
	{0, 0, 0, 0}, {0, 0, 0, 0}, {-1, 1, 1, -1},    //  3 o'clock
	{0, 0, 0, 0}, {0, 0, 0, 0}, {-1, -1, -1, -1},  //  6 o'clock
	{0, 0, 0, 0}, {0, 0, 0, 0}, {1, -1, -1, 1},    //  9 o'clock
	{0, 0, 0, 0}, {0, 0, 0, 0}, {1, 1, 1, 1}};     // 12 o'clock

int motorPower[4] = {0, 0, 0, 0};
int encoderValues[4];

int encLeft, encRight;
void resetEncoderValues () {
	encLeft = encRight = SensorValue[encFL] = SensorValue[encFR] = 0;
}
void getEncoderValues (int direction) {
	encoderValues[0] = -SensorValue[encFL] * encListDrive[direction][0];
	encoderValues[1] = -SensorValue[encFR] * encListDrive[direction][1];
	encoderValues[2] =  SensorValue[encFL] * encListDrive[direction][2];
	encoderValues[3] = -SensorValue[encFR] * encListDrive[direction][3];
	encLeft = (encoderValues[mListDrive[direction][0]] + encoderValues[mListDrive[direction][2]]) / 2;
	encRight = (encoderValues[mListDrive[direction][1]] + encoderValues[mListDrive[direction][3]]) / 2;
}

const int encLeftRatio = 60, encRightRatio = 60;

bool encLeftGoesFurther (int direction) {
	if (direction == 12) {
		return encLeft * encLeftRatio > encRight * encRightRatio;
		} else {
		return encLeft > encRight;
	}
}
void goForward (int direction, int distance) {
	if (mListDirection[0][direction] == 0) {
		return;
	}
	resetEncoderValues();
	while ((encLeft + encRight) / 2 < distance*550/900) {
		/*
		int V_i_BL = Sensorvalue[encBL]
		wait1Msec(10)
		int V_f_BL = Sensorvalue[encBL]
		*/
		getEncoderValues(direction);
		if (direction == 12 ? abs(encLeft * encLeftRatio - encRight * encRightRatio) : abs(encLeft - encRight) > 30) {
			motorPower[mListDrive[direction][0]] = motorPower[mListDrive[direction][2]] = encLeftGoesFurther(direction) ? 95 : 127;
			motorPower[mListDrive[direction][1]] = motorPower[mListDrive[direction][3]] = encLeftGoesFurther(direction) ? 127 : 95;
			} else {
			motorPower[0] = motorPower[1] = motorPower[2] = motorPower[3] = 127;
		}

		motor[mFL] = mListDirection[0][direction] * 127;
		motor[mFR] = mListDirection[1][direction] *127;
		motor[mBL] = mListDirection[2][direction]*127;
		motor[mBR] = mListDirection[3][direction] *127;
	}
	motor[mFL] = motor[mFR] = motor[mBL] = motor[mBR] = 0;
}

void FollowWallR (int direction, int distance) {
	if (mListDirection[0][direction] == 0) {
		return;
	}
	/*
	while (abs(walldistR-SensorValue(sonR))>10) {
	motor[mFR] = sgn(walldistR-SensorValue(sonR))*50
	motor[mBR] = -50*sgn(walldistR-SensorValue(sonR))
	motor[mFL] = 50*sgn(walldistR-SensorValue(sonR))
	motor[mBL] = -50*sgn(walldistR-SensorValue(sonR))
	EndTimeSlice();
	}
	*/
	resetEncoderValues();
	while ((encLeft + encRight)/2 < distance*550/900) {
		/*
		int V_i_BL = Sensorvalue[encBL]
		wait1Msec(10)
		int V_f_BL = Sensorvalue[encBL]
		*/
		getEncoderValues(direction);
		if (direction == 12 ? abs(encLeft * encLeftRatio - encRight * encRightRatio) : abs(encLeft - encRight) > 30) {
			motorPower[mListDrive[direction][0]] = motorPower[mListDrive[direction][2]] = encLeftGoesFurther(direction) ? 95 : 127;
			motorPower[mListDrive[direction][1]] = motorPower[mListDrive[direction][3]] = encLeftGoesFurther(direction) ? 127 : 95;
			} else {
			motorPower[0] = motorPower[1] = motorPower[2] = motorPower[3] = 127;
		}

		motor[mFR] = 127+adjR*(walldistR-SensorValue(sonarRight));
		motor[mBR] = 127+adjR*(walldistR-SensorValue(sonarRight));
		motor[mFL] = -127+adjR*(walldistR-SensorValue(sonarRight));
		motor[mBL] = -127+adjR*(walldistR-SensorValue(sonarRight));
		EndTimeSlice();
	}
	motor[mFL] = motor[mFR] = motor[mBL] = motor[mBR] = 0;
}

void FollowWallL (int direction, int distance) {
	if (mListDirection[0][direction] == 0) {
		return;
	}
	/*
	while (abs(walldistL-SensorValue(sonL))>10) {
	motor[mFR] = -sgn(walldistL-SensorValue(sonL))*50
	motor[mBR] = 50*sgn(walldistL-SensorValue(sonL))
	motor[mFL] = -50*sgn(walldistL-SensorValue(sonL))
	motor[mBL] = 50*sgn(walldistL-SensorValue(sonL))
	EndTimeSlice();
	}
	*/
	resetEncoderValues();
	while ((encLeft + encRight)/2 < distance*450/900) {
		/*
		int V_i_BL = Sensorvalue[encBL]
		wait1Msec(10)
		int V_f_BL = Sensorvalue[encBL]
		*/
		getEncoderValues(direction);
		if (direction == 12 ? abs(encLeft * encLeftRatio - encRight * encRightRatio) : abs(encLeft - encRight) > 30) {
			motorPower[mListDrive[direction][0]] = motorPower[mListDrive[direction][2]] = encLeftGoesFurther(direction) ? 95 : 127;
			motorPower[mListDrive[direction][1]] = motorPower[mListDrive[direction][3]] = encLeftGoesFurther(direction) ? 127 : 95;
			} else {
			motorPower[0] = motorPower[1] = motorPower[2] = motorPower[3] = 127;
		}

		motor[mFR] = 127-adjL*(walldistL-SensorValue(sonarLeft));
		motor[mBR] = 127-adjL*(walldistL-SensorValue(sonarLeft));
		motor[mFL] = -127-adjL*(walldistL-SensorValue(sonarLeft));
		motor[mBL] = -127-adjL*(walldistL-SensorValue(sonarLeft));
		EndTimeSlice();
	}
	motor[mFL] = motor[mFR] = motor[mBL] = motor[mBR] = 0;
}
void TimeBackward(int time) {
	motor[mFR] = -127;
	motor[mBR] = -127;
	motor[mFL] = 127;
	motor[mBL] = 127;
	wait1Msec(time);
	motor[mFR] = 0;
	motor[mBR] = 0;
	motor[mFL] = 0;
	motor[mBL] = 0;
}
void SoftForward(int time){
	motor[mFR] = 80;
	motor[mBR] = 80;
	motor[mFL] = -80;
	motor[mBL] = -80;
	wait1Msec(time);
	motor[mFR] = 0;
	motor[mBR] = 0;
	motor[mFL] = 0;
	motor[mBL] = 0;
}

void turn (int power, int distance) {
	motor[mFL] = motor[mBL] = motor[mFR] = motor[mBR] = -power;
	resetEncoderValues();
	while (abs (SensorValue[encFL]) + abs (SensorValue[encFR]) < distance/2) {
		wait1Msec(1);
	}
	motor[mFL] = motor[mBL] = motor[mFR] = motor[mBR] = power > 0 ? 35 : -35;
	wait1Msec(50);
	motor[mFL] = motor[mBL] = motor[mFR] = motor[mBR] = 0;
}
void autonBackLeft () {
	goForward(12,400);
	motor[mIntake] = 127;
	goForward (12, 300);
	wait1Msec(700);
	motor[mIntake] = 0;
	motor[mClaw]=-127;
	goForward(6,220);
	motor[mClaw]=0;
	turn(-127,2625);
	goForward(3,350);
	goForward(6,150);
	motor[mClaw]=127;
	wait1Msec(800);
	motor[mClaw]=0;

}
void autonBackRight () {
	goForward(12,400);
	motor[mIntake] = 127;
	goForward (12, 300);
	wait1Msec(700);
	motor[mIntake] = 0;
	motor[mClaw]=-127;
	goForward(6,220);
	motor[mClaw]=0;
	turn(127,2625);
	goForward(9,350);
	goForward(6,150);
	motor[mClaw]=127;
	wait1Msec(800);
	motor[mClaw]=0;

}
void autonLeft () {
	FollowWallL(12, 800);
	//800
	SoftForward (1100);
	motor[mFlyWheelL] = motor[mFlyWheelR] = 127;
	//TimeBackward(1300);
	goForward (6, 374);
	goForward (9, 30);
	motor[mIntake] = 127;
	wait1Msec(2500);
	motor[mFlyWheelL] = motor[mFlyWheelR] = motor[mIntake] = 0;
	//goForward (12, 65);
	turn(127, 1350);
	motor[mIntake] = -127;
	goForward (12, 400);
	motor[mIntake] = 0;
	goForward (9, 425);
	motor[mIntake] = 127;
	goForward (12,100);
	wait1Msec(1000);
	motor[mIntake] = 0;
	goForward(6,400);

}

void autonRight () {
	FollowWallR (12, 800);
	SoftForward (700);
	//550
	motor[mFlyWheelL] = motor[mFlyWheelR] = 127;
	goForward (6, 425);
	goForward (3, 50);
	motor[mIntake] = 127;
	wait1Msec(2500);
	motor[mFlyWheelL] = motor[mFlyWheelR] = motor[mIntake] = 0;
	//goForward (12, 65);
	turn(-127, 1300);
	motor[mIntake] = -127;
	goForward (12, 375);
	motor[mIntake] = 0;
	goForward (3, 370);
	motor[mIntake] = 127;
	goForward (12,200);
	wait1Msec(1000);
	motor[mIntake] = 0;
	goForward(6,400);
}
void auton() {
	//goForward (3, 4000);
	//turn(127, 1200);
	//return;
	 if (SensorValue[jumper] == 0) {
		if(SensorValue[potAuton] < 1150) {
			autonLeft();
			} else if (SensorValue[potAuton] > 3000){
			autonRight();
		}
	}
	else {
		if(SensorValue[potAuton] < 1150) {
			autonBackLeft();
			} else if (SensorValue[potAuton] > 3000){
			autonBackRight();
		}

	}
	// else if (SensorValue[potAuton] > 2700) {
	//    autonRight();
	//}

}


task autonomous() {
	auton();
}

// USER CONTROL


int flyWheelSpeed = 0;
int flyWheelSpeed_Memory = __FLYWHEEL_SECONDARY_SPEED;

float driveFactor = 1.0;
float FL, FR, BL, BR, headflip = 1.0;

/* Task to handle the Flywheel Speed LED */
task LED_Update () {
	int LEDFlashStatus = 0;
	while (true) {
        
        /* If flywheels running full speed, LED is off */
		if (flyWheelSpeed == 127 || flyWheelSpeed == 127) {
			SensorValue[LED] = 0;
            
            
        /* if FLywheels are running faster than half speed, LED blinks quickly (10 Hz) */
        } else if (flyWheelSpeed > __FLYWHEEL_SECONDARY_SPEED) {
			SensorValue[LED] = LEDFlashStatus;
			LEDFlashStatus = 1 - LEDFlashStatus;
			wait1Msec(100);
            
        /* if Flywheels are running at half speed, LED is solid */
        } else if (flyWheelSpeed == __FLYWHEEL_SECONDARY_SPEED) {
			SensorValue[LED] = 1;
            
            
            
        /* if Flywheels are runnign slower than half speed, LED blinks slowly (2 Hz) */
        } else if (flyWheelSpeed < __FLYWHEEL_SECONDARY_SPEED) {
			SensorValue[LED] = LEDFlashStatus;
			LEDFlashStatus = 1 - LEDFlashStatus;
			wait1Msec(500);
		}
        
        
        /* tell task handler done */
		EndTimeSlice();
	}
}

/* Task to run intake control */
task ballIntake () {
	while (true) {
        
        /* Basic Motor Control with two buttons */
		if (vexRT[Btn6U] && !vexRT[Btn6D]) {
			motor[mIntake] = 127;
			} else if (!vexRT[Btn6U] && vexRT[Btn6D]) {
			motor[mIntake] = -127;
			} else {
			motor[mIntake] = 0;
		}
        /* tell task handler done */
		EndTimeSlice();
	}
}


/* Control the Flywheel System */

task flyWheel () {
	while (true) {
        
        
        /* Set flywheel motors to indicated speed (Defaults to off) */
        
		motor[mFlyWheelL] = motor[mFlyWheelR] = flyWheelSpeed;
        
        
        /* Set Flywheel Speed variable depending on button pressed */
		if (vexRT[Btn8U]) { // set full speed button pushed
			flyWheelSpeed = 127;
        } else if (vexRT[Btn8L]) { // set secondary speed button pushed
			flyWheelSpeed = __FLYWHEEL_SECONDARY_SPEED;
        } else if (vexRT[Btn8D]) {  //Turn off flywheels
			flyWheelSpeed = 0;
        } else if (vexRT[Btn8R]) {  //set configured speed
			flyWheelSpeed = flyWheelSpeed_Memory;
		}
        
        
        /* Configure Flywheel Memory Speed */
        
		if (vexRT[Btn6U] && vexRT[Btn6D]) {
            
            /* if increment button pressed */
			if (vexRT[Btn8U]) {
                
                /* wait for button to be released */
				while (vexRT[Btn8U]) {
					wait1Msec(10);
				}
                
                /* Increment Flywheel Speed */
				flyWheelSpeed_Memory += 10;
                
                /* Bounds Check */
				flyWheelSpeed_Memory = flyWheelSpeed_Memory > 127 ? 127 : flyWheelSpeed_Memory;
                
                /* set flywheel speed to selected speed */
				flyWheelSpeed = flyWheelSpeed_Memory;
                
                
            /* if decrement button pressed */
            } else if (vexRT[Btn8D]) {
                
                /* wait for button to be released */
				while (vexRT[Btn8D]) {
					wait1Msec(10);
				}
                
                /* decrement Flyweel Speed */
				flyWheelSpeed_Memory -= 10;
                
                /* Bounds Check */
				flyWheelSpeed_Memory = flyWheelSpeed_Memory < 0 ? 0 : flyWheelSpeed_Memory;
                
                /* set flywheel speed to selected speed */
				flyWheelSpeed = flyWheelSpeed_Memory;
			}
		}
        /* tell task handler done */
		EndTimeSlice();
	}
}


/* Manual Control for the Cap Lift (Depreciated)*/

task lifter () { // task controlling the cascade-lift an the claw
	while (true) {
		if (vexRT[Btn5U] && vexRT[Btn5D]) {
			motor[mLift] = 0;
			}	else if (vexRT[Btn5U]) {
			motor[mLift] = 127;
			} else if (vexRT[Btn5D]) {
			motor[mLift] = -127;
			} else {
			motor[mLift] = 0;
		}
		EndTimeSlice();
	}
}


/* Move Claw Down to indicated Potentiometer Position*/

void moveClawUp (int toPos) {
    
    /* Tell claw assist that claw is in use*/
	clawInAction = true;
    
     /* Set timer so claw can "timeout" to prevent motor breakage*/
	clearTimer(T1);
	while (SensorValue[potClaw] < toPos && time1[T1] < 3000) {
		motor[mClaw] = 127;
	}
	motor[mClaw] = 0;
	clawInAction = false;
}

/* Move Claw Down to indicated Potentiometer Position*/
void moveClawDown (int toPos) {
    
    
    /* Tell claw assist that claw is in use*/
    
	clawInAction = true;
 
    /* Set timer so claw can "timeout" to prevent motor breakage*/
	clearTimer(T1);
	while (SensorValue[potClaw] > toPos && time1[T1] < 3000) {
		motor[mClaw] = -77;
	}
	motor[mClaw] = 0;

	clawInAction = false;
}

int curClawPos;


/* move claw to indicated position using pseudo-P control*/

void initClawMovement (int toPos) {
	curClawPos = SensorValue[potClaw];
	if (curClawPos < toPos) {
		motor[mClaw] = 127;
		} else if (curClawPos < toPos + 100) {
		motor[mClaw] = 60;//(toPos - curClawPos) / 2;
		} else if (curClawPos < toPos + 227) {
		motor[mClaw] = 10;//(curClawPos - toPos) * 1;
		} else if (curClawPos < toPos + 500) {
		motor[mClaw] = 0;
		} else {
		motor[mClaw] = -10;
	}
}

/* flip cap on the bot*/
void flipOnBot () {
    
    
    /* Tell claw assist that claw is in use*/
    
	clawInAction = true;
	while (true) {
		if ((vexRT[Btn5U] && vexRT[Btn5D]) && (vexRT[Btn7U] || vexRT[Btn7D]) ||
			vexRT[Btn7U] || vexRT[Btn7R]) {
			break;
		}
		initClawMovement (1950);
	}
	clawInAction = false;
}

/* prevent claw from moving when under load and raised */

bool clawAssistOn = false, clawInManualControl = false;
task clawAssist () {
	while (true) {
		if (vexRT[Btn7R]) {
			while (vexRT[Btn7R]) { }
			clawAssistOn = !clawAssistOn;
			moveClawDown (600);
		}
		if (clawAssistOn && !clawInAction && !clawInManualControl) {
			initClawMovement (900);
		}
		EndTimeSlice ();
	}
}

/* Task to handle the movement of the Claw*/     //Use Mutexes for this in future

task claw () {
	while (true) {
        
        /* Manual Control For Claw*/
		if (vexRT[Btn5U] && vexRT[Btn5D]) {
			if (vexRT[Btn7U]) {
				clawInManualControl = true;
				motor[mClaw] = 127;
				} else if (vexRT[Btn7D]) {
				clawInManualControl = true;
				motor[mClaw] = -127;
				} else {
				clawInManualControl = false;
				motor[mClaw] = 0;
			}
            
            /* Automatic Functions for claw */
            
			} else {
            
            /* Move Claw to lower posiiton*/
			if (vexRT[Btn7R]) {
				moveClawDown (600);
			}
            
            /* Flip Cap on ground*/
			if (vexRT[Btn7U]) {
				moveClawUp (1500);
				moveClawDown (600);
			}
                
            /* Flip Cap on Bot (Depreciated)*/
			if (vexRT[Btn7D]) {
				//moveClawUp (2000); // change this number to change the target pot position
				moveClawUp (2150);
				motor[mClaw] = 0;
				flipOnBot();
			}
		}
		EndTimeSlice();
	}
}

/* task to handle the movement of the X-drive Chassis*/

task drive() {
	int vch1;
	while (true) {
        /* Driving Speed Multiplier*/
		driveFactor = __DRIVE_SPEED_FACTOR_SLOW;
        
        
		/* Set Up Controller Deadzones*/
		if (abs(vexRT[Ch4]) < 20 && abs(vexRT[Ch3]) < 20 && abs(vexRT[Ch1]) < 20) { //if joysticks are within 20 of zero
			driveFactor = 0; //set driving speed multiplier to 0
			} else {
                
            /* set up spining speed*/
			vch1 = vexRT[Ch1];      //set variable for spinning channel
			if (abs (vch1) < 100 && abs(vch1) > 20) {   //if spinning channel is between the lower bound and the full speed bound
				vch1 = vch1 > 0 ? 60 : -60;     //set it to the half speed value (driving speed multiplier cuts this in half to quarter speed)
        }
                
                
                /* based on the values of the three input joysticks, calculate the intended speeds for each wheel*/
			FR = (headflip * (-vexRT[Ch4] + vexRT[Ch3])) - vch1;
			FL = (headflip * (-vexRT[Ch4] - vexRT[Ch3])) - vch1;
			BL = (headflip * (vexRT[Ch4] - vexRT[Ch3])) - vch1;
			BR = (headflip * (vexRT[Ch4] + vexRT[Ch3])) - vch1;

                
            /* if in the space between the deadzone and full speed set the power multiplier to half*/
			if(sqrt((vexRT[Ch4] * vexRT[Ch4]) + (vexRT[Ch3] * vexRT[Ch3])) < 100 &&
				sqrt((vexRT[Ch1] * vexRT[Ch1]) + (vexRT[Ch2] * vexRT[Ch2])) < 100) {
				driveFactor = 0.5;
				} else {    //else set full speed
				driveFactor = 1.0;
			}

		}
		if (vexRT[Btn7L]) { // flip head
			while (vexRT[Btn7L]) { wait1Msec(10);}
			headflip = -headflip;
		}
        /* apply the motor speed, multiplying the values by the power multiplier*/
		motor[mFL] = FL * driveFactor;
		motor[mFR] = FR * driveFactor;
		motor[mBL] = BL * driveFactor;
		motor[mBR] = BR * driveFactor;
		EndTimeSlice();
	}
}


/* Start All Tasks*/
task usercontrol() {
	startTask(drive);
	startTask(ballIntake);
	startTask(flyWheel);
	//startTask(lifter);
	startTask(claw);
	startTask(clawAssist);
	startTask(LED_Update);
	while (true) {
		EndTimeSlice();
	}
}
