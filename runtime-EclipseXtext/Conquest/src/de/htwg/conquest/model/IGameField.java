package de.htwg.conquest.model;

import java.awt.Color;
import de.htwg.conquest.model.IGameField;
import de.htwg.conquest.model.ICell;
import de.htwg.conquest.model.IPlayer;

public interface IGameField {
	
	public int getSize();
	public void setSize(int size);
	public ICell[][] getCells();
	public void setCells(ICell[][] cells);
	public ICell getCell(int x, int y);
	public void setCell(int x, int y, Color color);
	public void setOwner(int x, int y, IPlayer owner);
}
