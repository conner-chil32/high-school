/*      */ package com.Paint;
/*      */ 
/*      */ import java.awt.Color;
/*      */ import java.awt.Font;
/*      */ import java.awt.Graphics;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class drawElements
/*      */ {
/*      */   public static char currentCharPressed;
/*      */   
/*      */   public static void drawCircle(Graphics g, int x, int y, int radius) {
/*   22 */     int diameter = radius * 2;
/*   23 */     g.fillOval(x - radius, y - radius, diameter, diameter);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void drawKeyboard(Graphics g, char currentChar, int x, int y) {
/*   28 */     switch (currentChar) {
/*      */       
/*      */       case 'q':
/*   31 */         g.setColor(Color.WHITE);
/*   32 */         drawCircle(g, 50 + x, 60 + y, 30);
/*   33 */         g.setColor(Color.GRAY);
/*      */ 
/*      */ 
/*      */         
/*   37 */         drawCircle(g, 150 + x, 60 + y, 30);
/*   38 */         drawCircle(g, 250 + x, 60 + y, 30);
/*   39 */         drawCircle(g, 350 + x, 60 + y, 30);
/*   40 */         drawCircle(g, 450 + x, 60 + y, 30);
/*   41 */         drawCircle(g, 550 + x, 60 + y, 30);
/*   42 */         drawCircle(g, 650 + x, 60 + y, 30);
/*   43 */         drawCircle(g, 750 + x, 60 + y, 30);
/*   44 */         drawCircle(g, 850 + x, 60 + y, 30);
/*      */ 
/*      */         
/*   47 */         drawCircle(g, 100 + x, 120 + y, 30);
/*   48 */         drawCircle(g, 200 + x, 120 + y, 30);
/*   49 */         drawCircle(g, 300 + x, 120 + y, 30);
/*   50 */         drawCircle(g, 400 + x, 120 + y, 30);
/*   51 */         drawCircle(g, 500 + x, 120 + y, 30);
/*   52 */         drawCircle(g, 600 + x, 120 + y, 30);
/*   53 */         drawCircle(g, 700 + x, 120 + y, 30);
/*   54 */         drawCircle(g, 800 + x, 120 + y, 30);
/*      */ 
/*      */         
/*   57 */         drawCircle(g, 50 + x, 180 + y, 30);
/*   58 */         drawCircle(g, 150 + x, 180 + y, 30);
/*   59 */         drawCircle(g, 250 + x, 180 + y, 30);
/*   60 */         drawCircle(g, 350 + x, 180 + y, 30);
/*   61 */         drawCircle(g, 450 + x, 180 + y, 30);
/*   62 */         drawCircle(g, 550 + x, 180 + y, 30);
/*   63 */         drawCircle(g, 650 + x, 180 + y, 30);
/*   64 */         drawCircle(g, 750 + x, 180 + y, 30);
/*   65 */         drawCircle(g, 850 + x, 180 + y, 30);
/*      */         break;
/*      */       
/*      */       case 'w':
/*   69 */         g.setColor(Color.WHITE);
/*   70 */         drawCircle(g, 150 + x, 60 + y, 30);
/*   71 */         g.setColor(Color.GRAY);
/*      */ 
/*      */         
/*   74 */         drawCircle(g, 50 + x, 60 + y, 30);
/*      */         
/*   76 */         drawCircle(g, 250 + x, 60 + y, 30);
/*   77 */         drawCircle(g, 350 + x, 60 + y, 30);
/*   78 */         drawCircle(g, 450 + x, 60 + y, 30);
/*   79 */         drawCircle(g, 550 + x, 60 + y, 30);
/*   80 */         drawCircle(g, 650 + x, 60 + y, 30);
/*   81 */         drawCircle(g, 750 + x, 60 + y, 30);
/*   82 */         drawCircle(g, 850 + x, 60 + y, 30);
/*      */ 
/*      */         
/*   85 */         drawCircle(g, 100 + x, 120 + y, 30);
/*   86 */         drawCircle(g, 200 + x, 120 + y, 30);
/*   87 */         drawCircle(g, 300 + x, 120 + y, 30);
/*   88 */         drawCircle(g, 400 + x, 120 + y, 30);
/*   89 */         drawCircle(g, 500 + x, 120 + y, 30);
/*   90 */         drawCircle(g, 600 + x, 120 + y, 30);
/*   91 */         drawCircle(g, 700 + x, 120 + y, 30);
/*   92 */         drawCircle(g, 800 + x, 120 + y, 30);
/*      */ 
/*      */         
/*   95 */         drawCircle(g, 50 + x, 180 + y, 30);
/*   96 */         drawCircle(g, 150 + x, 180 + y, 30);
/*   97 */         drawCircle(g, 250 + x, 180 + y, 30);
/*   98 */         drawCircle(g, 350 + x, 180 + y, 30);
/*   99 */         drawCircle(g, 450 + x, 180 + y, 30);
/*  100 */         drawCircle(g, 550 + x, 180 + y, 30);
/*  101 */         drawCircle(g, 650 + x, 180 + y, 30);
/*  102 */         drawCircle(g, 750 + x, 180 + y, 30);
/*  103 */         drawCircle(g, 850 + x, 180 + y, 30);
/*      */         break;
/*      */       
/*      */       case 'e':
/*  107 */         g.setColor(Color.WHITE);
/*  108 */         drawCircle(g, 250 + x, 60 + y, 30);
/*  109 */         g.setColor(Color.GRAY);
/*      */ 
/*      */         
/*  112 */         drawCircle(g, 50 + x, 60 + y, 30);
/*  113 */         drawCircle(g, 150 + x, 60 + y, 30);
/*      */         
/*  115 */         drawCircle(g, 350 + x, 60 + y, 30);
/*  116 */         drawCircle(g, 450 + x, 60 + y, 30);
/*  117 */         drawCircle(g, 550 + x, 60 + y, 30);
/*  118 */         drawCircle(g, 650 + x, 60 + y, 30);
/*  119 */         drawCircle(g, 750 + x, 60 + y, 30);
/*  120 */         drawCircle(g, 850 + x, 60 + y, 30);
/*      */ 
/*      */         
/*  123 */         drawCircle(g, 100 + x, 120 + y, 30);
/*  124 */         drawCircle(g, 200 + x, 120 + y, 30);
/*  125 */         drawCircle(g, 300 + x, 120 + y, 30);
/*  126 */         drawCircle(g, 400 + x, 120 + y, 30);
/*  127 */         drawCircle(g, 500 + x, 120 + y, 30);
/*  128 */         drawCircle(g, 600 + x, 120 + y, 30);
/*  129 */         drawCircle(g, 700 + x, 120 + y, 30);
/*  130 */         drawCircle(g, 800 + x, 120 + y, 30);
/*      */ 
/*      */         
/*  133 */         drawCircle(g, 50 + x, 180 + y, 30);
/*  134 */         drawCircle(g, 150 + x, 180 + y, 30);
/*  135 */         drawCircle(g, 250 + x, 180 + y, 30);
/*  136 */         drawCircle(g, 350 + x, 180 + y, 30);
/*  137 */         drawCircle(g, 450 + x, 180 + y, 30);
/*  138 */         drawCircle(g, 550 + x, 180 + y, 30);
/*  139 */         drawCircle(g, 650 + x, 180 + y, 30);
/*  140 */         drawCircle(g, 750 + x, 180 + y, 30);
/*  141 */         drawCircle(g, 850 + x, 180 + y, 30);
/*      */         break;
/*      */       
/*      */       case 'r':
/*  145 */         g.setColor(Color.WHITE);
/*  146 */         drawCircle(g, 350 + x, 60 + y, 30);
/*  147 */         g.setColor(Color.GRAY);
/*      */ 
/*      */         
/*  150 */         drawCircle(g, 50 + x, 60 + y, 30);
/*  151 */         drawCircle(g, 150 + x, 60 + y, 30);
/*  152 */         drawCircle(g, 250 + x, 60 + y, 30);
/*      */         
/*  154 */         drawCircle(g, 450 + x, 60 + y, 30);
/*  155 */         drawCircle(g, 550 + x, 60 + y, 30);
/*  156 */         drawCircle(g, 650 + x, 60 + y, 30);
/*  157 */         drawCircle(g, 750 + x, 60 + y, 30);
/*  158 */         drawCircle(g, 850 + x, 60 + y, 30);
/*      */ 
/*      */         
/*  161 */         drawCircle(g, 100 + x, 120 + y, 30);
/*  162 */         drawCircle(g, 200 + x, 120 + y, 30);
/*  163 */         drawCircle(g, 300 + x, 120 + y, 30);
/*  164 */         drawCircle(g, 400 + x, 120 + y, 30);
/*  165 */         drawCircle(g, 500 + x, 120 + y, 30);
/*  166 */         drawCircle(g, 600 + x, 120 + y, 30);
/*  167 */         drawCircle(g, 700 + x, 120 + y, 30);
/*  168 */         drawCircle(g, 800 + x, 120 + y, 30);
/*      */ 
/*      */         
/*  171 */         drawCircle(g, 50 + x, 180 + y, 30);
/*  172 */         drawCircle(g, 150 + x, 180 + y, 30);
/*  173 */         drawCircle(g, 250 + x, 180 + y, 30);
/*  174 */         drawCircle(g, 350 + x, 180 + y, 30);
/*  175 */         drawCircle(g, 450 + x, 180 + y, 30);
/*  176 */         drawCircle(g, 550 + x, 180 + y, 30);
/*  177 */         drawCircle(g, 650 + x, 180 + y, 30);
/*  178 */         drawCircle(g, 750 + x, 180 + y, 30);
/*  179 */         drawCircle(g, 850 + x, 180 + y, 30);
/*      */         break;
/*      */       
/*      */       case 't':
/*  183 */         g.setColor(Color.WHITE);
/*  184 */         drawCircle(g, 450 + x, 60 + y, 30);
/*  185 */         g.setColor(Color.GRAY);
/*      */ 
/*      */         
/*  188 */         drawCircle(g, 50 + x, 60 + y, 30);
/*  189 */         drawCircle(g, 150 + x, 60 + y, 30);
/*  190 */         drawCircle(g, 250 + x, 60 + y, 30);
/*  191 */         drawCircle(g, 350 + x, 60 + y, 30);
/*      */         
/*  193 */         drawCircle(g, 550 + x, 60 + y, 30);
/*  194 */         drawCircle(g, 650 + x, 60 + y, 30);
/*  195 */         drawCircle(g, 750 + x, 60 + y, 30);
/*  196 */         drawCircle(g, 850 + x, 60 + y, 30);
/*      */ 
/*      */         
/*  199 */         drawCircle(g, 100 + x, 120 + y, 30);
/*  200 */         drawCircle(g, 200 + x, 120 + y, 30);
/*  201 */         drawCircle(g, 300 + x, 120 + y, 30);
/*  202 */         drawCircle(g, 400 + x, 120 + y, 30);
/*  203 */         drawCircle(g, 500 + x, 120 + y, 30);
/*  204 */         drawCircle(g, 600 + x, 120 + y, 30);
/*  205 */         drawCircle(g, 700 + x, 120 + y, 30);
/*  206 */         drawCircle(g, 800 + x, 120 + y, 30);
/*      */ 
/*      */         
/*  209 */         drawCircle(g, 50 + x, 180 + y, 30);
/*  210 */         drawCircle(g, 150 + x, 180 + y, 30);
/*  211 */         drawCircle(g, 250 + x, 180 + y, 30);
/*  212 */         drawCircle(g, 350 + x, 180 + y, 30);
/*  213 */         drawCircle(g, 450 + x, 180 + y, 30);
/*  214 */         drawCircle(g, 550 + x, 180 + y, 30);
/*  215 */         drawCircle(g, 650 + x, 180 + y, 30);
/*  216 */         drawCircle(g, 750 + x, 180 + y, 30);
/*  217 */         drawCircle(g, 850 + x, 180 + y, 30);
/*      */         break;
/*      */       
/*      */       case 'y':
/*  221 */         g.setColor(Color.WHITE);
/*  222 */         drawCircle(g, 550 + x, 60 + y, 30);
/*  223 */         g.setColor(Color.GRAY);
/*      */ 
/*      */         
/*  226 */         drawCircle(g, 50 + x, 60 + y, 30);
/*  227 */         drawCircle(g, 150 + x, 60 + y, 30);
/*  228 */         drawCircle(g, 250 + x, 60 + y, 30);
/*  229 */         drawCircle(g, 350 + x, 60 + y, 30);
/*  230 */         drawCircle(g, 450 + x, 60 + y, 30);
/*      */         
/*  232 */         drawCircle(g, 650 + x, 60 + y, 30);
/*  233 */         drawCircle(g, 750 + x, 60 + y, 30);
/*  234 */         drawCircle(g, 850 + x, 60 + y, 30);
/*      */ 
/*      */         
/*  237 */         drawCircle(g, 100 + x, 120 + y, 30);
/*  238 */         drawCircle(g, 200 + x, 120 + y, 30);
/*  239 */         drawCircle(g, 300 + x, 120 + y, 30);
/*  240 */         drawCircle(g, 400 + x, 120 + y, 30);
/*  241 */         drawCircle(g, 500 + x, 120 + y, 30);
/*  242 */         drawCircle(g, 600 + x, 120 + y, 30);
/*  243 */         drawCircle(g, 700 + x, 120 + y, 30);
/*  244 */         drawCircle(g, 800 + x, 120 + y, 30);
/*      */ 
/*      */         
/*  247 */         drawCircle(g, 50 + x, 180 + y, 30);
/*  248 */         drawCircle(g, 150 + x, 180 + y, 30);
/*  249 */         drawCircle(g, 250 + x, 180 + y, 30);
/*  250 */         drawCircle(g, 350 + x, 180 + y, 30);
/*  251 */         drawCircle(g, 450 + x, 180 + y, 30);
/*  252 */         drawCircle(g, 550 + x, 180 + y, 30);
/*  253 */         drawCircle(g, 650 + x, 180 + y, 30);
/*  254 */         drawCircle(g, 750 + x, 180 + y, 30);
/*  255 */         drawCircle(g, 850 + x, 180 + y, 30);
/*      */         break;
/*      */       
/*      */       case 'u':
/*  259 */         g.setColor(Color.WHITE);
/*  260 */         drawCircle(g, 650 + x, 60 + y, 30);
/*  261 */         g.setColor(Color.GRAY);
/*      */ 
/*      */         
/*  264 */         drawCircle(g, 50 + x, 60 + y, 30);
/*  265 */         drawCircle(g, 150 + x, 60 + y, 30);
/*  266 */         drawCircle(g, 250 + x, 60 + y, 30);
/*  267 */         drawCircle(g, 350 + x, 60 + y, 30);
/*  268 */         drawCircle(g, 450 + x, 60 + y, 30);
/*  269 */         drawCircle(g, 550 + x, 60 + y, 30);
/*      */         
/*  271 */         drawCircle(g, 750 + x, 60 + y, 30);
/*  272 */         drawCircle(g, 850 + x, 60 + y, 30);
/*      */ 
/*      */         
/*  275 */         drawCircle(g, 100 + x, 120 + y, 30);
/*  276 */         drawCircle(g, 200 + x, 120 + y, 30);
/*  277 */         drawCircle(g, 300 + x, 120 + y, 30);
/*  278 */         drawCircle(g, 400 + x, 120 + y, 30);
/*  279 */         drawCircle(g, 500 + x, 120 + y, 30);
/*  280 */         drawCircle(g, 600 + x, 120 + y, 30);
/*  281 */         drawCircle(g, 700 + x, 120 + y, 30);
/*  282 */         drawCircle(g, 800 + x, 120 + y, 30);
/*      */ 
/*      */         
/*  285 */         drawCircle(g, 50 + x, 180 + y, 30);
/*  286 */         drawCircle(g, 150 + x, 180 + y, 30);
/*  287 */         drawCircle(g, 250 + x, 180 + y, 30);
/*  288 */         drawCircle(g, 350 + x, 180 + y, 30);
/*  289 */         drawCircle(g, 450 + x, 180 + y, 30);
/*  290 */         drawCircle(g, 550 + x, 180 + y, 30);
/*  291 */         drawCircle(g, 650 + x, 180 + y, 30);
/*  292 */         drawCircle(g, 750 + x, 180 + y, 30);
/*  293 */         drawCircle(g, 850 + x, 180 + y, 30);
/*      */         break;
/*      */       
/*      */       case 'i':
/*  297 */         g.setColor(Color.WHITE);
/*  298 */         drawCircle(g, 750 + x, 60 + y, 30);
/*  299 */         g.setColor(Color.GRAY);
/*      */ 
/*      */         
/*  302 */         drawCircle(g, 50 + x, 60 + y, 30);
/*  303 */         drawCircle(g, 150 + x, 60 + y, 30);
/*  304 */         drawCircle(g, 250 + x, 60 + y, 30);
/*  305 */         drawCircle(g, 350 + x, 60 + y, 30);
/*  306 */         drawCircle(g, 450 + x, 60 + y, 30);
/*  307 */         drawCircle(g, 550 + x, 60 + y, 30);
/*  308 */         drawCircle(g, 650 + x, 60 + y, 30);
/*      */         
/*  310 */         drawCircle(g, 850 + x, 60 + y, 30);
/*      */ 
/*      */         
/*  313 */         drawCircle(g, 100 + x, 120 + y, 30);
/*  314 */         drawCircle(g, 200 + x, 120 + y, 30);
/*  315 */         drawCircle(g, 300 + x, 120 + y, 30);
/*  316 */         drawCircle(g, 400 + x, 120 + y, 30);
/*  317 */         drawCircle(g, 500 + x, 120 + y, 30);
/*  318 */         drawCircle(g, 600 + x, 120 + y, 30);
/*  319 */         drawCircle(g, 700 + x, 120 + y, 30);
/*  320 */         drawCircle(g, 800 + x, 120 + y, 30);
/*      */ 
/*      */         
/*  323 */         drawCircle(g, 50 + x, 180 + y, 30);
/*  324 */         drawCircle(g, 150 + x, 180 + y, 30);
/*  325 */         drawCircle(g, 250 + x, 180 + y, 30);
/*  326 */         drawCircle(g, 350 + x, 180 + y, 30);
/*  327 */         drawCircle(g, 450 + x, 180 + y, 30);
/*  328 */         drawCircle(g, 550 + x, 180 + y, 30);
/*  329 */         drawCircle(g, 650 + x, 180 + y, 30);
/*  330 */         drawCircle(g, 750 + x, 180 + y, 30);
/*  331 */         drawCircle(g, 850 + x, 180 + y, 30);
/*      */         break;
/*      */       
/*      */       case 'o':
/*  335 */         g.setColor(Color.WHITE);
/*  336 */         drawCircle(g, 850 + x, 60 + y, 30);
/*  337 */         g.setColor(Color.GRAY);
/*      */ 
/*      */         
/*  340 */         drawCircle(g, 50 + x, 60 + y, 30);
/*  341 */         drawCircle(g, 150 + x, 60 + y, 30);
/*  342 */         drawCircle(g, 250 + x, 60 + y, 30);
/*  343 */         drawCircle(g, 350 + x, 60 + y, 30);
/*  344 */         drawCircle(g, 450 + x, 60 + y, 30);
/*  345 */         drawCircle(g, 550 + x, 60 + y, 30);
/*  346 */         drawCircle(g, 650 + x, 60 + y, 30);
/*  347 */         drawCircle(g, 750 + x, 60 + y, 30);
/*      */ 
/*      */ 
/*      */         
/*  351 */         drawCircle(g, 100 + x, 120 + y, 30);
/*  352 */         drawCircle(g, 200 + x, 120 + y, 30);
/*  353 */         drawCircle(g, 300 + x, 120 + y, 30);
/*  354 */         drawCircle(g, 400 + x, 120 + y, 30);
/*  355 */         drawCircle(g, 500 + x, 120 + y, 30);
/*  356 */         drawCircle(g, 600 + x, 120 + y, 30);
/*  357 */         drawCircle(g, 700 + x, 120 + y, 30);
/*  358 */         drawCircle(g, 800 + x, 120 + y, 30);
/*      */ 
/*      */         
/*  361 */         drawCircle(g, 50 + x, 180 + y, 30);
/*  362 */         drawCircle(g, 150 + x, 180 + y, 30);
/*  363 */         drawCircle(g, 250 + x, 180 + y, 30);
/*  364 */         drawCircle(g, 350 + x, 180 + y, 30);
/*  365 */         drawCircle(g, 450 + x, 180 + y, 30);
/*  366 */         drawCircle(g, 550 + x, 180 + y, 30);
/*  367 */         drawCircle(g, 650 + x, 180 + y, 30);
/*  368 */         drawCircle(g, 750 + x, 180 + y, 30);
/*  369 */         drawCircle(g, 850 + x, 180 + y, 30);
/*      */         break;
/*      */       
/*      */       case 'p':
/*  373 */         g.setColor(Color.WHITE);
/*  374 */         drawCircle(g, 100 + x, 120 + y, 30);
/*  375 */         g.setColor(Color.GRAY);
/*      */ 
/*      */         
/*  378 */         drawCircle(g, 50 + x, 60 + y, 30);
/*  379 */         drawCircle(g, 150 + x, 60 + y, 30);
/*  380 */         drawCircle(g, 250 + x, 60 + y, 30);
/*  381 */         drawCircle(g, 350 + x, 60 + y, 30);
/*  382 */         drawCircle(g, 450 + x, 60 + y, 30);
/*  383 */         drawCircle(g, 550 + x, 60 + y, 30);
/*  384 */         drawCircle(g, 650 + x, 60 + y, 30);
/*  385 */         drawCircle(g, 750 + x, 60 + y, 30);
/*  386 */         drawCircle(g, 850 + x, 60 + y, 30);
/*      */ 
/*      */ 
/*      */         
/*  390 */         drawCircle(g, 200 + x, 120 + y, 30);
/*  391 */         drawCircle(g, 300 + x, 120 + y, 30);
/*  392 */         drawCircle(g, 400 + x, 120 + y, 30);
/*  393 */         drawCircle(g, 500 + x, 120 + y, 30);
/*  394 */         drawCircle(g, 600 + x, 120 + y, 30);
/*  395 */         drawCircle(g, 700 + x, 120 + y, 30);
/*  396 */         drawCircle(g, 800 + x, 120 + y, 30);
/*      */ 
/*      */         
/*  399 */         drawCircle(g, 50 + x, 180 + y, 30);
/*  400 */         drawCircle(g, 150 + x, 180 + y, 30);
/*  401 */         drawCircle(g, 250 + x, 180 + y, 30);
/*  402 */         drawCircle(g, 350 + x, 180 + y, 30);
/*  403 */         drawCircle(g, 450 + x, 180 + y, 30);
/*  404 */         drawCircle(g, 550 + x, 180 + y, 30);
/*  405 */         drawCircle(g, 650 + x, 180 + y, 30);
/*  406 */         drawCircle(g, 750 + x, 180 + y, 30);
/*  407 */         drawCircle(g, 850 + x, 180 + y, 30);
/*      */         break;
/*      */       
/*      */       case 'a':
/*  411 */         g.setColor(Color.WHITE);
/*  412 */         drawCircle(g, 200 + x, 120 + y, 30);
/*  413 */         g.setColor(Color.GRAY);
/*      */ 
/*      */         
/*  416 */         drawCircle(g, 50 + x, 60 + y, 30);
/*  417 */         drawCircle(g, 150 + x, 60 + y, 30);
/*  418 */         drawCircle(g, 250 + x, 60 + y, 30);
/*  419 */         drawCircle(g, 350 + x, 60 + y, 30);
/*  420 */         drawCircle(g, 450 + x, 60 + y, 30);
/*  421 */         drawCircle(g, 550 + x, 60 + y, 30);
/*  422 */         drawCircle(g, 650 + x, 60 + y, 30);
/*  423 */         drawCircle(g, 750 + x, 60 + y, 30);
/*  424 */         drawCircle(g, 850 + x, 60 + y, 30);
/*      */ 
/*      */         
/*  427 */         drawCircle(g, 100 + x, 120 + y, 30);
/*      */         
/*  429 */         drawCircle(g, 300 + x, 120 + y, 30);
/*  430 */         drawCircle(g, 400 + x, 120 + y, 30);
/*  431 */         drawCircle(g, 500 + x, 120 + y, 30);
/*  432 */         drawCircle(g, 600 + x, 120 + y, 30);
/*  433 */         drawCircle(g, 700 + x, 120 + y, 30);
/*  434 */         drawCircle(g, 800 + x, 120 + y, 30);
/*      */ 
/*      */         
/*  437 */         drawCircle(g, 50 + x, 180 + y, 30);
/*  438 */         drawCircle(g, 150 + x, 180 + y, 30);
/*  439 */         drawCircle(g, 250 + x, 180 + y, 30);
/*  440 */         drawCircle(g, 350 + x, 180 + y, 30);
/*  441 */         drawCircle(g, 450 + x, 180 + y, 30);
/*  442 */         drawCircle(g, 550 + x, 180 + y, 30);
/*  443 */         drawCircle(g, 650 + x, 180 + y, 30);
/*  444 */         drawCircle(g, 750 + x, 180 + y, 30);
/*  445 */         drawCircle(g, 850 + x, 180 + y, 30);
/*      */         break;
/*      */       
/*      */       case 's':
/*  449 */         g.setColor(Color.WHITE);
/*  450 */         drawCircle(g, 300 + x, 120 + y, 30);
/*  451 */         g.setColor(Color.GRAY);
/*      */ 
/*      */         
/*  454 */         drawCircle(g, 50 + x, 60 + y, 30);
/*  455 */         drawCircle(g, 150 + x, 60 + y, 30);
/*  456 */         drawCircle(g, 250 + x, 60 + y, 30);
/*  457 */         drawCircle(g, 350 + x, 60 + y, 30);
/*  458 */         drawCircle(g, 450 + x, 60 + y, 30);
/*  459 */         drawCircle(g, 550 + x, 60 + y, 30);
/*  460 */         drawCircle(g, 650 + x, 60 + y, 30);
/*  461 */         drawCircle(g, 750 + x, 60 + y, 30);
/*  462 */         drawCircle(g, 850 + x, 60 + y, 30);
/*      */ 
/*      */         
/*  465 */         drawCircle(g, 100 + x, 120 + y, 30);
/*  466 */         drawCircle(g, 200 + x, 120 + y, 30);
/*      */         
/*  468 */         drawCircle(g, 400 + x, 120 + y, 30);
/*  469 */         drawCircle(g, 500 + x, 120 + y, 30);
/*  470 */         drawCircle(g, 600 + x, 120 + y, 30);
/*  471 */         drawCircle(g, 700 + x, 120 + y, 30);
/*  472 */         drawCircle(g, 800 + x, 120 + y, 30);
/*      */ 
/*      */         
/*  475 */         drawCircle(g, 50 + x, 180 + y, 30);
/*  476 */         drawCircle(g, 150 + x, 180 + y, 30);
/*  477 */         drawCircle(g, 250 + x, 180 + y, 30);
/*  478 */         drawCircle(g, 350 + x, 180 + y, 30);
/*  479 */         drawCircle(g, 450 + x, 180 + y, 30);
/*  480 */         drawCircle(g, 550 + x, 180 + y, 30);
/*  481 */         drawCircle(g, 650 + x, 180 + y, 30);
/*  482 */         drawCircle(g, 750 + x, 180 + y, 30);
/*  483 */         drawCircle(g, 850 + x, 180 + y, 30);
/*      */         break;
/*      */       
/*      */       case 'd':
/*  487 */         g.setColor(Color.WHITE);
/*  488 */         drawCircle(g, 400 + x, 120 + y, 30);
/*  489 */         g.setColor(Color.GRAY);
/*      */ 
/*      */         
/*  492 */         drawCircle(g, 50 + x, 60 + y, 30);
/*  493 */         drawCircle(g, 150 + x, 60 + y, 30);
/*  494 */         drawCircle(g, 250 + x, 60 + y, 30);
/*  495 */         drawCircle(g, 350 + x, 60 + y, 30);
/*  496 */         drawCircle(g, 450 + x, 60 + y, 30);
/*  497 */         drawCircle(g, 550 + x, 60 + y, 30);
/*  498 */         drawCircle(g, 650 + x, 60 + y, 30);
/*  499 */         drawCircle(g, 750 + x, 60 + y, 30);
/*  500 */         drawCircle(g, 850 + x, 60 + y, 30);
/*      */ 
/*      */         
/*  503 */         drawCircle(g, 100 + x, 120 + y, 30);
/*  504 */         drawCircle(g, 200 + x, 120 + y, 30);
/*  505 */         drawCircle(g, 300 + x, 120 + y, 30);
/*      */         
/*  507 */         drawCircle(g, 500 + x, 120 + y, 30);
/*  508 */         drawCircle(g, 600 + x, 120 + y, 30);
/*  509 */         drawCircle(g, 700 + x, 120 + y, 30);
/*  510 */         drawCircle(g, 800 + x, 120 + y, 30);
/*      */ 
/*      */         
/*  513 */         drawCircle(g, 50 + x, 180 + y, 30);
/*  514 */         drawCircle(g, 150 + x, 180 + y, 30);
/*  515 */         drawCircle(g, 250 + x, 180 + y, 30);
/*  516 */         drawCircle(g, 350 + x, 180 + y, 30);
/*  517 */         drawCircle(g, 450 + x, 180 + y, 30);
/*  518 */         drawCircle(g, 550 + x, 180 + y, 30);
/*  519 */         drawCircle(g, 650 + x, 180 + y, 30);
/*  520 */         drawCircle(g, 750 + x, 180 + y, 30);
/*  521 */         drawCircle(g, 850 + x, 180 + y, 30);
/*      */         break;
/*      */       
/*      */       case 'f':
/*  525 */         g.setColor(Color.WHITE);
/*  526 */         drawCircle(g, 500 + x, 120 + y, 30);
/*  527 */         g.setColor(Color.GRAY);
/*      */ 
/*      */         
/*  530 */         drawCircle(g, 50 + x, 60 + y, 30);
/*  531 */         drawCircle(g, 150 + x, 60 + y, 30);
/*  532 */         drawCircle(g, 250 + x, 60 + y, 30);
/*  533 */         drawCircle(g, 350 + x, 60 + y, 30);
/*  534 */         drawCircle(g, 450 + x, 60 + y, 30);
/*  535 */         drawCircle(g, 550 + x, 60 + y, 30);
/*  536 */         drawCircle(g, 650 + x, 60 + y, 30);
/*  537 */         drawCircle(g, 750 + x, 60 + y, 30);
/*  538 */         drawCircle(g, 850 + x, 60 + y, 30);
/*      */ 
/*      */         
/*  541 */         drawCircle(g, 100 + x, 120 + y, 30);
/*  542 */         drawCircle(g, 200 + x, 120 + y, 30);
/*  543 */         drawCircle(g, 300 + x, 120 + y, 30);
/*  544 */         drawCircle(g, 400 + x, 120 + y, 30);
/*      */         
/*  546 */         drawCircle(g, 600 + x, 120 + y, 30);
/*  547 */         drawCircle(g, 700 + x, 120 + y, 30);
/*  548 */         drawCircle(g, 800 + x, 120 + y, 30);
/*      */ 
/*      */         
/*  551 */         drawCircle(g, 50 + x, 180 + y, 30);
/*  552 */         drawCircle(g, 150 + x, 180 + y, 30);
/*  553 */         drawCircle(g, 250 + x, 180 + y, 30);
/*  554 */         drawCircle(g, 350 + x, 180 + y, 30);
/*  555 */         drawCircle(g, 450 + x, 180 + y, 30);
/*  556 */         drawCircle(g, 550 + x, 180 + y, 30);
/*  557 */         drawCircle(g, 650 + x, 180 + y, 30);
/*  558 */         drawCircle(g, 750 + x, 180 + y, 30);
/*  559 */         drawCircle(g, 850 + x, 180 + y, 30);
/*      */         break;
/*      */       
/*      */       case 'g':
/*  563 */         g.setColor(Color.WHITE);
/*  564 */         drawCircle(g, 600 + x, 120 + y, 30);
/*  565 */         g.setColor(Color.GRAY);
/*      */ 
/*      */         
/*  568 */         drawCircle(g, 50 + x, 60 + y, 30);
/*  569 */         drawCircle(g, 150 + x, 60 + y, 30);
/*  570 */         drawCircle(g, 250 + x, 60 + y, 30);
/*  571 */         drawCircle(g, 350 + x, 60 + y, 30);
/*  572 */         drawCircle(g, 450 + x, 60 + y, 30);
/*  573 */         drawCircle(g, 550 + x, 60 + y, 30);
/*  574 */         drawCircle(g, 650 + x, 60 + y, 30);
/*  575 */         drawCircle(g, 750 + x, 60 + y, 30);
/*  576 */         drawCircle(g, 850 + x, 60 + y, 30);
/*      */ 
/*      */         
/*  579 */         drawCircle(g, 100 + x, 120 + y, 30);
/*  580 */         drawCircle(g, 200 + x, 120 + y, 30);
/*  581 */         drawCircle(g, 300 + x, 120 + y, 30);
/*  582 */         drawCircle(g, 400 + x, 120 + y, 30);
/*  583 */         drawCircle(g, 500 + x, 120 + y, 30);
/*      */         
/*  585 */         drawCircle(g, 700 + x, 120 + y, 30);
/*  586 */         drawCircle(g, 800 + x, 120 + y, 30);
/*      */ 
/*      */         
/*  589 */         drawCircle(g, 50 + x, 180 + y, 30);
/*  590 */         drawCircle(g, 150 + x, 180 + y, 30);
/*  591 */         drawCircle(g, 250 + x, 180 + y, 30);
/*  592 */         drawCircle(g, 350 + x, 180 + y, 30);
/*  593 */         drawCircle(g, 450 + x, 180 + y, 30);
/*  594 */         drawCircle(g, 550 + x, 180 + y, 30);
/*  595 */         drawCircle(g, 650 + x, 180 + y, 30);
/*  596 */         drawCircle(g, 750 + x, 180 + y, 30);
/*  597 */         drawCircle(g, 850 + x, 180 + y, 30);
/*      */         break;
/*      */       
/*      */       case 'h':
/*  601 */         g.setColor(Color.WHITE);
/*  602 */         drawCircle(g, 700 + x, 120 + y, 30);
/*  603 */         g.setColor(Color.GRAY);
/*      */ 
/*      */         
/*  606 */         drawCircle(g, 50 + x, 60 + y, 30);
/*  607 */         drawCircle(g, 150 + x, 60 + y, 30);
/*  608 */         drawCircle(g, 250 + x, 60 + y, 30);
/*  609 */         drawCircle(g, 350 + x, 60 + y, 30);
/*  610 */         drawCircle(g, 450 + x, 60 + y, 30);
/*  611 */         drawCircle(g, 550 + x, 60 + y, 30);
/*  612 */         drawCircle(g, 650 + x, 60 + y, 30);
/*  613 */         drawCircle(g, 750 + x, 60 + y, 30);
/*  614 */         drawCircle(g, 850 + x, 60 + y, 30);
/*      */ 
/*      */         
/*  617 */         drawCircle(g, 100 + x, 120 + y, 30);
/*  618 */         drawCircle(g, 200 + x, 120 + y, 30);
/*  619 */         drawCircle(g, 300 + x, 120 + y, 30);
/*  620 */         drawCircle(g, 400 + x, 120 + y, 30);
/*  621 */         drawCircle(g, 500 + x, 120 + y, 30);
/*  622 */         drawCircle(g, 600 + x, 120 + y, 30);
/*      */         
/*  624 */         drawCircle(g, 800 + x, 120 + y, 30);
/*      */ 
/*      */         
/*  627 */         drawCircle(g, 50 + x, 180 + y, 30);
/*  628 */         drawCircle(g, 150 + x, 180 + y, 30);
/*  629 */         drawCircle(g, 250 + x, 180 + y, 30);
/*  630 */         drawCircle(g, 350 + x, 180 + y, 30);
/*  631 */         drawCircle(g, 450 + x, 180 + y, 30);
/*  632 */         drawCircle(g, 550 + x, 180 + y, 30);
/*  633 */         drawCircle(g, 650 + x, 180 + y, 30);
/*  634 */         drawCircle(g, 750 + x, 180 + y, 30);
/*  635 */         drawCircle(g, 850 + x, 180 + y, 30);
/*      */         break;
/*      */       
/*      */       case 'j':
/*  639 */         g.setColor(Color.WHITE);
/*  640 */         drawCircle(g, 800 + x, 120 + y, 30);
/*  641 */         g.setColor(Color.GRAY);
/*      */ 
/*      */         
/*  644 */         drawCircle(g, 50 + x, 60 + y, 30);
/*  645 */         drawCircle(g, 150 + x, 60 + y, 30);
/*  646 */         drawCircle(g, 250 + x, 60 + y, 30);
/*  647 */         drawCircle(g, 350 + x, 60 + y, 30);
/*  648 */         drawCircle(g, 450 + x, 60 + y, 30);
/*  649 */         drawCircle(g, 550 + x, 60 + y, 30);
/*  650 */         drawCircle(g, 650 + x, 60 + y, 30);
/*  651 */         drawCircle(g, 750 + x, 60 + y, 30);
/*  652 */         drawCircle(g, 850 + x, 60 + y, 30);
/*      */ 
/*      */         
/*  655 */         drawCircle(g, 100 + x, 120 + y, 30);
/*  656 */         drawCircle(g, 200 + x, 120 + y, 30);
/*  657 */         drawCircle(g, 300 + x, 120 + y, 30);
/*  658 */         drawCircle(g, 400 + x, 120 + y, 30);
/*  659 */         drawCircle(g, 500 + x, 120 + y, 30);
/*  660 */         drawCircle(g, 600 + x, 120 + y, 30);
/*  661 */         drawCircle(g, 700 + x, 120 + y, 30);
/*      */ 
/*      */ 
/*      */         
/*  665 */         drawCircle(g, 50 + x, 180 + y, 30);
/*  666 */         drawCircle(g, 150 + x, 180 + y, 30);
/*  667 */         drawCircle(g, 250 + x, 180 + y, 30);
/*  668 */         drawCircle(g, 350 + x, 180 + y, 30);
/*  669 */         drawCircle(g, 450 + x, 180 + y, 30);
/*  670 */         drawCircle(g, 550 + x, 180 + y, 30);
/*  671 */         drawCircle(g, 650 + x, 180 + y, 30);
/*  672 */         drawCircle(g, 750 + x, 180 + y, 30);
/*  673 */         drawCircle(g, 850 + x, 180 + y, 30);
/*      */         break;
/*      */       
/*      */       case 'k':
/*  677 */         g.setColor(Color.WHITE);
/*  678 */         drawCircle(g, 50 + x, 180 + y, 30);
/*  679 */         g.setColor(Color.GRAY);
/*      */ 
/*      */         
/*  682 */         drawCircle(g, 50 + x, 60 + y, 30);
/*  683 */         drawCircle(g, 150 + x, 60 + y, 30);
/*  684 */         drawCircle(g, 250 + x, 60 + y, 30);
/*  685 */         drawCircle(g, 350 + x, 60 + y, 30);
/*  686 */         drawCircle(g, 450 + x, 60 + y, 30);
/*  687 */         drawCircle(g, 550 + x, 60 + y, 30);
/*  688 */         drawCircle(g, 650 + x, 60 + y, 30);
/*  689 */         drawCircle(g, 750 + x, 60 + y, 30);
/*  690 */         drawCircle(g, 850 + x, 60 + y, 30);
/*      */ 
/*      */         
/*  693 */         drawCircle(g, 100 + x, 120 + y, 30);
/*  694 */         drawCircle(g, 200 + x, 120 + y, 30);
/*  695 */         drawCircle(g, 300 + x, 120 + y, 30);
/*  696 */         drawCircle(g, 400 + x, 120 + y, 30);
/*  697 */         drawCircle(g, 500 + x, 120 + y, 30);
/*  698 */         drawCircle(g, 600 + x, 120 + y, 30);
/*  699 */         drawCircle(g, 700 + x, 120 + y, 30);
/*  700 */         drawCircle(g, 800 + x, 120 + y, 30);
/*      */ 
/*      */ 
/*      */         
/*  704 */         drawCircle(g, 150 + x, 180 + y, 30);
/*  705 */         drawCircle(g, 250 + x, 180 + y, 30);
/*  706 */         drawCircle(g, 350 + x, 180 + y, 30);
/*  707 */         drawCircle(g, 450 + x, 180 + y, 30);
/*  708 */         drawCircle(g, 550 + x, 180 + y, 30);
/*  709 */         drawCircle(g, 650 + x, 180 + y, 30);
/*  710 */         drawCircle(g, 750 + x, 180 + y, 30);
/*  711 */         drawCircle(g, 850 + x, 180 + y, 30);
/*      */         break;
/*      */       
/*      */       case 'l':
/*  715 */         g.setColor(Color.WHITE);
/*  716 */         drawCircle(g, 150 + x, 180 + y, 30);
/*  717 */         g.setColor(Color.GRAY);
/*      */ 
/*      */         
/*  720 */         drawCircle(g, 50 + x, 60 + y, 30);
/*  721 */         drawCircle(g, 150 + x, 60 + y, 30);
/*  722 */         drawCircle(g, 250 + x, 60 + y, 30);
/*  723 */         drawCircle(g, 350 + x, 60 + y, 30);
/*  724 */         drawCircle(g, 450 + x, 60 + y, 30);
/*  725 */         drawCircle(g, 550 + x, 60 + y, 30);
/*  726 */         drawCircle(g, 650 + x, 60 + y, 30);
/*  727 */         drawCircle(g, 750 + x, 60 + y, 30);
/*  728 */         drawCircle(g, 850 + x, 60 + y, 30);
/*      */ 
/*      */         
/*  731 */         drawCircle(g, 100 + x, 120 + y, 30);
/*  732 */         drawCircle(g, 200 + x, 120 + y, 30);
/*  733 */         drawCircle(g, 300 + x, 120 + y, 30);
/*  734 */         drawCircle(g, 400 + x, 120 + y, 30);
/*  735 */         drawCircle(g, 500 + x, 120 + y, 30);
/*  736 */         drawCircle(g, 600 + x, 120 + y, 30);
/*  737 */         drawCircle(g, 700 + x, 120 + y, 30);
/*  738 */         drawCircle(g, 800 + x, 120 + y, 30);
/*      */ 
/*      */         
/*  741 */         drawCircle(g, 50 + x, 180 + y, 30);
/*      */         
/*  743 */         drawCircle(g, 250 + x, 180 + y, 30);
/*  744 */         drawCircle(g, 350 + x, 180 + y, 30);
/*  745 */         drawCircle(g, 450 + x, 180 + y, 30);
/*  746 */         drawCircle(g, 550 + x, 180 + y, 30);
/*  747 */         drawCircle(g, 650 + x, 180 + y, 30);
/*  748 */         drawCircle(g, 750 + x, 180 + y, 30);
/*  749 */         drawCircle(g, 850 + x, 180 + y, 30);
/*      */         break;
/*      */       
/*      */       case 'z':
/*  753 */         g.setColor(Color.WHITE);
/*  754 */         drawCircle(g, 250 + x, 180 + y, 30);
/*  755 */         g.setColor(Color.GRAY);
/*      */ 
/*      */         
/*  758 */         drawCircle(g, 50 + x, 60 + y, 30);
/*  759 */         drawCircle(g, 150 + x, 60 + y, 30);
/*  760 */         drawCircle(g, 250 + x, 60 + y, 30);
/*  761 */         drawCircle(g, 350 + x, 60 + y, 30);
/*  762 */         drawCircle(g, 450 + x, 60 + y, 30);
/*  763 */         drawCircle(g, 550 + x, 60 + y, 30);
/*  764 */         drawCircle(g, 650 + x, 60 + y, 30);
/*  765 */         drawCircle(g, 750 + x, 60 + y, 30);
/*  766 */         drawCircle(g, 850 + x, 60 + y, 30);
/*      */ 
/*      */         
/*  769 */         drawCircle(g, 100 + x, 120 + y, 30);
/*  770 */         drawCircle(g, 200 + x, 120 + y, 30);
/*  771 */         drawCircle(g, 300 + x, 120 + y, 30);
/*  772 */         drawCircle(g, 400 + x, 120 + y, 30);
/*  773 */         drawCircle(g, 500 + x, 120 + y, 30);
/*  774 */         drawCircle(g, 600 + x, 120 + y, 30);
/*  775 */         drawCircle(g, 700 + x, 120 + y, 30);
/*  776 */         drawCircle(g, 800 + x, 120 + y, 30);
/*      */ 
/*      */         
/*  779 */         drawCircle(g, 50 + x, 180 + y, 30);
/*  780 */         drawCircle(g, 150 + x, 180 + y, 30);
/*      */         
/*  782 */         drawCircle(g, 350 + x, 180 + y, 30);
/*  783 */         drawCircle(g, 450 + x, 180 + y, 30);
/*  784 */         drawCircle(g, 550 + x, 180 + y, 30);
/*  785 */         drawCircle(g, 650 + x, 180 + y, 30);
/*  786 */         drawCircle(g, 750 + x, 180 + y, 30);
/*  787 */         drawCircle(g, 850 + x, 180 + y, 30);
/*      */         break;
/*      */       
/*      */       case 'x':
/*  791 */         g.setColor(Color.WHITE);
/*      */         
/*  793 */         drawCircle(g, 350 + x, 180 + y, 30);
/*  794 */         g.setColor(Color.GRAY);
/*      */ 
/*      */         
/*  797 */         drawCircle(g, 50 + x, 60 + y, 30);
/*  798 */         drawCircle(g, 150 + x, 60 + y, 30);
/*  799 */         drawCircle(g, 250 + x, 60 + y, 30);
/*  800 */         drawCircle(g, 350 + x, 60 + y, 30);
/*  801 */         drawCircle(g, 450 + x, 60 + y, 30);
/*  802 */         drawCircle(g, 550 + x, 60 + y, 30);
/*  803 */         drawCircle(g, 650 + x, 60 + y, 30);
/*  804 */         drawCircle(g, 750 + x, 60 + y, 30);
/*  805 */         drawCircle(g, 850 + x, 60 + y, 30);
/*      */ 
/*      */         
/*  808 */         drawCircle(g, 100 + x, 120 + y, 30);
/*  809 */         drawCircle(g, 200 + x, 120 + y, 30);
/*  810 */         drawCircle(g, 300 + x, 120 + y, 30);
/*  811 */         drawCircle(g, 400 + x, 120 + y, 30);
/*  812 */         drawCircle(g, 500 + x, 120 + y, 30);
/*  813 */         drawCircle(g, 600 + x, 120 + y, 30);
/*  814 */         drawCircle(g, 700 + x, 120 + y, 30);
/*  815 */         drawCircle(g, 800 + x, 120 + y, 30);
/*      */ 
/*      */         
/*  818 */         drawCircle(g, 50 + x, 180 + y, 30);
/*  819 */         drawCircle(g, 150 + x, 180 + y, 30);
/*  820 */         drawCircle(g, 250 + x, 180 + y, 30);
/*      */         
/*  822 */         drawCircle(g, 450 + x, 180 + y, 30);
/*  823 */         drawCircle(g, 550 + x, 180 + y, 30);
/*  824 */         drawCircle(g, 650 + x, 180 + y, 30);
/*  825 */         drawCircle(g, 750 + x, 180 + y, 30);
/*  826 */         drawCircle(g, 850 + x, 180 + y, 30);
/*      */         break;
/*      */       
/*      */       case 'c':
/*  830 */         g.setColor(Color.WHITE);
/*  831 */         drawCircle(g, 450 + x, 180 + y, 30);
/*  832 */         g.setColor(Color.GRAY);
/*      */ 
/*      */         
/*  835 */         drawCircle(g, 50 + x, 60 + y, 30);
/*  836 */         drawCircle(g, 150 + x, 60 + y, 30);
/*  837 */         drawCircle(g, 250 + x, 60 + y, 30);
/*  838 */         drawCircle(g, 350 + x, 60 + y, 30);
/*  839 */         drawCircle(g, 450 + x, 60 + y, 30);
/*  840 */         drawCircle(g, 550 + x, 60 + y, 30);
/*  841 */         drawCircle(g, 650 + x, 60 + y, 30);
/*  842 */         drawCircle(g, 750 + x, 60 + y, 30);
/*  843 */         drawCircle(g, 850 + x, 60 + y, 30);
/*      */ 
/*      */         
/*  846 */         drawCircle(g, 100 + x, 120 + y, 30);
/*  847 */         drawCircle(g, 200 + x, 120 + y, 30);
/*  848 */         drawCircle(g, 300 + x, 120 + y, 30);
/*  849 */         drawCircle(g, 400 + x, 120 + y, 30);
/*  850 */         drawCircle(g, 500 + x, 120 + y, 30);
/*  851 */         drawCircle(g, 600 + x, 120 + y, 30);
/*  852 */         drawCircle(g, 700 + x, 120 + y, 30);
/*  853 */         drawCircle(g, 800 + x, 120 + y, 30);
/*      */ 
/*      */         
/*  856 */         drawCircle(g, 50 + x, 180 + y, 30);
/*  857 */         drawCircle(g, 150 + x, 180 + y, 30);
/*  858 */         drawCircle(g, 250 + x, 180 + y, 30);
/*  859 */         drawCircle(g, 350 + x, 180 + y, 30);
/*      */         
/*  861 */         drawCircle(g, 550 + x, 180 + y, 30);
/*  862 */         drawCircle(g, 650 + x, 180 + y, 30);
/*  863 */         drawCircle(g, 750 + x, 180 + y, 30);
/*  864 */         drawCircle(g, 850 + x, 180 + y, 30);
/*      */         break;
/*      */       
/*      */       case 'v':
/*  868 */         g.setColor(Color.WHITE);
/*  869 */         drawCircle(g, 550 + x, 180 + y, 30);
/*  870 */         g.setColor(Color.GRAY);
/*      */ 
/*      */         
/*  873 */         drawCircle(g, 50 + x, 60 + y, 30);
/*  874 */         drawCircle(g, 150 + x, 60 + y, 30);
/*  875 */         drawCircle(g, 250 + x, 60 + y, 30);
/*  876 */         drawCircle(g, 350 + x, 60 + y, 30);
/*  877 */         drawCircle(g, 450 + x, 60 + y, 30);
/*  878 */         drawCircle(g, 550 + x, 60 + y, 30);
/*  879 */         drawCircle(g, 650 + x, 60 + y, 30);
/*  880 */         drawCircle(g, 750 + x, 60 + y, 30);
/*  881 */         drawCircle(g, 850 + x, 60 + y, 30);
/*      */ 
/*      */         
/*  884 */         drawCircle(g, 100 + x, 120 + y, 30);
/*  885 */         drawCircle(g, 200 + x, 120 + y, 30);
/*  886 */         drawCircle(g, 300 + x, 120 + y, 30);
/*  887 */         drawCircle(g, 400 + x, 120 + y, 30);
/*  888 */         drawCircle(g, 500 + x, 120 + y, 30);
/*  889 */         drawCircle(g, 600 + x, 120 + y, 30);
/*  890 */         drawCircle(g, 700 + x, 120 + y, 30);
/*  891 */         drawCircle(g, 800 + x, 120 + y, 30);
/*      */ 
/*      */         
/*  894 */         drawCircle(g, 50 + x, 180 + y, 30);
/*  895 */         drawCircle(g, 150 + x, 180 + y, 30);
/*  896 */         drawCircle(g, 250 + x, 180 + y, 30);
/*  897 */         drawCircle(g, 350 + x, 180 + y, 30);
/*  898 */         drawCircle(g, 450 + x, 180 + y, 30);
/*      */         
/*  900 */         drawCircle(g, 650 + x, 180 + y, 30);
/*  901 */         drawCircle(g, 750 + x, 180 + y, 30);
/*  902 */         drawCircle(g, 850 + x, 180 + y, 30);
/*      */         break;
/*      */       
/*      */       case 'b':
/*  906 */         g.setColor(Color.WHITE);
/*  907 */         drawCircle(g, 650 + x, 180 + y, 30);
/*  908 */         g.setColor(Color.GRAY);
/*      */ 
/*      */         
/*  911 */         drawCircle(g, 50 + x, 60 + y, 30);
/*  912 */         drawCircle(g, 150 + x, 60 + y, 30);
/*  913 */         drawCircle(g, 250 + x, 60 + y, 30);
/*  914 */         drawCircle(g, 350 + x, 60 + y, 30);
/*  915 */         drawCircle(g, 450 + x, 60 + y, 30);
/*  916 */         drawCircle(g, 550 + x, 60 + y, 30);
/*  917 */         drawCircle(g, 650 + x, 60 + y, 30);
/*  918 */         drawCircle(g, 750 + x, 60 + y, 30);
/*  919 */         drawCircle(g, 850 + x, 60 + y, 30);
/*      */ 
/*      */         
/*  922 */         drawCircle(g, 100 + x, 120 + y, 30);
/*  923 */         drawCircle(g, 200 + x, 120 + y, 30);
/*  924 */         drawCircle(g, 300 + x, 120 + y, 30);
/*  925 */         drawCircle(g, 400 + x, 120 + y, 30);
/*  926 */         drawCircle(g, 500 + x, 120 + y, 30);
/*  927 */         drawCircle(g, 600 + x, 120 + y, 30);
/*  928 */         drawCircle(g, 700 + x, 120 + y, 30);
/*  929 */         drawCircle(g, 800 + x, 120 + y, 30);
/*      */ 
/*      */         
/*  932 */         drawCircle(g, 50 + x, 180 + y, 30);
/*  933 */         drawCircle(g, 150 + x, 180 + y, 30);
/*  934 */         drawCircle(g, 250 + x, 180 + y, 30);
/*  935 */         drawCircle(g, 350 + x, 180 + y, 30);
/*  936 */         drawCircle(g, 450 + x, 180 + y, 30);
/*  937 */         drawCircle(g, 550 + x, 180 + y, 30);
/*      */         
/*  939 */         drawCircle(g, 750 + x, 180 + y, 30);
/*  940 */         drawCircle(g, 850 + x, 180 + y, 30);
/*      */         break;
/*      */       
/*      */       case 'n':
/*  944 */         g.setColor(Color.WHITE);
/*  945 */         drawCircle(g, 750 + x, 180 + y, 30);
/*  946 */         g.setColor(Color.GRAY);
/*      */ 
/*      */         
/*  949 */         drawCircle(g, 50 + x, 60 + y, 30);
/*  950 */         drawCircle(g, 150 + x, 60 + y, 30);
/*  951 */         drawCircle(g, 250 + x, 60 + y, 30);
/*  952 */         drawCircle(g, 350 + x, 60 + y, 30);
/*  953 */         drawCircle(g, 450 + x, 60 + y, 30);
/*  954 */         drawCircle(g, 550 + x, 60 + y, 30);
/*  955 */         drawCircle(g, 650 + x, 60 + y, 30);
/*  956 */         drawCircle(g, 750 + x, 60 + y, 30);
/*  957 */         drawCircle(g, 850 + x, 60 + y, 30);
/*      */ 
/*      */         
/*  960 */         drawCircle(g, 100 + x, 120 + y, 30);
/*  961 */         drawCircle(g, 200 + x, 120 + y, 30);
/*  962 */         drawCircle(g, 300 + x, 120 + y, 30);
/*  963 */         drawCircle(g, 400 + x, 120 + y, 30);
/*  964 */         drawCircle(g, 500 + x, 120 + y, 30);
/*  965 */         drawCircle(g, 600 + x, 120 + y, 30);
/*  966 */         drawCircle(g, 700 + x, 120 + y, 30);
/*  967 */         drawCircle(g, 800 + x, 120 + y, 30);
/*      */ 
/*      */         
/*  970 */         drawCircle(g, 50 + x, 180 + y, 30);
/*  971 */         drawCircle(g, 150 + x, 180 + y, 30);
/*  972 */         drawCircle(g, 250 + x, 180 + y, 30);
/*  973 */         drawCircle(g, 350 + x, 180 + y, 30);
/*  974 */         drawCircle(g, 450 + x, 180 + y, 30);
/*  975 */         drawCircle(g, 550 + x, 180 + y, 30);
/*  976 */         drawCircle(g, 650 + x, 180 + y, 30);
/*      */         
/*  978 */         drawCircle(g, 850 + x, 180 + y, 30);
/*      */         break;
/*      */       
/*      */       case 'm':
/*  982 */         g.setColor(Color.WHITE);
/*  983 */         drawCircle(g, 850 + x, 180 + y, 30);
/*  984 */         g.setColor(Color.GRAY);
/*      */ 
/*      */         
/*  987 */         drawCircle(g, 50 + x, 60 + y, 30);
/*  988 */         drawCircle(g, 150 + x, 60 + y, 30);
/*  989 */         drawCircle(g, 250 + x, 60 + y, 30);
/*  990 */         drawCircle(g, 350 + x, 60 + y, 30);
/*  991 */         drawCircle(g, 450 + x, 60 + y, 30);
/*  992 */         drawCircle(g, 550 + x, 60 + y, 30);
/*  993 */         drawCircle(g, 650 + x, 60 + y, 30);
/*  994 */         drawCircle(g, 750 + x, 60 + y, 30);
/*  995 */         drawCircle(g, 850 + x, 60 + y, 30);
/*      */ 
/*      */         
/*  998 */         drawCircle(g, 100 + x, 120 + y, 30);
/*  999 */         drawCircle(g, 200 + x, 120 + y, 30);
/* 1000 */         drawCircle(g, 300 + x, 120 + y, 30);
/* 1001 */         drawCircle(g, 400 + x, 120 + y, 30);
/* 1002 */         drawCircle(g, 500 + x, 120 + y, 30);
/* 1003 */         drawCircle(g, 600 + x, 120 + y, 30);
/* 1004 */         drawCircle(g, 700 + x, 120 + y, 30);
/* 1005 */         drawCircle(g, 800 + x, 120 + y, 30);
/*      */ 
/*      */         
/* 1008 */         drawCircle(g, 50 + x, 180 + y, 30);
/* 1009 */         drawCircle(g, 150 + x, 180 + y, 30);
/* 1010 */         drawCircle(g, 250 + x, 180 + y, 30);
/* 1011 */         drawCircle(g, 350 + x, 180 + y, 30);
/* 1012 */         drawCircle(g, 450 + x, 180 + y, 30);
/* 1013 */         drawCircle(g, 550 + x, 180 + y, 30);
/* 1014 */         drawCircle(g, 650 + x, 180 + y, 30);
/* 1015 */         drawCircle(g, 750 + x, 180 + y, 30);
/*      */         break;
/*      */ 
/*      */       
/*      */       default:
/* 1020 */         g.setColor(Color.GRAY);
/*      */ 
/*      */         
/* 1023 */         drawCircle(g, 50 + x, 60 + y, 30);
/* 1024 */         drawCircle(g, 150 + x, 60 + y, 30);
/* 1025 */         drawCircle(g, 250 + x, 60 + y, 30);
/* 1026 */         drawCircle(g, 350 + x, 60 + y, 30);
/* 1027 */         drawCircle(g, 450 + x, 60 + y, 30);
/* 1028 */         drawCircle(g, 550 + x, 60 + y, 30);
/* 1029 */         drawCircle(g, 650 + x, 60 + y, 30);
/* 1030 */         drawCircle(g, 750 + x, 60 + y, 30);
/* 1031 */         drawCircle(g, 850 + x, 60 + y, 30);
/*      */ 
/*      */         
/* 1034 */         drawCircle(g, 100 + x, 120 + y, 30);
/* 1035 */         drawCircle(g, 200 + x, 120 + y, 30);
/* 1036 */         drawCircle(g, 300 + x, 120 + y, 30);
/* 1037 */         drawCircle(g, 400 + x, 120 + y, 30);
/* 1038 */         drawCircle(g, 500 + x, 120 + y, 30);
/* 1039 */         drawCircle(g, 600 + x, 120 + y, 30);
/* 1040 */         drawCircle(g, 700 + x, 120 + y, 30);
/* 1041 */         drawCircle(g, 800 + x, 120 + y, 30);
/*      */ 
/*      */         
/* 1044 */         drawCircle(g, 50 + x, 180 + y, 30);
/* 1045 */         drawCircle(g, 150 + x, 180 + y, 30);
/* 1046 */         drawCircle(g, 250 + x, 180 + y, 30);
/* 1047 */         drawCircle(g, 350 + x, 180 + y, 30);
/* 1048 */         drawCircle(g, 450 + x, 180 + y, 30);
/* 1049 */         drawCircle(g, 550 + x, 180 + y, 30);
/* 1050 */         drawCircle(g, 650 + x, 180 + y, 30);
/* 1051 */         drawCircle(g, 750 + x, 180 + y, 30);
/* 1052 */         drawCircle(g, 850 + x, 180 + y, 30);
/*      */         break;
/*      */     } 
/*      */ 
/*      */     
/* 1057 */     g.setColor(Color.BLACK);
/* 1058 */     g.setFont(new Font("Dialog", 0, 20));
/*      */ 
/*      */     
/* 1061 */     g.drawString("Q", 42 + x, 68 + y);
/* 1062 */     g.drawString("W", 141 + x, 68 + y);
/* 1063 */     g.drawString("E", 243 + x, 68 + y);
/* 1064 */     g.drawString("R", 343 + x, 68 + y);
/* 1065 */     g.drawString("T", 443 + x, 68 + y);
/* 1066 */     g.drawString("Y", 543 + x, 68 + y);
/* 1067 */     g.drawString("U", 643 + x, 68 + y);
/* 1068 */     g.drawString("I", 748 + x, 68 + y);
/* 1069 */     g.drawString("O", 843 + x, 68 + y);
/*      */ 
/*      */     
/* 1072 */     g.drawString("P", 93 + x, 128 + y);
/* 1073 */     g.drawString("A", 193 + x, 128 + y);
/* 1074 */     g.drawString("S", 293 + x, 128 + y);
/* 1075 */     g.drawString("D", 393 + x, 128 + y);
/* 1076 */     g.drawString("F", 493 + x, 128 + y);
/* 1077 */     g.drawString("G", 593 + x, 128 + y);
/* 1078 */     g.drawString("H", 693 + x, 128 + y);
/* 1079 */     g.drawString("J", 793 + x, 128 + y);
/*      */ 
/*      */     
/* 1082 */     g.drawString("K", 42 + x, 188 + y);
/* 1083 */     g.drawString("L", 143 + x, 188 + y);
/* 1084 */     g.drawString("Z", 243 + x, 188 + y);
/* 1085 */     g.drawString("X", 343 + x, 188 + y);
/* 1086 */     g.drawString("C", 443 + x, 188 + y);
/* 1087 */     g.drawString("V", 543 + x, 188 + y);
/* 1088 */     g.drawString("B", 643 + x, 188 + y);
/* 1089 */     g.drawString("N", 743 + x, 188 + y);
/* 1090 */     g.drawString("M", 843 + x, 188 + y);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void drawLightboard(Graphics g, char currentChar, int x, int y) {
/* 1095 */     g.setFont(new Font("Dialog", 0, 20));
/* 1096 */     Color on = Color.YELLOW;
/* 1097 */     Color text = Color.BLACK;
/*      */ 
/*      */     
/* 1100 */     switch (currentChar) {
/*      */       case 'q':
/* 1102 */         g.setColor(on);
/* 1103 */         drawCircle(g, 50 + x, 60 + y, 30);
/* 1104 */         g.setColor(text);
/* 1105 */         g.drawString("Q", 42 + x, 68 + y);
/*      */         return;
/*      */       case 'w':
/* 1108 */         g.setColor(on);
/* 1109 */         drawCircle(g, 150 + x, 60 + y, 30);
/* 1110 */         g.setColor(text);
/* 1111 */         g.drawString("W", 141 + x, 68 + y);
/*      */         return;
/*      */       case 'e':
/* 1114 */         g.setColor(on);
/* 1115 */         drawCircle(g, 250 + x, 60 + y, 30);
/* 1116 */         g.setColor(text);
/* 1117 */         g.drawString("E", 243 + x, 68 + y);
/*      */         return;
/*      */       case 'r':
/* 1120 */         g.setColor(on);
/* 1121 */         drawCircle(g, 350 + x, 60 + y, 30);
/* 1122 */         g.setColor(text);
/* 1123 */         g.drawString("R", 343 + x, 68 + y);
/*      */         return;
/*      */       case 't':
/* 1126 */         g.setColor(on);
/* 1127 */         drawCircle(g, 450 + x, 60 + y, 30);
/* 1128 */         g.setColor(text);
/* 1129 */         g.drawString("T", 443 + x, 68 + y);
/*      */         return;
/*      */       case 'y':
/* 1132 */         g.setColor(on);
/* 1133 */         drawCircle(g, 550 + x, 60 + y, 30);
/* 1134 */         g.setColor(text);
/* 1135 */         g.drawString("Y", 543 + x, 68 + y);
/*      */         return;
/*      */       case 'u':
/* 1138 */         g.setColor(on);
/* 1139 */         drawCircle(g, 650 + x, 60 + y, 30);
/* 1140 */         g.setColor(text);
/* 1141 */         g.drawString("U", 643 + x, 68 + y);
/*      */         return;
/*      */       case 'i':
/* 1144 */         g.setColor(on);
/* 1145 */         drawCircle(g, 750 + x, 60 + y, 30);
/* 1146 */         g.setColor(text);
/* 1147 */         g.drawString("I", 748 + x, 68 + y);
/*      */         return;
/*      */       case 'o':
/* 1150 */         g.setColor(on);
/* 1151 */         drawCircle(g, 850 + x, 60 + y, 30);
/* 1152 */         g.setColor(text);
/* 1153 */         g.drawString("O", 843 + x, 68 + y);
/*      */         return;
/*      */       case 'p':
/* 1156 */         g.setColor(on);
/* 1157 */         drawCircle(g, 100 + x, 120 + y, 30);
/* 1158 */         g.setColor(text);
/* 1159 */         g.drawString("P", 93 + x, 128 + y);
/*      */         return;
/*      */       case 'a':
/* 1162 */         g.setColor(on);
/* 1163 */         drawCircle(g, 200 + x, 120 + y, 30);
/* 1164 */         g.setColor(text);
/* 1165 */         g.drawString("A", 193 + x, 128 + y);
/*      */         return;
/*      */       case 's':
/* 1168 */         g.setColor(on);
/* 1169 */         drawCircle(g, 300 + x, 120 + y, 30);
/* 1170 */         g.setColor(text);
/* 1171 */         g.drawString("S", 293 + x, 128 + y);
/*      */         return;
/*      */       case 'd':
/* 1174 */         g.setColor(on);
/* 1175 */         drawCircle(g, 400 + x, 120 + y, 30);
/* 1176 */         g.setColor(text);
/* 1177 */         g.drawString("D", 393 + x, 128 + y);
/*      */         return;
/*      */       case 'f':
/* 1180 */         g.setColor(on);
/* 1181 */         drawCircle(g, 500 + x, 120 + y, 30);
/* 1182 */         g.setColor(text);
/* 1183 */         g.drawString("F", 493 + x, 128 + y);
/*      */         return;
/*      */       case 'g':
/* 1186 */         g.setColor(on);
/* 1187 */         drawCircle(g, 600 + x, 120 + y, 30);
/* 1188 */         g.setColor(text);
/* 1189 */         g.drawString("G", 593 + x, 128 + y);
/*      */         return;
/*      */       case 'h':
/* 1192 */         g.setColor(on);
/* 1193 */         drawCircle(g, 700 + x, 120 + y, 30);
/* 1194 */         g.setColor(text);
/* 1195 */         g.drawString("H", 693 + x, 128 + y);
/*      */         return;
/*      */       case 'j':
/* 1198 */         g.setColor(on);
/* 1199 */         drawCircle(g, 800 + x, 120 + y, 30);
/* 1200 */         g.setColor(text);
/* 1201 */         g.drawString("J", 793 + x, 128 + y);
/*      */         return;
/*      */       case 'k':
/* 1204 */         g.setColor(on);
/* 1205 */         drawCircle(g, 50 + x, 180 + y, 30);
/* 1206 */         g.setColor(text);
/* 1207 */         g.drawString("K", 42 + x, 188 + y);
/*      */         return;
/*      */       case 'l':
/* 1210 */         g.setColor(on);
/* 1211 */         drawCircle(g, 150 + x, 180 + y, 30);
/* 1212 */         g.setColor(text);
/* 1213 */         g.drawString("L", 143 + x, 188 + y);
/*      */         return;
/*      */       case 'z':
/* 1216 */         g.setColor(on);
/* 1217 */         drawCircle(g, 250 + x, 180 + y, 30);
/* 1218 */         g.setColor(text);
/* 1219 */         g.drawString("Z", 243 + x, 188 + y);
/*      */         return;
/*      */       case 'x':
/* 1222 */         g.setColor(on);
/* 1223 */         drawCircle(g, 350 + x, 180 + y, 30);
/* 1224 */         g.setColor(text);
/* 1225 */         g.drawString("X", 343 + x, 188 + y);
/*      */         return;
/*      */       case 'c':
/* 1228 */         g.setColor(on);
/* 1229 */         drawCircle(g, 450 + x, 180 + y, 30);
/* 1230 */         g.setColor(text);
/* 1231 */         g.drawString("C", 443 + x, 188 + y);
/*      */         return;
/*      */       case 'v':
/* 1234 */         g.setColor(on);
/* 1235 */         drawCircle(g, 550 + x, 180 + y, 30);
/* 1236 */         g.setColor(text);
/* 1237 */         g.drawString("V", 543 + x, 188 + y);
/*      */         return;
/*      */       case 'b':
/* 1240 */         g.setColor(on);
/* 1241 */         drawCircle(g, 650 + x, 180 + y, 30);
/* 1242 */         g.setColor(text);
/* 1243 */         g.drawString("B", 643 + x, 188 + y);
/*      */         return;
/*      */       case 'n':
/* 1246 */         g.setColor(on);
/* 1247 */         drawCircle(g, 750 + x, 180 + y, 30);
/* 1248 */         g.setColor(text);
/* 1249 */         g.drawString("N", 743 + x, 188 + y);
/*      */         return;
/*      */       case 'm':
/* 1252 */         g.setColor(on);
/* 1253 */         drawCircle(g, 850 + x, 180 + y, 30);
/* 1254 */         g.setColor(text);
/* 1255 */         g.drawString("M", 843 + x, 188 + y);
/*      */         return;
/*      */     } 
/* 1258 */     g.setColor(Color.BLACK);
/*      */ 
/*      */     
/* 1261 */     drawCircle(g, 50 + x, 60 + y, 30);
/* 1262 */     drawCircle(g, 150 + x, 60 + y, 30);
/* 1263 */     drawCircle(g, 250 + x, 60 + y, 30);
/* 1264 */     drawCircle(g, 350 + x, 60 + y, 30);
/* 1265 */     drawCircle(g, 450 + x, 60 + y, 30);
/* 1266 */     drawCircle(g, 550 + x, 60 + y, 30);
/* 1267 */     drawCircle(g, 650 + x, 60 + y, 30);
/* 1268 */     drawCircle(g, 750 + x, 60 + y, 30);
/* 1269 */     drawCircle(g, 850 + x, 60 + y, 30);
/*      */ 
/*      */     
/* 1272 */     drawCircle(g, 100 + x, 120 + y, 30);
/* 1273 */     drawCircle(g, 200 + x, 120 + y, 30);
/* 1274 */     drawCircle(g, 300 + x, 120 + y, 30);
/* 1275 */     drawCircle(g, 400 + x, 120 + y, 30);
/* 1276 */     drawCircle(g, 500 + x, 120 + y, 30);
/* 1277 */     drawCircle(g, 600 + x, 120 + y, 30);
/* 1278 */     drawCircle(g, 700 + x, 120 + y, 30);
/* 1279 */     drawCircle(g, 800 + x, 120 + y, 30);
/*      */ 
/*      */     
/* 1282 */     drawCircle(g, 50 + x, 180 + y, 30);
/* 1283 */     drawCircle(g, 150 + x, 180 + y, 30);
/* 1284 */     drawCircle(g, 250 + x, 180 + y, 30);
/* 1285 */     drawCircle(g, 350 + x, 180 + y, 30);
/* 1286 */     drawCircle(g, 450 + x, 180 + y, 30);
/* 1287 */     drawCircle(g, 550 + x, 180 + y, 30);
/* 1288 */     drawCircle(g, 650 + x, 180 + y, 30);
/* 1289 */     drawCircle(g, 750 + x, 180 + y, 30);
/* 1290 */     drawCircle(g, 850 + x, 180 + y, 30);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static void drawRotors(Graphics g, int x, int y, int count1, int count2, int count3) {
/* 1296 */     g.setColor(Color.DARK_GRAY);
/* 1297 */     g.fillRect(x - 35, y - 100, 130, 215);
/* 1298 */     g.fillRect(x - 335, y - 100, 130, 215);
/* 1299 */     g.fillRect(x - 635, y - 100, 130, 215);
/*      */     
/* 1301 */     g.setColor(Color.WHITE);
/* 1302 */     g.setFont(new Font("Dialog", 0, 45));
/*      */     
/* 1304 */     if (count1 < 10) {
/* 1305 */       g.drawString(Integer.toString(count1), x + 10, y + 10);
/*      */     } else {
/* 1307 */       g.drawString(Integer.toString(count1), x + 5, y + 10);
/*      */     } 
/*      */     
/* 1310 */     if (count2 < 10) {
/* 1311 */       g.drawString(Integer.toString(count2), x - 285, y + 10);
/*      */     } else {
/* 1313 */       g.drawString(Integer.toString(count2), x - 290, y + 10);
/*      */     } 
/*      */     
/* 1316 */     if (count3 < 10) {
/* 1317 */       g.drawString(Integer.toString(count3), x - 585, y + 10);
/*      */     } else {
/* 1319 */       g.drawString(Integer.toString(count3), x - 590, y + 10);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static void animateRotor(Graphics g, int x, int y) {
/* 1326 */     g.setColor(Color.lightGray);
/* 1327 */     g.fillRect(x, y + 5, 20, 20);
/* 1328 */     g.fillRect(x, y + 35, 20, 20);
/* 1329 */     g.fillRect(x, y + 65, 20, 20);
/* 1330 */     g.fillRect(x, y + 95, 20, 20);
/* 1331 */     g.fillRect(x, y + 125, 20, 20);
/* 1332 */     g.fillRect(x, y + 155, 20, 20);
/* 1333 */     g.fillRect(x, y + 185, 20, 20);
/*      */   }
/*      */ }


/* Location:              C:\Users\Conner\Downloads\Enigma-1.1-SNAPSHOT.jar!\com\Paint\drawElements.class
 * Java compiler version: 12 (56.0)
 * JD-Core Version:       1.1.3
 */