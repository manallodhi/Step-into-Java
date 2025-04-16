package JavaMath;

import java.util.Scanner;
import java.util.Random;

    // Q#1 (Finding Square root of a number)

public class SquareRootFinder {
	
	double number;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextDouble();
    }

    void findSquareRoot() {
        double result = Math.sqrt(number);
        System.out.println("Square Root: " + result);
    }

}

      // Q#2 (generating random number)

class RandomNumberGenerator {
    void generate() {
        Random rand = new Random();
        System.out.println("Random Numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.println(rand.nextInt(100) + 1);
        }
    }
}

      // Q#3 (Power Calculator)

class PowerCalculator {
    double base, exponent;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        base = sc.nextDouble();
        System.out.print("Enter exponent: ");
        exponent = sc.nextDouble();
    }

    void calculate() {
        double result = Math.pow(base, exponent);
        System.out.println("Result: " + result);
    }
}

       // Q#4 (Absolute difference)

class AbsoluteDifference {
    int num1, num2;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
    }

    void findDifference() {
        int result = Math.abs(num1 - num2);
        System.out.println("Absolute Difference: " + result);
    }
}

        // Q#5 (Max of 3 numbers)

class MaxOfThree {
    int a, b, c;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        System.out.print("Enter third number: ");
        c = sc.nextInt();
    }

    void findMax() {
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Maximum Number: " + max);
    }
}
