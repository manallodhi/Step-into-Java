package studentclass;

public class Student {

	String name = "Manal" ;
	double marks = 80 ;
	
	void check() {
		if(marks>=50) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
	}
	
}
