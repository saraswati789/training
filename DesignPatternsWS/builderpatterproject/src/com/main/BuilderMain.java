package com.main;

import com.builders.ChineseMealBuilder;
import com.builders.IndianMealBuilder;
import com.director.MealDirector;
import com.product.Meal;

public class BuilderMain {

	public static void main(String[] args) {

	//	MealDirector md = new MealDirector(new ChineseMealBuilder());
		MealDirector md = new MealDirector(new IndianMealBuilder());
		
		md.makeMeal();
		
		Meal m = md.getMeal();

		System.out.println(m);
	}

}
