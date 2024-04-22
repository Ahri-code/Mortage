import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        final byte MONTHS = 12;
        String monthlyPayment;
        int requestedAmount;
        double annualInterestRate;
        int period;

// every do-while takes inputs from the terminal checking if the input is an accepted value
        do {
            System.out.print("Requested amount (€1k - €1M): ");
            requestedAmount = read.nextInt();
        } while(requestedAmount < 1000 || requestedAmount > 1000000);

        do {
            System.out.print("Interest rate (1 - 30): ");
            annualInterestRate = read.nextDouble();
        } while(annualInterestRate < 1 || annualInterestRate > 30);
        double monthlyInterestRate = annualInterestRate / 100 / MONTHS;

        do {
            System.out.print("Period (1 - 30): ");
            period = read.nextInt();
        } while(period < 1 || period > 30);

// calculate the monthly payment for the mortgage
        double x = Math.pow((1 + monthlyInterestRate), (period * MONTHS));
        monthlyPayment = NumberFormat.getCurrencyInstance(Locale.ITALY).format((requestedAmount * (monthlyInterestRate * x) / (x - 1)));

        System.out.print("Your monthly payment is: " + monthlyPayment);
    }
}