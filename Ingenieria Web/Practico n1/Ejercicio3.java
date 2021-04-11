
import java.util.Scanner;

public class Ejercicio3{

    public static void main(String[] args) {
        
        double num;

        int rep, i = 0;
        
        Scanner read = new Scanner(System.in);

        System.out.println( "What data type can be that number?" );

        System.out.println( "To how many numbers do you want to determine your primitive data?" );

        rep = read.nextInt();

        do{

            System.out.println( "Set a number to see what data type can be" );
            
            num = read.nextDouble();       

            whatDataType(num);

            i++;

        }while( i < rep );

        read.close();
    }


    static void whatDataType ( double n ){

        //byte 127
        //short 32767
        //int 2147483647
        //long 9223372036854775806

        if ( (n <= Byte.MAX_VALUE) && (n >= Byte.MIN_VALUE) ){

            System.out.println( "*Byte" );

        }


        if ( (n <= Short.MAX_VALUE) && (n >= Short.MIN_VALUE) ) {

            System.out.println( "*Short" ); 
        
        }
        

        if ( (n <= Integer.MAX_VALUE) && (n >= Integer.MIN_VALUE)){

            System.out.println( "*Int" ); 
        
        }


       if ( (n <= Long.MAX_VALUE) && (n >= Long.MIN_VALUE) ){

            System.out.println( "*Long" ); 
        
        }else{

                System.out.println( "n can't be fitted anywhere" );

            }

    }    

}


