

import java.util.*;

public class Ejercicio1{
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        String a, b;

        System.out.println("The words are an anagram?");

        while (true) {
            try {

                System.out.println("Set the first word");
                a = read.nextLine();
                a = a.toLowerCase().trim();

                
                validation(a);

                break;
            } catch (IllegalArgumentException e) {
              System.out.println(e);
            }
        }


        while (true) {
            try {

                System.out.println("Set the second word");
                b = read.nextLine();
                b = b.toLowerCase().trim();
        
                validation(b);

                break;
            } catch (IllegalArgumentException e) {
              System.out.println(e);
            }
        }
            

        if( isAnagram(a, b) ){

            System.out.println("The words are an anagram!");

        }else{

            System.out.println("The words are not an anagram");

        }

        read.close();
    }

    static boolean isAnagram ( String a, String b ){

        char [] comp1 = a.toCharArray();
        char [] comp2 = b.toCharArray();

        Arrays.sort( comp1 );
        Arrays.sort( comp2 );

        for( int i = 0; i < a.length(); i++){

            if (comp1[i] != comp2[i]){

                return false;

            }

        }
        return true;
    }

    static void validation( String a ){
        
        for( int i = 0; i < a.length(); i++ ){

            char c = a.charAt(i);

            if( !( c >= 'a' && c <= 'z')){

                throw new IllegalArgumentException("Invalid parameter:"+ a + ". Only English alphabet characters are allowed.") ;

            }

        }
    }
}

