public class Cylinder extends Circle implements Volume{

    private double height;

    public Cylinder(double radius, double height,String name){
	super(radius,name);
	this.height = height;
    }

    public double getHeight(){
	return height;
    }

    public String toString(){
	return "Cylinder "+getName()+" with a radius of "+getRadius()+" and a height of "+getHeight();
    }
    public double getVolume(){
	return Math.PI*height*getRadius()*getRadius();
    }
}
