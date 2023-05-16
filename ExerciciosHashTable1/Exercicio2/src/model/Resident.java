package model;

public class Resident {
	private String name;
	private int apartmentNumber;
	private String carModel;
	private String carColor;
	private String carPlate;
	
	public int getNumber() {
		return apartmentNumber;
	}
	public void setNumber(int number) {
		this.apartmentNumber = number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	
	public String getCarPlate() {
		return carPlate;
	}
	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
	}
	
	@Override
	public int hashCode() {
		int hash = (apartmentNumber/100) - 1;
		
		return hash;
	}
	
}
