package Middle.TaskList;

public class TaskList {
    private Task[] tasks;

    public TaskList(Task[] tasks) {
        this.tasks = tasks;
    }

    public void showFinishedTask() {
        System.out.println("Завершенные задачи");
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].isFinished()) {
                tasks[i].showTask();
            }
        }
    }

    public void showUnFinishedTask() {
        System.out.println("Незавершенные дела");
        for (int i = 0; i < tasks.length; i++) {
            if (!tasks[i].isFinished()) {
                tasks[i].showTask();
            }
        }
    }



}
