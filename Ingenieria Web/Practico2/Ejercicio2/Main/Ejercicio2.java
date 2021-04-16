package Main;

import MyPoint3D.MyPoint3D;

public class Ejercicio2 {

    public static void main(String[] args) {

        System.out.println("Hello world");

        MyPoint3D point = new MyPoint3D( 1, 1, 1 );

        MyPoint3D point2 = new MyPoint3D( 1, 1, 1 );

        MyPoint3D point3 = new MyPoint3D( 6, 7, 8 );

        int [] xy = new int [2];
        xy[0] = 4;
        xy[1] = 4;

        MyPoint3D another = new MyPoint3D(5, 5, 5);

        System.out.println( point.distance(2, 2, 2) ); //distance point (1;1;1) to point (2;2;2)

        System.out.println( point.distance(xy) ); //distance point (1;1) to array point (4;4)

        System.out.println( point.distance(another) ); //distance point (1;1;1) to another point (5;5;5)

        System.out.println( point.distance() ); //distance point to (0;0;0)

        System.out.println( point.toString() ); //point (1;1;1)
        
        System.out.println( point.equals(point2) ); //point (1;1;1) to point (1;1;1) comparison

        System.out.println( point.equals(point3) ); //point (1;1;1) to point (6;7;8) comparison

    }



}
