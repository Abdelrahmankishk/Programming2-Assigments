
package sheet4.pkg3;

public class cylinder extends circle{
    double height;
    cylinder(){
        height=1.0;
    }
    cylinder(double radius){
        this.radius=radius;
    }
    cylinder(double radius,double height){
        this.radius=radius;
        this.height=height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        double x = 3.14*radius*radius*height;
        return x;
    }
}
