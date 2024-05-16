package cloningproject;

import java.util.ArrayList;

public class CloneMain {

	public static void main(String[] args) {

		ArrayList<String> skillSet = new ArrayList<>();
		skillSet.add("Java");
		skillSet.add("Spring");

		Employee e1 = new Employee(100, "Ramana", skillSet);

		System.out.println("First Employee: " + e1);

		Employee e2 = (Employee) e1.clone();

		System.out.println("Second Employe: " + e2);

		e2.setEmpId(200);
		e2.setName("Sunil");

		System.out.println("First Employee: " + e1);
		System.out.println("Second Employe: " + e2);
		
		e1.addSkill("Hibernate");
		
		System.out.println("First Employee: " + e1);
		System.out.println("Second Employe: " + e2);
		
		
	}

}
