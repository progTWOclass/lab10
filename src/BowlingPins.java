import java.util.Scanner;
public class BowlingPins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number of rows: ");
        int row = input.nextInt();

        System.out.println("For " + row + " rows, you will have " + generatePins(row) + " pins");
        for (int i = 1; i <= row; i++){
            System.out.println("Pins in row " + i + " have " + generatePins(i) + " pins");
        }
    }

    public static int generatePins(int row){

        /* ex: row = 3
        * generatePins(3-1) + 3 --> generatePins(2)
        * generatePins(2-1) + 2 + 3 --> generatePins(1)
        * generatePins(1-1) + 1 + 2 + 3 --> generatePins(0) = 0
        *
        * we know that generatePins(0) is 0 because of our base case
        *
        * therefore, the program starts going back up and add all those numbers together
        * answer is 6 pins
        * */

        if(row < 1){
            return 0;
        }
        return generatePins(row-1) + row;
    }
}
