package com.unittest.testing;
public class Fahrenheit {
	private double celcius;
	private double Fahnrenhiet;

	public double getCelcius() {
		return celcius;
	}

	public void input(double celcius) {
		this.celcius = celcius;
	}

	public double getFahnrenhiet() {
		return Fahnrenhiet;
	}

	public boolean isBound(double celcius) {
		boolean isResult;
		if(celcius >= -1000 && celcius <= 1000) {
			isResult = true;
		}else{
			isResult = false;
		}
		return isResult;
	}
	
	public void calculate() {
		this.Fahnrenhiet = this.celcius*9/5+32;
	}

	public String toString() {
		double Fahnrenhiet = this.getFahnrenhiet();
		double celcius = this.getCelcius();
		return Math.round(celcius)+" celcius = "+String.format("%.2f",Fahnrenhiet)+" Fahrenheit";
	}
}