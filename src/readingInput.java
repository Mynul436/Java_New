import java.util.Scanner;

public class readingInput {
    public static void main(String[] args) {


        Scanner a = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Enter First number: ");
        num1=a.nextInt();
        System.out.println("Enter second number :");
        num2=a.nextInt();

        double aa=(num1+num2)/2.0;
        System.out.println(aa);
        a.nextLine();
    }

}
