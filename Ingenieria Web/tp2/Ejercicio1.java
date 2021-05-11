package Ejercicio1;

import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String xString;

        System.out.println("Enter q: ");

        while (true) {

            try {

                xString = read.nextLine();

                validation(xString);

                break;
            } catch (IllegalArgumentException e) {

                System.out.println(e);

            }

        }

        int q = Integer.parseInt(xString);

        parametherQ(q);

        int[][] array = new int[q][3];

        String numbers;

        

        while (true) {
            
            try {

                System.out.println("Enter a b n: ");

               

                for (int i = 0; i < q; i++) {

                     numbers = read.nextLine();
        
                    String[] arrayStrings = numbers.split(" ");
        
                    for (int j = 0; j < 3; j++) {
        
                        validation(arrayStrings[j]);
        
                        if (j == 0) {
        
                            array[i][j] = Integer.parseInt(arrayStrings[j]);
        
                            parametherA(array[i][j]);
        
                        }
        
                        if (j == 1) {
        
                            array[i][j] = Integer.parseInt(arrayStrings[j]);
        
                            parametherB(array[i][j]);
        
                        }
        
                        if (j == 2) {
        
                            array[i][j] = Integer.parseInt(arrayStrings[j]);
        
                            parametherN(array[i][j]);
        
                        }
        
                    }
        
                }

                break;
                
            } catch (IllegalArgumentException e) {
                
                System.out.println(e);

            }

        }

        read.close();

        for (int f = 0; f < q; f++) {

            serie(f, 0, array);

        }

    }

    public static void serie(int f, int x, int[][] array) {

        if (x == array[f][2]) {

            System.out.println();

            return;
        }

        int sol = 0;

        for (int i = 0; i < x; i++) {

            sol = (int) (sol + (Math.pow(2, i) * array[f][1]));

        }

        System.out.print((int) (array[f][0] + sol + (Math.pow(2, x) * array[f][1])) + " ");

        x++;

        serie(f, x, array);

    }

    static void validation(String x) {

        for (int i = 0; i < x.length(); i++) {

            char c = x.charAt(i);

            if ((c >= 'a' && c <= 'z')) {

                throw new IllegalArgumentException(
                        "Invalid parameter:" + x + ". Only numerics characters are allowed.");

            }

        }

    }

    static void parametherQ(int q) {

        if (q > 500 || q < 0) {

            throw new IllegalArgumentException("Invalid parameter:q. Must be between 0 and 500 inclusive.");

        }

    }

    static void parametherA(int a) {

        if (a > 50 || a < 0) {

            throw new IllegalArgumentException("Invalid parameter:a. Must be between 0 and 50 inclusive.");

        }

    }

    static void parametherB(int b) {

        if (b > 50 || b < 0) {

            throw new IllegalArgumentException("Invalid parameter:b. Must be between 0 and 50 inclusive.");

        }

    }

    static void parametherN(int n) {

        if (n > 15 || n < 0) {

            throw new IllegalArgumentException("Invalid parameter:n. Must be between 0 and 15 inclusive.");

        }

    }

}
