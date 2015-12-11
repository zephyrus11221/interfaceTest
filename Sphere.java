public class Sphere extends Circle implements Volume{

    public Sphere(double radius, String name){
	super(radius,name);
    }

    public String toString(){
	return "Sphere "+getName()+" with radius of "+getRadius();
    }
    public double getVolume(){
	return getRadius()*getRadius()*getRadius()*(4/3)*Math.PI;
    }
}