import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee's earnings: ");
        double earnings = scanner.nextDouble();

        double tax = calculateTax(earnings);

        System.out.println("Income Tax to be paid: Rs. " + tax);
        scanner.close();
    }

    public static double calculateTax(double earnings) {
        double tax = 0;

        if (earnings <= 80000) {
            tax = 0;
        } else if (earnings <= 90000) {
            tax = (earnings - 80000) * 0.10;
        } else if (earnings <= 130000) {
            tax = (10000 * 0.10) + (earnings - 90000) * 0.20;
        } else {
            tax = (10000 * 0.10) + (40000 * 0.20) + (earnings - 130000) * 0.30;
        }

        return tax;
    }
}
