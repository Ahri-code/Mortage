import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int mortage;

// takes inputs from the terminal
        System.out.print("Requested amount: ");
        int requestedAmount = read.nextInt();
        System.out.print("Interest rate: ");
        double interestRate = read.nextDouble();
        System.out.print("Period: ");
        int period = read.nextInt();
    }
}