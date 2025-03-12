package inheritance2a;


public class Person {

      String name = "Manal" ;
      int age = 19 ;
      
      void introduce() {
    	  System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
      }
	
}


class School extends Person {
	
	void nameschool() {
		System.out.println("fatima complex business school");
	}
}


