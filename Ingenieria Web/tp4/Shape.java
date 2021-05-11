

public abstract class Shape implements IWithName{

    private double numSides;

    public Shape(double n) {numSides = n;}

    public double getNumSides(){return numSides;}

    abstract double getArea();

    abstract double getPerimeter();

    @Override
    public String getName(){return IWithName.super.getName();}

}
