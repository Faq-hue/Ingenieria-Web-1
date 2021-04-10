
import java.util.Scanner;


public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner( System.in );

        String word;

        System.out.println( "The word is a palindrome?" );
        
        System.out.println( "Enter the word" );
        word = read.nextLine();

        if ( !isPalindrome( word ) ){

            System.out.println( "The word is not a palindrome" );

        }else{

            System.out.println( "The word is a palindrome" );

        }

        read.close();
    }


    static boolean isPalindrome ( String a ){

        a.toLowerCase().trim();        

        int x = a.length() -1;

        char [] comp = new char[ a.length() ];

        comp = a.toCharArray();

        for ( int i = 0; i < (a.length()/2); i++ ){
            
            if ( comp[i] != comp[ x ] ){
      
                return false;

            }

             x--;

        }

        return true;
    }

}
