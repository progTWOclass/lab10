import java.util.Scanner;
public class RecursivePalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word to check if it is a palindrome: ");
        String word = input.nextLine();

        //[^a-zA-Z] = anything that is NOT in the range of a lowercase or an uppercase characters
        //and replace it with nothing "", and making sure that the characters are not case sensitive
        String cleanNonCharacter = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

        if(palindrome(word)){
            System.out.println("your word is a palindrome");
        }else{
            System.out.println("Your word is not a palindrome");
        }
    }

    public static boolean palindrome(String word){
        //check if the string is empty, meaning we have successfully processed every character in the string
        //if the string is only one character long, it is a palindrome automatically
        if(word.isEmpty() || word.length() == 1){
            return true;
        }

        //get the first character and the last character, and compares them
        //if they are the same, then we can proceed to the next step which is substring
        if(word.charAt(0) == word.charAt(word.length() - 1)){

            //we remove the first and last character, and then we start comparing the
            //middle section of the word/sentence.
            return palindrome(word.substring(1, word.length() - 1));
        }
        return true;
    }
}
