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
        if(row < 1){
            return 0;
        }
        return generatePins(row-1) + row;
    }
}
