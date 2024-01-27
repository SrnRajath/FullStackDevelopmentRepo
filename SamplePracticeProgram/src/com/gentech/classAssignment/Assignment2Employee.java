package com.gentech.classAssignment;
class Employee {
	String name;
	int age;
	String gender;
	int empId;
}

class Department {
	String DeptName;
	int DeptId;
	String location;
	String strength;
}

class Insurance {
	String insurer;
	String type;
	int nuOfdependents;
	int amount;
}

class Savings {
	String type;
	String riskCoverage;
	int savingAmount;
	int duration;
}

public class Assignment2Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.name = "Agastya";
		emp.age = 10;
		emp.gender = "Boy";
		emp.empId = 123;
		System.out.println("---------Employee details----------");
		System.out.println("empdent: "+emp.name);
		System.out.println("age: "+emp.age);
		System.out.println("Gender: "+emp.gender);
		System.out.println("Roll Number: "+emp.empId);
		System.out.println();
		Department dept = new Department();
		dept.DeptName ="Digital eng";
		dept.DeptId = 111;
		dept.location = "Bangalore";
		dept.strength = "100 Employeed";
		System.out.println("---------department details----------");
		System.out.println("Name: "+dept.DeptName);
		System.out.println("Dept Id: "+dept.DeptId);
		System.out.println("location: "+dept.location);
		System.out.println("Strength: "+dept.strength);
		System.out.println();
		Insurance ins = new Insurance();
		ins.insurer = "Icici";
		ins.type = "Comprehensive";
		ins.nuOfdependents = 4;
		ins.amount = 15000;
		System.out.println("---------insurance details----------");
		System.out.println("Insurer: "+ins.insurer);
		System.out.println("type: "+ins.type);
		System.out.println("number of depandants covered: "+ins.nuOfdependents);
		System.out.println("Amount: "+ins.amount);
		System.out.println();
		Savings saving = new Savings();
		saving.type = "FD";
		saving.riskCoverage = "Dependent to get amount";
		saving.duration = 10;
		saving.savingAmount = 11000;
		System.out.println("--------------savings details-----------");
		System.out.println("Type: "+saving.type);
		System.out.println("risk coverage: "+saving.riskCoverage);
		System.out.println("duration: "+saving.duration);
		System.out.println("saving amount: "+saving.savingAmount);
		System.out.println();

	}

}
