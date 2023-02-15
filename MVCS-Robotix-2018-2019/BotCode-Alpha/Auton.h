tSensors potClaw = Claw;
tMotor mIntake = mGRB;
tMotor mLift = mLFT;
tMotor mClaw = mCLW;
tMotor mFlyWheelR = mFRE;
tMotor mFlyWheelL = mFRE2;


void moveClawUp (int toPos) {
    clearTimer(T1); // set timer in order to prevent burning out motors
    while (SensorValue[potClaw] < toPos && time1[T1] < 3000) {
        motor[mClaw] = 127;
    }
    motor[mClaw] = 0;
}
void moveClawDown (int toPos) {
    clearTimer(T1); // set timer in order to prevent burning out motors
    while (SensorValue[potClaw] > toPos && time1[T1] < 3000) {
        motor[mClaw] = -77;
    }
    motor[mClaw] = 0;
}


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
    {0, 0, 0, 0}, {0, 0, 0, 0}, {1, 1, -1, -1},    //  3 o'clock
    {0, 0, 0, 0}, {0, 0, 0, 0}, {1, -1, 1, -1},  //  6 o'clock
    {0, 0, 0, 0}, {0, 0, 0, 0}, {-1, -1, 1, 1},    //  9 o'clock
    {0, 0, 0, 0}, {0, 0, 0, 0}, {-1, 1, -1, 1}};     // 12 o'clock

int motorPower[4] = {0, 0, 0, 0};
int encoderValues[4];

int encLeft, encRight;
void resetEncoderValues () {
    encLeft = encRight = SensorValue[encFL] = SensorValue[encFR] = SensorValue[encBL] = SensorValue[encBR] = 0;
}
void getEncoderValues (int direction) {
    encoderValues[0] = -SensorValue[encFL] * encListDrive[direction][0];
    encoderValues[1] = -SensorValue[encFR] * encListDrive[direction][1];
    encoderValues[2] =  SensorValue[encBL] * encListDrive[direction][2];
    encoderValues[3] = -SensorValue[encBR] * encListDrive[direction][3];
    encLeft = abs(encoderValues[mListDrive[direction][0]] + encoderValues[mListDrive[direction][2]]) / 2;
    encRight = abs(encoderValues[mListDrive[direction][1]] + encoderValues[mListDrive[direction][3]]) / 2;
}

const int encLeftRatio = 60, encRightRatio = 57;

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
    while ((encLeft + encRight) / 2 < distance) {
        getEncoderValues(direction);
        if (direction == 12 ? abs(encLeft * encLeftRatio - encRight * encRightRatio) : abs(encLeft - encRight) > 30) {
            motorPower[mListDrive[direction][0]] = motorPower[mListDrive[direction][2]] = encLeftGoesFurther(direction) ? 95 : 127;
            motorPower[mListDrive[direction][1]] = motorPower[mListDrive[direction][3]] = encLeftGoesFurther(direction) ? 127 : 95;
        } else {
            motorPower[0] = motorPower[1] = motorPower[2] = motorPower[3] = 127;
        }

        motor[mFL] = mListDirection[0][direction] * motorPower[0];
        motor[mFR] = mListDirection[1][direction] * motorPower[1];
        motor[mBL] = mListDirection[2][direction] * motorPower[2];
        motor[mBR] = mListDirection[3][direction] * motorPower[3];
    }
    motor[mFL] = motor[mFR] = motor[mBL] = motor[mBR] = 0;
}

void turn (int power, int distance) {
    motor[mFL] = motor[mBL] = motor[mFR] = motor[mBR] = -power;
    resetEncoderValues();
    while (abs (SensorValue[encFL]) + abs (SensorValue[encFR]) + abs (SensorValue[encBL]) + abs (SensorValue[encBR]) < distance) {
        wait1Msec(1);
    }
    motor[mFL] = motor[mBL] = motor[mFR] = motor[mBR] = power > 0 ? 35 : -35;
    wait1Msec(50);
    motor[mFL] = motor[mBL] = motor[mFR] = motor[mBR] = 0;
}

void autonLeft () {
    goForward (12, 950);
    motor[mFlyWheelL] = motor[mFlyWheelR] = 127;
    goForward (6, 500);
    goForward (9, 90);
    motor[mIntake] = 127;
    wait1Msec(2500);
    motor[mFlyWheelL] = motor[mFlyWheelR] = motor[mIntake] = 0;
    goForward (12, 65);
    turn(127, 1300);
    motor[mIntake] = -127;
    goForward (12, 400);
    motor[mIntake] = 0;
    goForward (12, 100);
    goForward (3, 440);
    goForward (12, 300);
    goForward (3, 50);
    goForward (12, 50);
}

void autonRight () {
    goForward (12, 950);
    motor[mFlyWheelL] = motor[mFlyWheelR] = 127;
    goForward (6, 500);
    goForward (3, 70);
    motor[mIntake] = 127;
    wait1Msec(2500);
    motor[mFlyWheelL] = motor[mFlyWheelR] = motor[mIntake] = 0;
    goForward (12, 65);
    turn(-127, 1320);
    motor[mIntake] = -127;
    goForward (12, 400);
    motor[mIntake] = 0;
    goForward (12, 100);
    goForward (9, 460);
    goForward (12, 270);
    goForward (9, 40);
    goForward (12, 60);
}

void auton() {
    //turn(127, 1200);
    //return;
    if (SensorValue[potAuton] < 1500) {
        autonLeft();
    } else if (SensorValue[potAuton] > 2700) {
        autonRight();
    }
}
