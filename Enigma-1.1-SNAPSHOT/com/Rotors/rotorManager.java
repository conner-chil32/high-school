/*    */ package com.Rotors;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class rotorManager
/*    */ {
/*    */   public static char outputValue;
/*    */   private static rotor r1;
/*    */   private static rotor r2;
/*    */   private static rotor r3;
/* 19 */   public static int count1 = 1, count2 = 1, count3 = 1;
/*    */ 
/*    */   
/*    */   public rotorManager() {
/* 23 */     r1 = new rotor();
/* 24 */     r2 = new rotor();
/* 25 */     r3 = new rotor();
/*    */   }
/*    */   
/*    */   public void sendInput(char input) {
/* 29 */     staticRotor.sendInput(input);
/* 30 */     char temp1 = staticRotor.getOutput();
/* 31 */     r1.sendInputChar(temp1);
/* 32 */     char temp2 = r1.getOutputChar();
/* 33 */     r2.sendInputChar(temp2);
/* 34 */     char temp3 = r2.getOutputChar();
/* 35 */     r3.sendInputChar(temp3);
/* 36 */     char refTemp = r3.getOutputChar();
/* 37 */     reflectRotor.sendInput(refTemp);
/* 38 */     char temp4 = reflectRotor.getOutput();
/* 39 */     r3.sendInputChar(temp4);
/* 40 */     char temp5 = r3.getOutputChar();
/* 41 */     r2.sendInputChar(temp5);
/* 42 */     char temp6 = r2.getOutputChar();
/* 43 */     r1.sendInputChar(temp6);
/* 44 */     char temp7 = r1.getOutputChar();
/* 45 */     staticRotor.sendInput(temp7);
/* 46 */     outputValue = staticRotor.getOutput();
/*    */     
/* 48 */     count1++;
/* 49 */     r1.increment();
/*    */     
/* 51 */     if (count1 > 26) {
/* 52 */       count1 = 1;
/* 53 */       count2++;
/* 54 */       r2.increment();
/*    */     } 
/*    */     
/* 57 */     if (count2 > 26) {
/* 58 */       count1 = 1;
/* 59 */       count2 = 1;
/* 60 */       count3++;
/* 61 */       r3.increment();
/*    */     } 
/*    */     
/* 64 */     if (count3 > 26) {
/* 65 */       count1 = 1;
/* 66 */       count2 = 1;
/* 67 */       count3 = 1;
/* 68 */       r1.increment();
/* 69 */       r2.increment();
/* 70 */       r3.increment();
/*    */     } 
/*    */   }
/*    */   
/*    */   public char getOutput() {
/* 75 */     return outputValue;
/*    */   }
/*    */   
/*    */   public int getCount1() {
/* 79 */     return count1;
/*    */   }
/*    */   
/*    */   public int getCount2() {
/* 83 */     return count2;
/*    */   }
/*    */   
/*    */   public int getCount3() {
/* 87 */     return count3;
/*    */   }
/*    */ }


/* Location:              C:\Users\Conner\Downloads\Enigma-1.1-SNAPSHOT.jar!\com\Rotors\rotorManager.class
 * Java compiler version: 12 (56.0)
 * JD-Core Version:       1.1.3
 */