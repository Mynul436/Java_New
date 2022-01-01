import java.util.Scanner;

public class w_loop {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
         String name="";

         while (name.isBlank())
         {
             System.out.println("Enter your name: ");
             //Scanner scn =new Scanner(System.in);
             name =scn.nextLine();
            // System.out.println("Hello "+name);
         }
        System.out.println("Hello "+name);
    }
}
