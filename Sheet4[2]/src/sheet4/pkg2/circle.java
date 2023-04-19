
package sheet4.pkg2;

public class circle extends shape {
    double radius;
    circle(){
        radius = 1.0;
    }
    circle(double raduis ){
        this.radius=raduis;
    }
        circle(double raduis ,String color,boolean filled){
        this.radius=raduis;
        this.color= color;
        this.filled=filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public void getArea(){
        System.out.println("the area of the circle is " + (3.14*radius*radius));
    }
    public void getPer(){
        System.out.println("the Perimmter of the cirecle is " + (3.14*radius*2));
    }

    @Override
    public String toString() {
        return "circle{" + "radius=" + radius + '}';
    }
    
}
