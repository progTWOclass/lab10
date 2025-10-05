import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number for calculating your fibonacci");
        int number = input.nextInt();

        for(int i = 0; i <= number; i++){
            System.out.print(recursiveFibonacci(i) + " ");
        }
        System.out.println("\nyour fibonacci number is " + recursiveFibonacci(number));
    }

    public static int recursiveFibonacci(int n){

        /*f(n) = f(n-1) + f(n-2)
        * if n = 6
        * the program starts "going down" like a tree
        * f(6) = f(5) + f(4)
        * f(5) = f(4) + f(3)
        * f(4) = f(3) + f(2)
        * f(3) = f(2) + f(1)
        * f(2) = f(1) --> f(2) = 1
        *
        * f(1) and f(0) is both equal to 1 because of the base case
        *
        * once it finds what it needs, it starts "going back up"
        * f(3) = f(2) + f(1) --> f(3) = 1 + 1 = 2
        * f(4) = f(3) + f(2) --> f(4) = 2 + 1 = 3
        * f(5) = f(4) + f(3) --> f(5) = 3 + 2 = 5
        * f(6) = f(5) + f(4) --> f(6) = 5 + 3 = 8
        * therefore, the program returns 8
        * */
        if(n <= 1){
            return n; //Returns whatever n is at the current moment
        }
        return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
    }
}
