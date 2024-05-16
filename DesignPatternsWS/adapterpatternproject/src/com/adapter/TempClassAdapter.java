package com.adapter;

import javax.naming.ContextNotEmptyException;

public class TempClassAdapter extends CelciusReporter implements TempAdapter {

	//class adapter. Uses inheritance by extending CelciusReporter
	
	@Override
	public double getTempInF() {
		double c = super.getTempC(); // this is in celcius

		double f = cTof(c);
		return f;
	}

	@Override
	public double getTempInC() {

		return super.getTempC();
	}

	@Override
	public void setTempInC(double tempC) {
		super.setTempC(tempC);
	}

	@Override
	public void setTempInF(double TempF) {
		double c = fToc(TempF);
		super.setTempC(c);

	}

	private double cTof(double c) {
		return ((c * 9 / 5) + 32);
	}

	private double fToc(double f) {
		return (f - 32) * 5 / 9;
	}
}
