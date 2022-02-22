package ToDolListApp;

public class Task {
    private int TaskId;
    private  String TaskName;

    public int getTaskId() {
        return TaskId;
    }

    public String getTaskName() {
        return TaskName;
    }

    public Task(int taskId, String taskName) {
        TaskId = taskId;
        TaskName = taskName;
    }
}
