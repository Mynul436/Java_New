package ToDolListApp;

public class App {
    private Task[] todoList=new Task[100];

    private int taskIndex=-1;

    public void addTask(int id,String name){
        Task newTask=new Task(id,name);
        todoList[++taskIndex]=newTask;

    }
    public void showTodolist(){
        System.out.println("--------------------------------------------------------------");
        for (int i = 0; i < todoList.length; i++) {
            if(todoList!=null){
                System.out.println(todoList[i].getTaskId()+" "+todoList[i].getTaskName());

            }

        }

        System.out.println("--------------------------------------------------------------");


    }
}
