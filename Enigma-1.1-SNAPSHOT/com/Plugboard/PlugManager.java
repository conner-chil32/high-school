/*    */ package com.Plugboard;
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
/*    */ public class PlugManager
/*    */ {
/*    */   public static plug p1;
/* 15 */   public static char i1 = ' ';
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setPlug(char input, char output) {
/* 21 */     p1 = new plug(input, output);
/* 22 */     i1 = input;
/*    */   }
/*    */ 
/*    */   
/*    */   public char sendInput(char input) {
/* 27 */     char output = input;
/*    */     
/* 29 */     if (input == i1) {
/* 30 */       output = p1.translate(input);
/* 31 */       return output;
/*    */     } 
/*    */     
/* 34 */     return output;
/*    */   }
/*    */ }


/* Location:              C:\Users\Conner\Downloads\Enigma-1.1-SNAPSHOT.jar!\com\Plugboard\PlugManager.class
 * Java compiler version: 12 (56.0)
 * JD-Core Version:       1.1.3
 */