

public class RtTriangle extends Shape{

    public RtTriangle(double n){super(n);}

    private double width;

    private double height;

    public double getWidth(){return this.width;}

    public void setWidth(double width){this.width = width;}

    public double getHeight(){return this.height;}

    public void setHeight(double height){this.height = height;}

    @Override
    double getArea(){return ((getHeight()*getWidth())/2);}

    @Override
    double getPerimeter(){return Math.sqrt( Math.pow(getHeight(),2) + Math.pow (getWidth(),2) ) + getWidth() + getHeight();}
    
    @Override
    public String getName() {return "Triangle";}
    
}
