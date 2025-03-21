package Polymorphism;

public class polymorphismMain {

	public static void main(String[] args) {
		
		Employee emp = new Employee();

        // Calling first overloaded method
        int bonus1 = emp.calculateBonus(50000); // 5% of 50000
        System.out.println("Bonus for base salary (int): " + bonus1);

        // Calling second overloaded method with different ratings
        double bonus2 = emp.calculateBonus(60000.0, 5); // 20% of 60000
        double bonus3 = emp.calculateBonus(60000.0, 3); // 10% of 60000
        double bonus4 = emp.calculateBonus(60000.0, 1); // No bonus

        System.out.println("Bonus for rating 5: " + bonus2);
        System.out.println("Bonus for rating 3: " + bonus3);
        System.out.println("Bonus for rating 1: " + bonus4);

	}

}
