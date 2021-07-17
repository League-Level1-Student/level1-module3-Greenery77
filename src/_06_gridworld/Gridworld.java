package _06_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	
	public static void main(String[] args) {
	
		World world = new World();
		
		world.show();
		
		Location bugloc = new Location(1, 1);
		
		Bug bug = new Bug();
		
		world.add(bugloc, bug);
		
		Location bug2loc = new Location(8, 8);
		
		Bug bug2 = new Bug();
		
		world.add(bug2loc, bug2);
		
		bug2.setColor(Color.BLUE);
		
		bug2.turn();
		
		bug2.turn();
		
	}
}
