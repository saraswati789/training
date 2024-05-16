package com.adapter.main;

import com.adapter.TempAdapter;
import com.adapter.TempClassAdapter;
import com.adapter.TempObjectAdapter;

public class AdapterMain {

	public static void main(String[] args) {

		// Using Class Adapter (this adapter uses inheritance. extends CelciusReporter
		TempAdapter adapter = new TempClassAdapter();

		System.out.println("Using Class Adapter ");

		adapter.setTempInC(21.5);

		System.out.println("Temperature in F: " + adapter.getTempInF());
		System.out.println("Temperature in C: " + adapter.getTempInC());

		adapter.setTempInF(78.2);

		System.out.println("Temperature in F: " + adapter.getTempInF());
		System.out.println("Temperature in C: " + adapter.getTempInC());

		// using Object adapter(this adapter uses composition to encapsulate
		// CelciusReporter)
		adapter = new TempObjectAdapter();

		System.out.println("\nUsing Object Adapter:");
		adapter.setTempInC(21.5);

		System.out.println("Temperature in F: " + adapter.getTempInF());
		System.out.println("Temperature in C: " + adapter.getTempInC());

		adapter.setTempInF(78.2);

		System.out.println("Temperature in F: " + adapter.getTempInF());
		System.out.println("Temperature in C: " + adapter.getTempInC());
	}

}
