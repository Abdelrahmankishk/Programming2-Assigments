/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet4.pkg3;

public class circle {
    double radius;
    String color;
    
    circle(){
        radius = 1.0;
        color = "red";
    }
    circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public  double getArea(){
        double x= 3.14*radius*radius;
        return x;
    }
    @Override
    public String toString() {
        return "circle{" + "radius=" + radius + ", color=" + color + '}';
    }
    
}
