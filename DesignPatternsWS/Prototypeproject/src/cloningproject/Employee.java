package cloningproject;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

	private int empId;
	private String name;

	private List<String> skillList;

	public Employee(int empId, String name, List<String> skilList) {
		super();
		this.empId = empId;
		this.name = name;
		this.skillList = skilList;
	}

	public void addSkill(String skill) {
		if (skill != null)
			skillList.add(skill);
		else
			System.out.println("Skill is null. Cannot added");
	}

	/*
	 * public Employee cloneIt() {
	 * 
	 * ArrayList<String> newList = new ArrayList<String>(); for(String s:skillList)
	 * { newList.add(s); }
	 * 
	 * Employee x = new Employee(this.empId, this.name, newList); return x; }
	 */

	public Object clone() {
		try {
			Employee x = (Employee) super.clone();
			
			
			ArrayList<String> newList = new ArrayList<String>();
			for (String s : skillList) {
				newList.add(s);
			}
			x.setSkillList(newList);
			
			return x;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSkillList() {
		return skillList;
	}

	public void setSkillList(List<String> skillList) {
		this.skillList = skillList;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", skils=" + skillList;
	}

}
