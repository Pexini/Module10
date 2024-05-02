package TaskList;

public class Main {
    public static void main(String[] args) {
        Task imageTask = new ImageTask( "http:// www.watchMyTask.com/image.png");
        Task textTask = new TextTask("выполнить домашнее задание");
        Task docTask = new DocumentTask("C:/MyDocyments/task.doc");

        TaskList taskList = new TaskList(new Task[]{imageTask, textTask, docTask});

        taskList.showFinishedTask();
        taskList.showUnFinishedTask();
    }
}
