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
        * if n = 5
        * the program starts "going down" like a tree
        * f(5) = f(4) + f(3)
        * f(4) = f(3) + f(2)
        * f(3) = f(2) + f(1)
        * f(2) = f(1) + f(0) --> f(2) = 1 + 1 = 2
        * f(1) = f(0)
        *
        * f(1) and f(0) is both equal to 1 because of the base case
        *
        * once it finds what it needs, it starts "going back up"
        * f(3) = f(2) + f(1) --> f(3) = 2 + 1 = 3
        * f(4) = f(3) + f(2) --> f(4) = 3 + 2 = 5
        * f(5) = f(4) + f(3) --> f(5) = 5 + 3 = 8
        *
        * therefore, the program returns 8
        * */
        if(n == 0){
            return 0;//base case since f(0) starts at 0
        }else if (n == 1 || n == 2){
            return 1;//base case since f(1) and f(2) are both 1
        }
        return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
    }
}
