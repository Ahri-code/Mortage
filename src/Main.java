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
            if(requestedAmount >= 1000 && requestedAmount <= 1000000) {
                break;
            }
            System.out.print("Please type a number between 1k and 1M\n");
        } while(true);

        do {
            System.out.print("Interest rate (1 - 30): ");
            annualInterestRate = read.nextDouble();
            if(annualInterestRate > 0 && annualInterestRate <= 30) {
                break;
            }
            System.out.print("Please type a number between 1 and 30\n");
        } while(true);
        double monthlyInterestRate = annualInterestRate / 100 / MONTHS;

        do {
            System.out.print("Period (1 - 30): ");
            period = read.nextInt();
            if(period > 0 && period <= 30) {
                break;
            }
            System.out.print("Please type a number between 1 and 30\n");
        } while(true);

// calculate the monthly payment for the mortgage
        double x = Math.pow((1 + monthlyInterestRate), (period * MONTHS));
        monthlyPayment = NumberFormat.getCurrencyInstance(Locale.ITALY).format((requestedAmount * (monthlyInterestRate * x) / (x - 1)));

        System.out.print("Your monthly payment is: " + monthlyPayment);
    }
}