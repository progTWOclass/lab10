import java.util.Scanner;
public class ShakeHand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the amount of people");
        int person = input.nextInt();

        handShake(person);
    }

    public static int handShake(int person){
        if(person <= 1){
            return 0;
        }

        int countHandShake = 0;
        if(person%2 == 0){
            countHandShake++;
        }else{

        }
        System.out.println(countHandShake);
        handShake(person - 2);
        return countHandShake;
    }
}