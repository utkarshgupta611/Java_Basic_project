package com.ust.obj;

public abstract class Vehicle {
	private int tyres;
	private String type;
	private double cost;

	public Vehicle() {
		super();
	}

	public Vehicle(int tyres, String type, double cost) {
		this.tyres = tyres;
		this.type = type;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return " [tyres=" + tyres + ", type=" + type + ", cost=" + cost + "]";
	}

	public int getTyres() {
		return tyres;
	}

	public void setTyres(int tyres) {
		this.tyres = tyres;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void move() {
		// TODO Auto-generated method stub
		
	}

}

