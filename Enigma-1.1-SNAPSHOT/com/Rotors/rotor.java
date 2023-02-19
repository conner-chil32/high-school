/*     */ package com.Rotors;
/*     */ 
/*     */ import java.util.Random;
/*     */ import java.util.Stack;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class rotor
/*     */ {
/*     */   public static char outputChar;
/*  17 */   private static final char[] alph = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
/*  18 */   private static char[] outputs = new char[alph.length];
/*  19 */   private static Stack<Character> STACK = new Stack<>();
/*     */   
/*     */   public rotor() {
/*  22 */     int[] alphToInt = alphToIntArray(alph);
/*  23 */     int[] randomizedArray = RandomizeArray(alphToInt);
/*  24 */     for (int i = 0; i < randomizedArray.length; i++) {
/*  25 */       outputs[i] = (char)randomizedArray[i];
/*  26 */       STACK.push(Character.valueOf(outputs[i]));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void sendInputChar(char input) {
/*  33 */     switch (input) {
/*     */       case 'a':
/*  35 */         outputChar = outputs[0];
/*     */         return;
/*     */       case 'b':
/*  38 */         outputChar = outputs[1];
/*     */         return;
/*     */       case 'c':
/*  41 */         outputChar = outputs[2];
/*     */         return;
/*     */       case 'd':
/*  44 */         outputChar = outputs[3];
/*     */         return;
/*     */       case 'e':
/*  47 */         outputChar = outputs[4];
/*     */         return;
/*     */       case 'f':
/*  50 */         outputChar = outputs[5];
/*     */         return;
/*     */       case 'g':
/*  53 */         outputChar = outputs[6];
/*     */         return;
/*     */       case 'h':
/*  56 */         outputChar = outputs[7];
/*     */         return;
/*     */       case 'i':
/*  59 */         outputChar = outputs[8];
/*     */         return;
/*     */       case 'j':
/*  62 */         outputChar = outputs[9];
/*     */         return;
/*     */       case 'k':
/*  65 */         outputChar = outputs[10];
/*     */         return;
/*     */       case 'l':
/*  68 */         outputChar = outputs[11];
/*     */         return;
/*     */       case 'm':
/*  71 */         outputChar = outputs[12];
/*     */         return;
/*     */       case 'n':
/*  74 */         outputChar = outputs[13];
/*     */         return;
/*     */       case 'o':
/*  77 */         outputChar = outputs[14];
/*     */         return;
/*     */       case 'p':
/*  80 */         outputChar = outputs[15];
/*     */         return;
/*     */       case 'q':
/*  83 */         outputChar = outputs[16];
/*     */         return;
/*     */       case 'r':
/*  86 */         outputChar = outputs[17];
/*     */         return;
/*     */       case 's':
/*  89 */         outputChar = outputs[18];
/*     */         return;
/*     */       case 't':
/*  92 */         outputChar = outputs[19];
/*     */         return;
/*     */       case 'u':
/*  95 */         outputChar = outputs[20];
/*     */         return;
/*     */       case 'v':
/*  98 */         outputChar = outputs[21];
/*     */         return;
/*     */       case 'w':
/* 101 */         outputChar = outputs[22];
/*     */         return;
/*     */       case 'x':
/* 104 */         outputChar = outputs[23];
/*     */         return;
/*     */       case 'y':
/* 107 */         outputChar = outputs[24];
/*     */         return;
/*     */       case 'z':
/* 110 */         outputChar = outputs[25];
/*     */         return;
/*     */     } 
/* 113 */     outputChar = ' ';
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public char getOutputChar() {
/* 119 */     return outputChar;
/*     */   }
/*     */   
/*     */   public void increment() {
/* 123 */     char temp = ((Character)STACK.pop()).charValue();
/* 124 */     STACK.add(0, Character.valueOf(temp));
/*     */     
/* 126 */     for (int i = 0; i < outputs.length; i++) {
/* 127 */       outputs[i] = ((Character)STACK.elementAt(i)).charValue();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static int[] RandomizeArray(int[] array) {
/* 133 */     Random rgen = new Random();
/*     */     
/* 135 */     for (int i = 0; i < array.length; i++) {
/* 136 */       int randomPosition = rgen.nextInt(array.length);
/* 137 */       int temp = array[i];
/* 138 */       array[i] = array[randomPosition];
/* 139 */       array[randomPosition] = temp;
/*     */     } 
/*     */     
/* 142 */     return array;
/*     */   }
/*     */ 
/*     */   
/*     */   public static int[] alphToIntArray(char[] input) {
/* 147 */     int[] array = new int[alph.length];
/*     */     
/* 149 */     for (int i = 0; i < alph.length; i++) {
/* 150 */       array[i] = alph[i];
/*     */     }
/*     */     
/* 153 */     return array;
/*     */   }
/*     */ }


/* Location:              C:\Users\Conner\Downloads\Enigma-1.1-SNAPSHOT.jar!\com\Rotors\rotor.class
 * Java compiler version: 12 (56.0)
 * JD-Core Version:       1.1.3
 */