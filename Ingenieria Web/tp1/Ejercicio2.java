
import java.util.Scanner;


public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        var word = "";

        System.out.println("The word is a palindrome?");

        while (true) {

            try {
                System.out.println("Enter the word");

                word = read.nextLine();

                validation(word);

                break;

            } catch (IllegalArgumentException e) {

                System.out.println(e);

            }

        }

        if (!isPalindrome(word)) {

            System.out.println("The word is not a palindrome");

        } else {

            System.out.println("The word is a palindrome");

        }

        read.close();
    }

    static boolean isPalindrome(String a) {

        int x = a.length() - 1;

        char[] comp = new char[a.length()];

        comp = a.toCharArray();

        for (int i = 0; i < (a.length() / 2); i++) {

            if (comp[i] != comp[x]) {

                return false;

            }

            x--;

        }

        return true;
    }

    static void validation(String a) {

        for (int i = 0; i < a.length(); i++) {
            
            char c = a.trim().charAt(i);
            
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                
              throw new IllegalArgumentException(
                  "Invalid parameter: " + a + ". Only English alphabet characters are allowed.");
            }
          }

    }

}
