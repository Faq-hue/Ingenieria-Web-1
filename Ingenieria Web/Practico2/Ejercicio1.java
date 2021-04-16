package Ejercicio1;

import java.util.*;

public class Ejercicio1 {
    
    public static void main (String[] args){

        Scanner read = new Scanner(System.in);
        
        int q;
        
        q = read.nextInt();

        while ( q < 0 || q > 500 ){

            System.out.println( "0 <= q <= 500" );
            q = read.nextInt();

        }

        int [][] array = new int [q][3];

        for ( int i = 0; i < q; i++){

            for ( int j = 0; j < 3; j++){

                if ( j == 0 ){

                    array [i][j] = read.nextInt();

                    while ( array [i][j] < 0 || array [i][j] > 50 ){
        
                        System.out.println( "0 <= a <= 50" );
                        array [i][j] = read.nextInt();
        
                    }
                }

                if ( j == 1 ){

                    array [i][j] = read.nextInt();
        
                    while ( array [i][j] < 0 || array [i][j] > 50 ){
        
                        System.out.println( "0 <= b <= 50" );
                        array [i][j] = read.nextInt();
        
                    }
                }

                if ( j == 2){

                    array [i][j] = read.nextInt();

                    while ( array [i][j] < 0 || array [i][j] > 15 ){
        
                        System.out.println( "0 <= n <= 15" );
                        array [i][j] = read.nextInt();
        
                    }
                }
        

            }


        }

        read.close();

        show(q, array);

        for ( int f = 0; f < q; f++ ){

            serie( f, 0, array);

        }

        

    }

    public static void show ( int q, int [][] array ){

        System.out.println(q);

        for ( int i = 0; i < q; i++){

            for ( int j = 0; j < 3; j++){

                System.out.print( array[i][j] + " " );
              

            }

            System.out.println();

        }

    }

    public static void serie( int f, int x, int [][] array ){

        if ( x == array[f][2] ){

            System.out.println();

            return;
        }

        int sol = 0 ;

        for(int i = 0; i < x; i++){

            sol = (int) (sol + ( Math.pow( 2, i ) * array[f][1] ) ) ;

        }
        
        System.out.print( (int) (array[f][0] + sol + (Math.pow( 2,x ) * array[f][1])) + " ");
  
        x++;

        serie( f, x, array );

    }

}
