import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Provide the amount of the lease: ");
        Double totalLeasedMoney = scan.nextDouble();

        System.out.println("Provide the amount of the down payment: ");
        Double downPayment = scan.nextDouble();

        System.out.println("Please enter the interest rate: ");
        Double interestRate = scan.nextDouble();

        System.out.println("Provide the months of the lease: ");
        Integer months = scan.nextInt();

        Payment payment = new Payment(totalLeasedMoney, downPayment, interestRate, months);

        Double monthlyPayment = payment.getMonthlyPayment();
        System.out.println("Monthly payment is $" + monthlyPayment);
    }
}