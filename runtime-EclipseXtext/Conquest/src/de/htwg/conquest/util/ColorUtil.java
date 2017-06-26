package de.htwg.conquest.util;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColorUtil {

	public static final List<Color> getColorSet(int num) {
		return colors.subList(0, num);
	}
	
	public static final int getSize() {
		return colors.size();
	}

	private static final List<Color> colors = new ArrayList<>(Arrays.asList(
		Color.BLUE, 
		Color.GREEN, 
		Color.PINK, 
		Color.ORANGE, 
		Color.CYAN
	));
	
	public static final String getColorText(Color c) {
		String co = "";
		if(c.equals(Color.BLUE)) {
			co = "blue";
		} else 
		if(c.equals(Color.GREEN)) {
			co = "green";
		} else 
		if(c.equals(Color.PINK)) {
			co = "pink";
		} else 
		if(c.equals(Color.ORANGE)) {
			co = "orange";
		} else 
		if(c.equals(Color.CYAN)) {
			co = "cyan";
		}
		else {
		co = " ";
		}
		return co;
	}
}
