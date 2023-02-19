/*     */ package com.Rotors;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class reflectRotor
/*     */ {
/*  13 */   private static final char[] alph = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
/*     */   
/*     */   public static char output;
/*     */   
/*     */   public static void sendInput(char input) {
/*  18 */     switch (input) {
/*     */       case 'a':
/*  20 */         output = alph[25];
/*     */         return;
/*     */       case 'b':
/*  23 */         output = alph[20];
/*     */         return;
/*     */       case 'c':
/*  26 */         output = alph[10];
/*     */         return;
/*     */       case 'd':
/*  29 */         output = alph[21];
/*     */         return;
/*     */       case 'e':
/*  32 */         output = alph[24];
/*     */         return;
/*     */       case 'f':
/*  35 */         output = alph[18];
/*     */         return;
/*     */       case 'g':
/*  38 */         output = alph[17];
/*     */         return;
/*     */       case 'h':
/*  41 */         output = alph[15];
/*     */         return;
/*     */       case 'i':
/*  44 */         output = alph[14];
/*     */         return;
/*     */       case 'j':
/*  47 */         output = alph[22];
/*     */         return;
/*     */       case 'k':
/*  50 */         output = alph[2];
/*     */         return;
/*     */       case 'l':
/*  53 */         output = alph[19];
/*     */         return;
/*     */       case 'm':
/*  56 */         output = alph[23];
/*     */         return;
/*     */       case 'n':
/*  59 */         output = alph[16];
/*     */         return;
/*     */       case 'o':
/*  62 */         output = alph[8];
/*     */         return;
/*     */       case 'p':
/*  65 */         output = alph[7];
/*     */         return;
/*     */       case 'q':
/*  68 */         output = alph[13];
/*     */         return;
/*     */       case 'r':
/*  71 */         output = alph[6];
/*     */         return;
/*     */       case 's':
/*  74 */         output = alph[5];
/*     */         return;
/*     */       case 't':
/*  77 */         output = alph[11];
/*     */         return;
/*     */       case 'u':
/*  80 */         output = alph[1];
/*     */         return;
/*     */       case 'v':
/*  83 */         output = alph[3];
/*     */         return;
/*     */       case 'w':
/*  86 */         output = alph[22];
/*     */         return;
/*     */       case 'x':
/*  89 */         output = alph[12];
/*     */         return;
/*     */       case 'y':
/*  92 */         output = alph[4];
/*     */         return;
/*     */       case 'z':
/*  95 */         output = alph[0];
/*     */         return;
/*     */     } 
/*  98 */     output = ' ';
/*     */   }
/*     */ 
/*     */   
/*     */   public static char getOutput() {
/* 103 */     return output;
/*     */   }
/*     */ }


/* Location:              C:\Users\Conner\Downloads\Enigma-1.1-SNAPSHOT.jar!\com\Rotors\reflectRotor.class
 * Java compiler version: 12 (56.0)
 * JD-Core Version:       1.1.3
 */