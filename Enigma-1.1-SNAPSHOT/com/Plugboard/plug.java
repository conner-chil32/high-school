/*    */ package com.Plugboard;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class plug
/*    */ {
/*    */   public static char con1;
/*    */   public static char con2;
/*    */   public static char output;
/*    */   
/*    */   public plug(char connection1, char connection2) {
/* 17 */     this; con1 = connection1;
/* 18 */     this; con2 = connection2;
/*    */   }
/*    */ 
/*    */   
/*    */   public char translate(char input) {
/* 23 */     if (input == con1) {
/* 24 */       output = con2;
/* 25 */       return output;
/*    */     } 
/* 27 */     return input;
/*    */   }
/*    */ 
/*    */   
/*    */   public char getCon1() {
/* 32 */     return con1;
/*    */   }
/*    */   
/*    */   public char getCon2() {
/* 36 */     return con2;
/*    */   }
/*    */ }


/* Location:              C:\Users\Conner\Downloads\Enigma-1.1-SNAPSHOT.jar!\com\Plugboard\plug.class
 * Java compiler version: 12 (56.0)
 * JD-Core Version:       1.1.3
 */