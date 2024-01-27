package com.gentech.classAssignment;
class student1 {
	String name;
	int age;
	String gender;
	int rollNo;
	student1(String nm, int ag, String gen, int roll){
		name = "Agastya";
		age = 10;
		gender = "Boy";
		rollNo = 123;
		System.out.println("---------sudent details----------");
		System.out.println("student: "+name);
		System.out.println("age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Roll Number: "+rollNo);
		System.out.println();
	}
}

class Library1 {
	String book;
	int bookId;
	String location;
	String section;
	Library1(String bk,	int bkId, String ln, String sn){
		book = bk;
		bookId = bkId;
		location = ln;
		section = sn;
		System.out.println("---------Library details----------");
		System.out.println("book: "+book);
		System.out.println("book Id: "+bookId);
		System.out.println("location: "+location);
		System.out.println("section: "+section);
		System.out.println();
	}
}

class ComputerLab1 {
	String instructor;
	String language;
	int systems;
	int duration;
	ComputerLab1(String in,	String la, int sy, int du) {
		instructor = in;
		language = la;
		systems = sy;
		duration = du;
		System.out.println("---------computer lab details----------");
		System.out.println("Instructor: "+instructor);
		System.out.println("language: "+language);
		System.out.println("Number of system: "+systems);
		System.out.println("Duration: "+duration);
		System.out.println();
	}
}

class Sports1 {
	String sportsName;
	String gameType;
	int numberOfPlayers;
	String equipment;
	Sports1(String sp, String ga, int nu, String eq){
		equipment = eq;
		gameType = ga;
		sportsName = sp;
		numberOfPlayers = nu;
		System.out.println("--------------Sports details-----------");
		System.out.println("name: "+sportsName);
		System.out.println("type: "+gameType);
		System.out.println("players: "+numberOfPlayers);
		System.out.println("equipments: "+equipment);
		System.out.println();
	}
}

public class Assignment1StudentParameterizedConstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 stu = new student1("Agastya", 10, "Boy", 123);
		
		Library1 lib = new Library1("independent India", 1, "last row", "History");
		
		ComputerLab1 comp = new ComputerLab1("Prabhakar", "Advanced java", 30, 15);
		
		Sports1 sport = new Sports1("bat, boll, wicket", "outdoor", 11, "Cricket");
		

	}

}
