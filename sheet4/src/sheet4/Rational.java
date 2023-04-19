
package sheet4;

public class Rational {
    private int num1;
    private int num2;
    
    Rational(){
        num1=1;
        num2=1;
    }
    Rational(int a,int b){
        num1=a;
        num2=b;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int add(){
        return num1+num2;
    }
    public int mult(){
        return num1*num2;
    }
    public void display(){
        System.out.println("The first number is: " + num1);
        System.out.println("The Second number is: " + num2);

    }
}
