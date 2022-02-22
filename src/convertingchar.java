import java.util.Scanner;

public class convertingchar {

    public static void main(String[] args) {
        char a,b,c,d;
        Scanner input =new Scanner(System.in);

        a=input.next().charAt(0);
        b=input.next().charAt(0);
        c=(char) (a+('a'-'A'));
        d=(char) (b-('a'-'A'));
        System.out.println(c);
        System.out.println(d);

    }


}
