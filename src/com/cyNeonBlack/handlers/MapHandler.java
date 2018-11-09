package com.cyNeonBlack.handlers;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import com.cyNeonBlack.assets.Coordinate;
import com.cyNeonBlack.assets.Map;

public class MapHandler {

	final static int EASY1 = 0, MED1 = 1, HARD1 = 2;

	public static ArrayList<Map> maps;
	private static ArrayList<BufferedImage> backgrounds = new ArrayList<BufferedImage>();
	private static ArrayList<Coordinate[]> paths = new ArrayList<Coordinate[]>();

	private static void imageInit() {
		try {

			backgrounds.add(ImageIO.read(new File("resources/maps/easy1.png")));
			backgrounds.add(ImageIO.read(new File("resources/maps/medium1.png")));
			backgrounds.add(ImageIO.read(new File("resources/maps/hard1.png")));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void pathInit() {

		paths.add(new Coordinate[] { new Coordinate(0, 4), new Coordinate(4, 4), new Coordinate(4, 9),
				new Coordinate(1, 9), new Coordinate(1, 7), new Coordinate(8, 7), new Coordinate(8, 3),
				new Coordinate(5, 3), new Coordinate(5, 1), new Coordinate(12, 1), new Coordinate(12, 8),
				new Coordinate(8, 8), new Coordinate(8, 10), new Coordinate(13, 10), new Coordinate(13, 8),
				new Coordinate(15, 8), });

		paths.add(new Coordinate[] { new Coordinate(0, 2), new Coordinate(4, 2), new Coordinate(4, 6),
				new Coordinate(2, 6), new Coordinate(2, 4), new Coordinate(9, 4), new Coordinate(9, 8),
				new Coordinate(7, 8), new Coordinate(7, 6), new Coordinate(14, 6), new Coordinate(14, 10),
				new Coordinate(12, 10), new Coordinate(12, 8), new Coordinate(15, 8), });

		paths.add(new Coordinate[] { new Coordinate(0, 3), new Coordinate(9, 3), new Coordinate(9, 8),
				new Coordinate(5, 8), new Coordinate(5, 5), new Coordinate(15, 5), });
	}

	// Image, Path;
	public static void initMaps() {

		maps = new ArrayList<Map>();

		imageInit();
		pathInit();

		maps.add(new Map(backgrounds.get(EASY1), paths.get(EASY1)));
		maps.add(new Map(backgrounds.get(MED1), paths.get(MED1)));
		maps.add(new Map(backgrounds.get(HARD1), paths.get(HARD1)));

	}

}
