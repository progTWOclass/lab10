import java.util.Scanner;
public class RecursiveReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a word/sentence");
        String word = input.nextLine();
        System.out.println("your reverse word is " + reverse(word));
    }

    public static String reverse(String word){
        if(word == null || word.length() <= 1){
            return word;
        }
        /*reverse("Hello")
        (reverse("ello")) + "H"
        ((reverse("llo")) + "e") + "H"
        (((reverse("lo")) + "l") + "e") + "H"
        ((((reverse("o")) + "l") + "l") + "e") + "H"
        (((("o") + "l") + "l") + "e") + "H"
        "olleH"
        */
        return reverse(word.substring(1)) + word.charAt(0);
    }
}
