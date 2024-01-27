package com.gentech.classAssignment;

class EmployeeIns {
    String eName;
    String jName;
    int salary;
    EmployeeIns(String eName, String jName, int salary) {
        this.eName=eName;
        this.jName=jName;
        this.salary=salary;
        System.out.println("Inside constructor----");
        System.out.println("ename: "+this.eName+"jName: "+this.jName+"salary: "+this.salary);
    }
    void show() {
        System.out.println("Inside show method----");
        System.out.println("ename: "+eName+"jName: "+jName+"salary: "+salary);
    }
}
public class InstanceVariableDemo {
    public static void main(String[] args) {
        EmployeeIns e = new EmployeeIns("Rajath", "Specialist", 3000000);
        e.show();
    }
}

