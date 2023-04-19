
package sheet4.pkg2;

public class rectangle extends shape {
    double width;
    double lenght;
    
    rectangle(){
        width= 1.0;
        lenght=1.0;
    }
    rectangle(double width,double lenght){
        this.width=width;
        this.lenght=lenght;
    }
    rectangle(double width,double lenght,String color,boolean filled){
        this.width=width;
        this.lenght=lenght;
        this.color=color;
        this.filled=filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public void getArea(){
        System.out.println("the Area of the rectangle is "+ (lenght*width));
    }
    public void getPer(){
        System.out.println("the Perimeter of the rectangle is "+ (lenght+width)*2);
    }

    @Override
    public String toString() {
        return "rectangle{" + "width=" + width + ", lenght=" + lenght + '}';
    }

    
}
