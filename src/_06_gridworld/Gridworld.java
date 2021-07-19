package _06_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	
	public static void main(String[] args) {

		World world = new World();

		world.show();

		for (int r = 0; r < 10; r++) {

			for (int c = 0; c < 10; c++) {

				Flower clf = new Flower();

				Location clfloc = new Location(r, c);

				world.add(clfloc, clf);

			}

		}

		Location bugloc = new Location(1, 1);

		Bug bug = new Bug();

		world.add(bugloc, bug);

		Location bug2loc = new Location(8, 8);

		Bug bug2 = new Bug();

		world.add(bug2loc, bug2);

		bug2.setColor(Color.BLUE);

		bug2.turn();

		bug2.turn();

		Flower f1 = new Flower();

		Location floc = new Location(8, 9);

		world.add(floc, f1);

		Location floc2 = new Location(8, 7);

		world.add(floc2, f1);

	}
}
