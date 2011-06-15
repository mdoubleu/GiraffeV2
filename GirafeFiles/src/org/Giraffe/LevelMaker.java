package org.Giraffe;

import java.util.LinkedList;

public class LevelMaker {
	
	/**Constructs a Level from a LevelString
	 * @param levelstring: tells the level where objects should
	 * be placed.
	 */
	LinkedList<Long> times = new LinkedList<Long>();
	LinkedList<Obstacle> obstacles = new LinkedList<Obstacle>();
	public LevelMaker(String levelstring){
		/**Splits the string into objects, with the # being the divider
		 * between each object. These are all represented by the array
		 */
		String[] level = levelstring.split("#");
		for (int i = 0; i < level.length; i++){
			String obj = level[i];
			String[] objel = obj.split("%"); //object elements
			
			times.add(Long.parseLong(objel[0]));
			
			int type = Integer.parseInt(objel[1]);
			switch (type) {
				case 1: obstacles.add(new StaticObstacle());
				case 2: obstacles.add(new Tank());
			}
		
			
		}
	}
	
	public LinkedList<Long> getTimes(){
		return times;
	}
	
	public LinkedList<Obstacle> getObstacles(){
		return obstacles;
	}
}
