import java.util.Scanner;
public class Variable {
    public static void main(String[] args) {

        System.out.println(84);
        Scanner scn=new Scanner(System.in);
        System.out.println("What is your name?\n");
    String name=scn.nextLine();
        System.out.println("How old are you?");
        int age=scn.nextInt();
        scn.nextLine();
        System.out.println("Whats your fava food?");
        String food=scn.nextLine();

        System.out.println(name);
        System.out.println(age);
        System.out.println(food);

    }
}
