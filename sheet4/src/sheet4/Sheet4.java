
package sheet4;
import java.util.Scanner;
public class Sheet4 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner x = new Scanner(System.in);
        Rational r1 = new Rational();
        System.out.print("enter the value of the first number: ");
        r1.setNum1(x.nextInt());
        System.out.print("enter the value of the second number: ");
        r1.setNum2(x.nextInt());
        
        System.out.println("the value of the addition is: " + r1.add());
        System.out.println("the value of the muliplication is: " + r1.mult());
        r1.display();
    }
}
    
