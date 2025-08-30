import java.util.Scanner;

public class SimpleInterestCalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SIMPLE INTEREST CALCULATOR ===");
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter annual interest rate (%): ");
        double annualRate = scanner.nextDouble();
        System.out.print("Enter years: ");
        int years = scanner.nextInt();
        
        System.out.print("Enter months: ");
        int months = scanner.nextInt();
        
        System.out.print("Enter days: ");
        int days = scanner.nextInt();

        double totalYears = convertToYears(years, months, days);

        double interest = calculateSimpleInterest(principal, annualRate, totalYears);
        double totalAmount = principal + interest;

        System.out.println("\n=== CALCULATION RESULTS ===");
        System.out.printf("Principal: %.2f%n", principal);
        System.out.printf("Annual Interest Rate: %.2f%%%n", annualRate);
        System.out.printf("Time Period: %d years, %d months, %d days%n", years, months, days);
        System.out.printf("Total Time: %.4f years%n", totalYears);
        System.out.printf("Simple Interest: %.2f%n", interest);
        System.out.printf("Total Amount: %.2f%n", totalAmount);
        
        scanner.close();
    }
    
    public static double convertToYears(int years, int months, int days) {

        double monthsFraction = months / 12.0;
        double daysFraction = days / 365.0; // Using 365 days per year
        return years + monthsFraction + daysFraction;
    }
    
    public static double calculateSimpleInterest(double principal, double annualRate, double timeInYears) {
        return principal * (annualRate / 100) * timeInYears;
    }

}

