/*     */ package com.MainBody;
/*     */ 
/*     */ import com.Paint.drawElements;
/*     */ import com.Plugboard.PlugManager;
/*     */ import com.Rotors.rotorManager;
/*     */ import java.awt.Color;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.KeyListener;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EngimaBody
/*     */   extends JPanel
/*     */   implements Runnable
/*     */ {
/*     */   public static final int WIDTH = 1920;
/*     */   public static final int HEIGHT = 1080;
/*     */   private boolean running = false;
/*     */   private Key key;
/*     */   private Thread thread;
/*     */   private boolean ifKeyPressed;
/*     */   private boolean alreadyPressed = false;
/*  37 */   private static char oldChar = ' ';
/*     */   private static char newChar;
/*     */   private static char plugChar;
/*  40 */   private static int count1 = 1, count2 = 1, count3 = 1; private static char plugChar2; private static rotorManager rManager;
/*  41 */   private static int statCnt1 = 0; private static int statCnt2 = 0; private static int statCnt3 = 0;
/*     */   private static PlugManager pm;
/*     */   private static char[] connections;
/*     */   
/*     */   public EngimaBody() {
/*  46 */     setFocusable(true);
/*  47 */     setPreferredSize(new Dimension(1920, 1080));
/*  48 */     this.key = new Key();
/*  49 */     addKeyListener(this.key);
/*  50 */     rManager = new rotorManager();
/*  51 */     pm = new PlugManager();
/*  52 */     createConnections();
/*  53 */     start();
/*     */   }
/*     */ 
/*     */   
/*     */   public void run() {
/*  58 */     while (this.running);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void createConnections() {
/*  64 */     connections = new char[14];
/*     */     
/*  66 */     connections[0] = 'a'; connections[1] = 'z';
/*  67 */     connections[2] = 'e'; connections[3] = 'p';
/*  68 */     connections[4] = ' '; connections[5] = ' ';
/*  69 */     connections[6] = ' '; connections[7] = ' ';
/*  70 */     connections[8] = ' '; connections[9] = ' ';
/*  71 */     connections[10] = ' '; connections[11] = ' ';
/*  72 */     connections[12] = ' '; connections[13] = ' ';
/*     */   }
/*     */ 
/*     */   
/*     */   public void paint(Graphics g) {
/*  77 */     drawElements.animateRotor(g, 870, 100);
/*  78 */     drawElements.animateRotor(g, 970, 95);
/*  79 */     g.setColor(Color.BLACK);
/*  80 */     g.fillRect(0, 0, 1920, 1080);
/*     */     
/*  82 */     if (this.ifKeyPressed) {
/*  83 */       paintKeyboard(g, oldChar);
/*  84 */       paintLightboard(g, newChar);
/*     */     } else {
/*  86 */       paintKeyboard(g, ' ');
/*  87 */       paintLightboard(g, ' ');
/*     */     } 
/*  89 */     paintRotors(g, count1, count2, count3);
/*     */     
/*  91 */     switch (statCnt1) {
/*     */       case 0:
/*  93 */         drawElements.animateRotor(g, 1170, 100);
/*  94 */         drawElements.animateRotor(g, 1270, 95);
/*  95 */         statCnt1++;
/*     */         break;
/*     */       case 1:
/*  98 */         drawElements.animateRotor(g, 1170, 105);
/*  99 */         drawElements.animateRotor(g, 1270, 100);
/* 100 */         statCnt1++;
/*     */         break;
/*     */       default:
/* 103 */         drawElements.animateRotor(g, 1170, 95);
/* 104 */         drawElements.animateRotor(g, 1270, 105);
/* 105 */         statCnt1 = 0;
/*     */         break;
/*     */     } 
/*     */     
/* 109 */     if (count1 > 25) {
/* 110 */       switch (statCnt2) {
/*     */         case 0:
/* 112 */           drawElements.animateRotor(g, 870, 105);
/* 113 */           drawElements.animateRotor(g, 970, 100);
/* 114 */           statCnt2++;
/*     */           break;
/*     */         case 1:
/* 117 */           drawElements.animateRotor(g, 870, 95);
/* 118 */           drawElements.animateRotor(g, 970, 105);
/* 119 */           statCnt2++;
/*     */           break;
/*     */         default:
/* 122 */           drawElements.animateRotor(g, 870, 100);
/* 123 */           drawElements.animateRotor(g, 970, 95);
/* 124 */           statCnt2 = 0;
/*     */           break;
/*     */       } 
/*     */     } else {
/* 128 */       drawElements.animateRotor(g, 870, 100);
/* 129 */       drawElements.animateRotor(g, 970, 95);
/*     */     } 
/*     */     
/* 132 */     if (count2 > 25) {
/* 133 */       switch (statCnt2) {
/*     */         case 0:
/* 135 */           drawElements.animateRotor(g, 570, 95);
/* 136 */           drawElements.animateRotor(g, 670, 105);
/* 137 */           statCnt2++;
/*     */           return;
/*     */         case 1:
/* 140 */           drawElements.animateRotor(g, 570, 100);
/* 141 */           drawElements.animateRotor(g, 670, 95);
/* 142 */           statCnt3++;
/*     */           return;
/*     */       } 
/* 145 */       drawElements.animateRotor(g, 570, 105);
/* 146 */       drawElements.animateRotor(g, 670, 100);
/* 147 */       statCnt3 = 0;
/*     */     }
/*     */     else {
/*     */       
/* 151 */       drawElements.animateRotor(g, 570, 105);
/* 152 */       drawElements.animateRotor(g, 670, 100);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void paintKeyboard(Graphics g, char character) {
/* 158 */     drawElements.drawKeyboard(g, character, 500, 600);
/*     */   }
/*     */   
/*     */   public void paintLightboard(Graphics g, char character) {
/* 162 */     drawElements.drawLightboard(g, character, 500, 350);
/*     */   }
/*     */   
/*     */   public void paintRotors(Graphics g, int count1, int count2, int count3) {
/* 166 */     drawElements.drawRotors(g, 1200, 200, count1, count2, count3);
/*     */   }
/*     */   
/*     */   public void start() {
/* 170 */     this.running = true;
/* 171 */     this.thread = new Thread(this, "Machine");
/* 172 */     this.thread.start();
/*     */   }
/*     */ 
/*     */   
/*     */   public void stop() {
/* 177 */     this.running = false;
/*     */     try {
/* 179 */       this.thread.join();
/* 180 */     } catch (InterruptedException ex) {
/* 181 */       Logger.getLogger(EngimaBody.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */   }
/*     */   
/*     */   public char setPlugs(char input) {
/* 186 */     char result = input;
/*     */     
/* 188 */     if (input == connections[0]) {
/* 189 */       pm.setPlug(input, connections[1]);
/* 190 */       result = pm.sendInput(input);
/* 191 */       return result;
/*     */     } 
/* 193 */     if (input == connections[1]) {
/* 194 */       pm.setPlug(input, connections[0]);
/* 195 */       result = pm.sendInput(input);
/* 196 */       return result;
/*     */     } 
/* 198 */     if (input == connections[2]) {
/* 199 */       pm.setPlug(input, connections[3]);
/* 200 */       result = pm.sendInput(input);
/* 201 */       return result;
/*     */     } 
/* 203 */     if (input == connections[3]) {
/* 204 */       pm.setPlug(input, connections[2]);
/* 205 */       result = pm.sendInput(input);
/* 206 */       return result;
/*     */     } 
/* 208 */     if (input == connections[4]) {
/* 209 */       pm.setPlug(input, connections[5]);
/* 210 */       result = pm.sendInput(input);
/* 211 */       return result;
/*     */     } 
/* 213 */     if (input == connections[5]) {
/* 214 */       pm.setPlug(input, connections[4]);
/* 215 */       result = pm.sendInput(input);
/* 216 */       return result;
/*     */     } 
/* 218 */     if (input == connections[6]) {
/* 219 */       pm.setPlug(input, connections[7]);
/* 220 */       result = pm.sendInput(input);
/* 221 */       return result;
/*     */     } 
/* 223 */     if (input == connections[7]) {
/* 224 */       pm.setPlug(input, connections[6]);
/* 225 */       result = pm.sendInput(input);
/* 226 */       return result;
/*     */     } 
/* 228 */     if (input == connections[8]) {
/* 229 */       pm.setPlug(input, connections[9]);
/* 230 */       result = pm.sendInput(input);
/* 231 */       return result;
/*     */     } 
/* 233 */     if (input == connections[9]) {
/* 234 */       pm.setPlug(input, connections[8]);
/* 235 */       result = pm.sendInput(input);
/* 236 */       return result;
/*     */     } 
/* 238 */     if (input == connections[10]) {
/* 239 */       pm.setPlug(input, connections[11]);
/* 240 */       result = pm.sendInput(input);
/* 241 */       return result;
/*     */     } 
/* 243 */     if (input == connections[11]) {
/* 244 */       pm.setPlug(input, connections[10]);
/* 245 */       result = pm.sendInput(input);
/* 246 */       return result;
/*     */     } 
/* 248 */     if (input == connections[12]) {
/* 249 */       pm.setPlug(input, connections[13]);
/* 250 */       result = pm.sendInput(input);
/* 251 */       return result;
/*     */     } 
/* 253 */     if (input == connections[13]) {
/* 254 */       pm.setPlug(input, connections[12]);
/* 255 */       result = pm.sendInput(input);
/* 256 */       return result;
/*     */     } 
/*     */     
/* 259 */     return result;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private class Key
/*     */     implements KeyListener
/*     */   {
/*     */     public void keyTyped(KeyEvent e) {}
/*     */ 
/*     */     
/*     */     public void keyPressed(KeyEvent e) {
/* 271 */       if (!EngimaBody.this.alreadyPressed) {
/* 272 */         EngimaBody.this.ifKeyPressed = true;
/* 273 */         EngimaBody.this.alreadyPressed = true;
/* 274 */         EngimaBody.oldChar = e.getKeyChar();
/*     */         
/* 276 */         EngimaBody.plugChar = EngimaBody.this.setPlugs(EngimaBody.oldChar);
/* 277 */         EngimaBody.rManager.sendInput(EngimaBody.plugChar);
/* 278 */         EngimaBody.plugChar2 = EngimaBody.rManager.getOutput();
/* 279 */         EngimaBody.newChar = EngimaBody.this.setPlugs(EngimaBody.plugChar2);
/*     */         
/* 281 */         EngimaBody.count1 = EngimaBody.rManager.getCount1();
/* 282 */         EngimaBody.count2 = EngimaBody.rManager.getCount2();
/* 283 */         EngimaBody.count3 = EngimaBody.rManager.getCount3();
/* 284 */         EngimaBody.this.repaint();
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void keyReleased(KeyEvent e) {
/* 291 */       EngimaBody.this.ifKeyPressed = false;
/* 292 */       EngimaBody.this.alreadyPressed = false;
/* 293 */       EngimaBody.this.repaint();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Conner\Downloads\Enigma-1.1-SNAPSHOT.jar!\com\MainBody\EngimaBody.class
 * Java compiler version: 12 (56.0)
 * JD-Core Version:       1.1.3
 */