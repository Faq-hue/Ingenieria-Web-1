

public class MyPoint3D {

    private int x = 0;
    private int y = 0;
    private int z = 0;

    public void setX( int x ){
        this.x = x;
    }

    public int getX (){
        return x;
    }

    public void setY( int y ){
        this.y = y;
    }

    public int getY (){
        return y;
    }

    public void setZ( int z ){
        this.z = z;
    }  

    public int getZ (){
        return z;
    }

    public MyPoint3D( int x, int y, int z ){

        this.setX(x);
        this.setY(y);
        this.setZ(z);

    }

    public void setXYZ( int[]xyz ){

        this.setX(xyz[0]);
        this.setY(xyz[1]);
        this.setZ(xyz[2]);

    }

    public int[] getXYZ() {

        return new int [3];
    }

    public void setXYZ( int x, int y, int z ) {
        
        this.setX(x);
        this.setY(y);
        this.setZ(z);

    }

    public double distance( int x, int y, int z ){      

        return Math.sqrt( Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2) + Math.pow(z - this.z, 2) );
    }

    public double distance( int [] xy ){

        return Math.sqrt( Math.pow(xy[0] - this.x, 2) + Math.pow(xy[1] - this.y, 2));
    }

    public double distance ( MyPoint3D another ){

        return Math.sqrt( Math.pow(another.x - this.x, 2) + Math.pow(another.y - this.y, 2) + Math.pow(another.z - this.z, 2) );
    }

    public double distance(){

        return Math.sqrt( Math.pow(0 - this.x, 2) + Math.pow(0 - this.y, 2) + Math.pow(0 - this.z, 2) );
    }

    
    @Override

    public boolean equals( Object ob){

        if (this == ob) {
            return true;
        }

        if ( ob == null ) {
            return false;
        }

        if ( getClass() != ob.getClass()) {
            return false;
        }

        MyPoint3D point = (MyPoint3D) ob;

        if ( this.x == point.x && this.y == point.y && this.z == point.z ){
            return true;
        
        }else{

            return false;
        }
    }

    @Override

    public String toString(){

        return "(" + this.x + " ; " + this.y + " ; " + this.z + ")" ;
    }




}
