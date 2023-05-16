package controller;

import model.Resident;

public interface IBuildingController {
	
	public void add(Resident r) throws Exception;
	public Resident search(Resident r) throws Exception;
	public void remove(Resident r) throws Exception;
	public void list(int floor) throws Exception;
	
}
