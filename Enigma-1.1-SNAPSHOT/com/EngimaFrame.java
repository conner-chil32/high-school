/*    */ package com;
/*    */ 
/*    */ import com.MainBody.EngimaBody;
/*    */ import java.awt.Component;
/*    */ import javax.swing.JFrame;
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
/*    */ public class EngimaFrame
/*    */   extends JFrame
/*    */ {
/*    */   public EngimaFrame() {
/* 21 */     setDefaultCloseOperation(3);
/* 22 */     setTitle("Enigma");
/* 23 */     setResizable(false);
/* 24 */     init();
/*    */   }
/*    */   
/*    */   public void init() {
/* 28 */     EngimaBody s = new EngimaBody();
/* 29 */     add((Component)s);
/*    */     
/* 31 */     pack();
/*    */     
/* 33 */     setLocationRelativeTo((Component)null);
/* 34 */     setVisible(true);
/*    */   }
/*    */   
/*    */   public static void main(String[] args) {
/* 38 */     new EngimaFrame();
/*    */   }
/*    */ }


/* Location:              C:\Users\Conner\Downloads\Enigma-1.1-SNAPSHOT.jar!\com\EngimaFrame.class
 * Java compiler version: 12 (56.0)
 * JD-Core Version:       1.1.3
 */