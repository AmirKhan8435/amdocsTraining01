package com.training.amdocs.pojo;

public class CentrePOJO 
{
	private int pin ;
	private String name;
	private String area;
	private int vacant_bed;
	
	public CentrePOJO()
	{}

	public CentrePOJO(int pin, String name, String area, int vacant_bed) 
	{
		super();
		this.pin = pin;
		this.name = name;
		this.area = area;
		this.vacant_bed = vacant_bed;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getVacant_bed() {
		return vacant_bed;
	}

	public void setVacant_bed(int vacant_bed) {
		this.vacant_bed = vacant_bed;
	}

	@Override
	public String toString() 
	{
		return "Covid Centre [pin=" + pin + ", name=" + name + ", area=" + area + ", vacant_bed=" + vacant_bed + "]";
	}
	
	
	
	

}
