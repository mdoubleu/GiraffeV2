package org.Giraffe;

import android.content.Context;

public class GiraffeModel extends Entity{
	
	int G_y1 = 150;
	int G_y2 = 450;
	int G_x1 = 0;
	int G_x2 = 150;
	public GiraffeModel(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean collidesWith(Collidable otherEntity) {
		
		return false;
	}
	
	public boolean onBox(Box box) {
		if (box.getX1()>=G_x2 && box.getX2() <= G_x1 && box.getY2()+2 == G_y1) {
		return true;
		} else 
			return false;
		
	}

}
