package com.gentech.classAssignment;
class student {
	String name;
	int age;
	String gender;
	int rollNo;
}

class Library {
	String book;
	int bookId;
	String location;
	String section;
}

class ComputerLab {
	String instructor;
	String language;
	int systems;
	int duration;
}

class Sports {
	String sportsName;
	String gameType;
	int numberOfPlayers;
	String equipment;
}

public class Assignment1Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student stu = new student();
		stu.name = "Agastya";
		stu.age = 10;
		stu.gender = "Boy";
		stu.rollNo = 123;
		System.out.println("---------sudent details----------");
		System.out.println("student: "+stu.name);
		System.out.println("age: "+stu.age);
		System.out.println("Gender: "+stu.gender);
		System.out.println("Roll Number: "+stu.rollNo);
		System.out.println();
		Library lib = new Library();
		lib.book ="independent India";
		lib.bookId = 1;
		lib.location = "last row";
		lib.section = "History";
		System.out.println("---------Library details----------");
		System.out.println("book: "+lib.book);
		System.out.println("book Id: "+lib.bookId);
		System.out.println("location: "+lib.location);
		System.out.println("section: "+lib.section);
		System.out.println();
		ComputerLab comp = new ComputerLab();
		comp.instructor = "Prabhakar";
		comp.language = "Advanced java";
		comp.systems = 30;
		comp.duration = 15;
		System.out.println("---------computer lab details----------");
		System.out.println("Instructor: "+comp.instructor);
		System.out.println("language: "+comp.language);
		System.out.println("Number of system: "+comp.systems);
		System.out.println("Duration: "+comp.duration);
		System.out.println();
		Sports sport = new Sports();
		sport.equipment = "bat, boll, wicket";
		sport.gameType = "outdoor";
		sport.sportsName = "Cricket";
		sport.numberOfPlayers = 11;
		System.out.println("--------------Sports details-----------");
		System.out.println("name: "+sport.sportsName);
		System.out.println("type: "+sport.gameType);
		System.out.println("players: "+sport.numberOfPlayers);
		System.out.println("equipments: "+sport.equipment);
		System.out.println();

	}

}
