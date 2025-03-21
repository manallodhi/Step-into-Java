package Polymorphism;

public class Employee {
    // Method 1: Calculates bonus as 5% of base salary (int version)
    int calculateBonus(int baseSalary) {
        return (int) (baseSalary * 0.05);
    }

    // Method 2: Calculates bonus based on salary (double) and performance rating (1-5)
    double calculateBonus(double baseSalary, int rating) {
        double bonusPercentage;
        switch (rating) {
            case 5:
                bonusPercentage = 0.20;
                break;
            case 4:
                bonusPercentage = 0.15;
                break;
            case 3:
                bonusPercentage = 0.10;
                break;
            case 2:
                bonusPercentage = 0.05;
                break;
            case 1:
            default:
                bonusPercentage = 0.0;
                break;
        }
        return baseSalary * bonusPercentage;
    }
}