package Inheritance1a;

public class Brand {

	void startEngine() {
		System.out.println("The vehicle engine starts.");
	}
}	

	class Car extends Brand {
		
		void methodhonk() {
			System.out.println("The car honks");
		}
	}


