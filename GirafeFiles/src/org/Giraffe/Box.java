package org.Giraffe;

import android.content.Context;

public class Box extends Entity {
	
	int bX1=570;
	int bX2=650;
	int bY1=240;
	int bY2=415;
	
	public Box(Context context) {
		
		
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean collidesWith(Collidable otherEntity) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public int getX1() {
		return bX1;
	}
	
	public int getX2() {
		return bX2;
	}
	public int getY1() {
		return bY1;
	}
	public int getY2() {
		return bY2;
	}

}
