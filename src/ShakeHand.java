import java.util.Scanner;
public class ShakeHand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the amount of people");
        int person = input.nextInt();

        System.out.println("the total amount of handshake for " + person + " person in a room is " + handShake(person));
    }

    public static int handShake(int person){
        if(person < 1){
            return 0;
        }
        return  handShake(person - 1) + (person - 1);
    }
}