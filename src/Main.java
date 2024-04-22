import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        final byte MONTHS = 12;
        String monthlyPayment;

// takes inputs from the terminal
        System.out.print("Requested amount: ");
        int requestedAmount = read.nextInt();
        System.out.print("Interest rate: ");
// annual percentage calculator
        double annualInterestRate = read.nextDouble() / 100;
        double monthlyInterestRate = annualInterestRate / MONTHS;
        System.out.print("Period: ");
        int period = read.nextInt();

// calculate the monthly payment for the mortgage
        double x = Math.pow((1 + monthlyInterestRate), (period * MONTHS));
        monthlyPayment = NumberFormat.getCurrencyInstance(Locale.ITALY).format((requestedAmount * (monthlyInterestRate * x) / (x - 1)));

        System.out.print("Your monthly payment is: " + monthlyPayment);
    }
}