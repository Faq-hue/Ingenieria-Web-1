public class App {

    public static void main(String[] args) {
        
        int x = 4, y = 7, z = 2;
        int side1 = 4, side2 = 3;

        //Rectangle
        Rectangle r = new Rectangle(side1);

        r.setHeight(x);
        r.setWidth(y);
        
        System.out.println("\n" + r.getName());
        System.out.println("Sides: " + r.getNumSides());
        System.out.println("Width: " + r.getWidth());
        System.out.println("Height: " + r.getHeight());
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());

        System.out.println("\nResize");
        r.resize(z);
        System.out.println("Width: " + r.getWidth());
        System.out.println("Height: " + r.getHeight());
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());

        //Triangle         
        RtTriangle t = new RtTriangle(side2);

        t.setHeight(y);
        t.setWidth(x);

        System.out.println("\n" + t.getName());
        System.out.println("Sides: " + t.getNumSides());
        System.out.println("Width: " + t.getWidth());
        System.out.println("Height: " + t.getHeight());
        System.out.println("Area: " + t.getArea());
        System.out.println("Perimeter: " + t.getPerimeter());

    }
    
}
