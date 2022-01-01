import java.util.Scanner;

public class math {
    public static void main(String[] args) {
    double a;
    double b;
    double c;
    Scanner h=new Scanner(System.in);
        System.out.println("Enter the value of a :");
        a=h.nextDouble();
        System.out.println("Enter the value of b :");
b=h.nextDouble();
       // System.out.println("Enter the vaiue of c :");
        //c=h.nextDouble();
     c=Math.sqrt(a*a+b*b);
        System.out.println("The desired value is :"+c);



    }
}
