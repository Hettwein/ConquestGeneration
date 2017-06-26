package de.htwg.conquest.model;

import java.awt.Color;
import java.util.Random;
import de.htwg.conquest.util.ColorUtil;
import de.htwg.conquest.model.ICell;
import de.htwg.conquest.model.IPlayer;

public interface ICell {
	
	public Color getColor();
	public void setColor(Color color);
	public IPlayer getOwner();
	public void setOwner(IPlayer owner);
	public int getX();
	public void setX(int x);
	public int getY();
	public void setY(int y);
	public boolean isOwned();
	public String getColorText();
}
