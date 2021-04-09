

import java.util.*;

public class App{
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        String a, b;

        System.out.println("The words are an anagram?");

        System.out.println("Set the first word");
        a = read.nextLine();

        System.out.println("Set the second word");
        b = read.nextLine();

        if( !isAnagram(a, b) ){

            System.out.println("The words are an anagram!");

        }else{

            System.out.println("The words are not an anagram");

        }

        read.close();
    }



    static boolean isAnagram ( String a, String b ){

        char [] comp1 = new char [a.length()];
        char [] comp2 = new char [b.length()];

        a.toLowerCase().trim();
        b.toLowerCase().trim();

        comp1 = a.toCharArray();
        comp2 = b.toCharArray();

        Arrays.sort( comp1 );
        Arrays.sort( comp2 );

        for( int i = 0; i < a.length(); i++){

            if (comp1 != comp2){

                return false;

            }

        }
        return true;
    }
}