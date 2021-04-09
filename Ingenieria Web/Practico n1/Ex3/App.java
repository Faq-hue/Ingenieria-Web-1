
import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        
        String num = new String();

        Scanner read = new Scanner(System.in);

        System.out.println( "What data type is that number?" );

        System.out.println( "Set a number to see what data type is" );
        num = read.nextLine();

        whatDataType(num);

        read.close();
    }


    static void whatDataType ( String n ){

     if ( n > 10 ){

     }


    }

    

}