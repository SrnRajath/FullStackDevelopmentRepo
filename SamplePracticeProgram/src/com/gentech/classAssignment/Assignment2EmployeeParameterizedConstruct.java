package com.gentech.classAssignment;
class Employee1 {
	String name;
	int age;
	String gender;
	int empId;
	Employee1(String n,	int ag,	String gen, int eId){
		name = n;
		age = ag;
		gender = gen;
		empId = eId;
		System.out.println("---------Employee details----------");
		System.out.println("empdent: "+name);
		System.out.println("age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Roll Number: "+empId);
		System.out.println();
	}
}

class Department1 {
	String DeptName;
	int DeptId;
	String location;
	String strength;
	Department1(String de, int dId, String ln, String st) {
		DeptName = de;
		DeptId = dId;
		location = ln;
		strength = st;
		System.out.println("---------department details----------");
		System.out.println("Name: "+DeptName);
		System.out.println("Dept Id: "+DeptId);
		System.out.println("location: "+location);
		System.out.println("Strength: "+strength);
		System.out.println();
	}
}

class Insurance1 {
	String insurer;
	String type;
	int nuOfdependents;
	int amount;
	Insurance1(String in, String ty, int nu, int am) {
		insurer = in;
		type = ty;
		nuOfdependents = nu;
		amount = am;
		System.out.println("---------insurance details----------");
		System.out.println("Insurer: "+insurer);
		System.out.println("type: "+type);
		System.out.println("number of depandants covered: "+nuOfdependents);
		System.out.println("Amount: "+amount);
		System.out.println();
	}
}

class Savings1 {
	String type;
	String riskCoverage;
	int savingAmount;
	int duration;
	Savings1(String ty,	String ri, int sa, int du) {
		type = ty;
		riskCoverage = ri;
		duration = sa;
		savingAmount = du; 
		System.out.println("--------------savings details-----------");
		System.out.println("Type: "+type);
		System.out.println("risk coverage: "+riskCoverage);
		System.out.println("duration: "+duration);
		System.out.println("saving amount: "+savingAmount);
		System.out.println();
	}
}

public class Assignment2EmployeeParameterizedConstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 emp = new Employee1("Agastya", 10, "M", 123);
		
		Department1 dept = new Department1("Digital eng", 111,"Bangalore", "100 Employeed");
		
		Insurance1 ins = new Insurance1("Icici","Comprehensive",4,15000);
		
		Savings1 saving = new Savings1("FD","Dependent to get amount", 10, 11100);
		

	}

}
