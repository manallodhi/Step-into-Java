package Runtime;

import java.util.Scanner; // Import Scanner

public class runtimeinput {
	
	    String name;
	    int age;

	    // Method to take input
	    void getInput() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter your name: ");
	        name = sc.nextLine();
	        System.out.print("Enter your age: ");
	        age = sc.nextInt();
	    }

	    // Method to display details
	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}


