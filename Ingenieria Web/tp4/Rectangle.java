public class Rectangle extends Shape implements IResizable {

    public Rectangle(double n){super(n);}

    private double width;

    private double height;

    public double getWidth(){return this.width;}

    public void setWidth(double width){this.width = width;}

    public double getHeight(){return this.height;}

    public void setHeight(double height){this.height = height;}

    @Override
    double getArea(){return getHeight()*getWidth();}

    @Override
    double getPerimeter(){return 2*(getHeight()+getWidth());}

    @Override
    public void resize(double x) {
        setHeight((this.height * x));
        setWidth((this.width * x));
    }

    @Override
    public String getName(){return "Rectangle";}
    
}
