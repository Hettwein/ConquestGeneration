package de.htwg.conquest.model;

import java.util.ArrayList;
import java.util.List;
import de.htwg.conquest.model.ICell;
import de.htwg.conquest.model.IPlayer;

public interface IPlayer {
	
	public String getName();
	public void setName(String name);
	public List<ICell> getCells();
	public void setCells(List<ICell> cells);
	public int getCellCount();
	public void addCell(ICell cell);
}
