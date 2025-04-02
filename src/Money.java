import java.util.Scanner;
public class Money {
    //f(x)=f(n)×(1+p)power 2
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an initial amount");
        double initialAmount = input.nextDouble();
        System.out.println("please enter an interest rate");
        double rate = input.nextDouble();
        System.out.println("please enter how many years you plan to leave this money");
        int year = input.nextInt();

        calculateInterest(initialAmount, rate, year);
    }

    public static void calculateInterest(double initialAmount, double rate, int year) {
        if (year <= 0) {
            return;
        }

        int countYear = year;
        double amount = initialAmount * Math.pow((1 + rate / 100), year);
        System.out.printf("your amount is %.2f in year %d\n", amount, countYear);
        countYear--;
        calculateInterest(initialAmount, rate, year - 1);
    }
}
