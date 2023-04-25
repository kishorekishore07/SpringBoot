package com.example.ProjectRest.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class MobilePhone {
@Id

	private String Brand;
	private String RAM;
	private String Storage;
	private String camera;
	private String BatterySize;
	private String DisplayType;
	private String Price;
	private String Discounts;
	
	public String getBrand() {
	return Brand;
}
public void setBrand(String brand) {
	Brand = brand;
}
public String getRAM() {
	return RAM;
}
public void setRAM(String rAM) {
	RAM = rAM;
}
public String getStorage() {
	return Storage;
}
public void setStorage(String storage) {
	Storage = storage;
}
public String getCamera() {
	return camera;
}
public void setCamera(String camera) {
	this.camera = camera;
}
public String getBatterySize() {
	return BatterySize;
}
public void setBatterySize(String batterySize) {
	BatterySize = batterySize;
}
public String getDisplayType() {
	return DisplayType;
}
public void setDisplayType(String displayType) {
	DisplayType = displayType;
}
public String getPrice() {
	return Price;
}
public void setPrice(String price) {
	Price = price;
}
public String getDiscounts() {
	return Discounts;
}
public void setDiscounts(String discounts) {
	Discounts = discounts;
}
}