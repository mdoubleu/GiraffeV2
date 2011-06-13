package org.Giraffe;

import android.content.Context;
import android.view.View;


//Represents any element in the game
public abstract class Entity  extends View implements Collidable{
	
	
	
	public Entity(Context context) {
		
		super(context);
		
	}

	public boolean collidesWith(Entity otherEntity) {
	  
		return true;
	
	}
 
	public void collided(Collidable otherEntity) {
	}
 
	public boolean canCollide() {
	   
		return true;
	
	}
}