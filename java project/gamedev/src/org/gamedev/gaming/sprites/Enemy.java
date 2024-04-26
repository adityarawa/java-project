package org.gamedev.gaming.sprites;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Enemy extends Sprite {
	
	public Enemy(int x,int speed) {
		w=200;
		h=200;
		y=100;
		this.speed=speed;
		this.x=x;
		image=new ImageIcon(Player.class.getResource("Spiders.gif"));
   }
	
	 public void move() {
		 if (y>900) {
			 y=0; 
		 }
		  y=y+speed;
	  }
}



