
import java.util.Scanner;

public class Ejercicio3{

    public static void main(String[] args) {
        
        String num = new String();

        int rep = 0;

        String repString;
        
        Scanner read = new Scanner(System.in);

        System.out.println( "What data type can be that number?" );

        while (true){

            try {

                System.out.println( "To how many numbers do you want to determine your primitive data?" );
                
                repString = read.nextLine();

                validation(repString);

                break;
            } catch (IllegalArgumentException e) {

                System.out.println(e);

            }
            
        }

        rep = Integer.valueOf(repString);

        for(int i = 0; i < rep; i++){
    
            while(true){
            
                try {
                    System.out.println( "Set a number to see what data type can be" );
                    num = read.nextLine();
    
                    validation(num);
    
                    whatDataType(num);
                    break;
    
                } catch (IllegalArgumentException e) {
                    
                    System.out.println(e);

                }

            }
            
        }

     
        read.close();
    }


    static void whatDataType ( String n ){

        //byte 127
        //short 32767
        //int 2147483647
        //long 9223372036854775806

        double n2 = Double.parseDouble(n);

        if ( (n2 <= Byte.MAX_VALUE) && (n2 >= Byte.MIN_VALUE) ){

            System.out.println( "*Byte" );

        }


        if ( (n2 <= Short.MAX_VALUE) && (n2 >= Short.MIN_VALUE) ) {

            System.out.println( "*Short" ); 
        
        }
        

        if ( (n2 <= Integer.MAX_VALUE) && (n2 >= Integer.MIN_VALUE)){

            System.out.println( "*Int" ); 
        
        }


       if ( (n2 <= Long.MAX_VALUE) && (n2 >= Long.MIN_VALUE) ){

            System.out.println( "*Long" ); 
        
        }else{

                System.out.println( "n can't be fitted anywhere" );

            }

    }    

    static void validation ( String n ){

        for( int i = 0; i < n.length(); i++ ){

            char c = n.charAt(i);

            if( ( c >= 'a' && c <= 'z')){

                throw new IllegalArgumentException("Invalid parameter:"+ n + ". Only numerics characters are allowed.") ;

            }

        }


    }

}


