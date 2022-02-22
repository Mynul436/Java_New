package ToDolListApp;

import java.util.Scanner;

public class Client {
    public static void showManu(App appObject){
        Scanner scan =new Scanner(System.in);
        String choice="";
        int id;
        String taskName;
        while (true){
            System.out.println("1.Add task");
            System.out.println("2.Show all task");
            System.out.println("3.Press Q to quite");

            System.out.println("Pressing any other key to continue");

            choice=scan.nextLine();

            if(choice.equals("1")){
                System.out.println("Enter id and name:");

                id=scan.nextInt();
                taskName=scan.nextLine();
                appObject.addTask(id,taskName);


            }
            else if(choice.equals("2")){
                appObject.showTodolist();
            }
            else if(choice.equals("Q")){
                break;
            }

        }

    }



    public static void main(String[] args) {
        App appObject=new App();

        showManu(appObject);
    }
}
