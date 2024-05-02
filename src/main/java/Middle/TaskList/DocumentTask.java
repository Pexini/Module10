package Middle.TaskList;

public class DocumentTask extends AbstTask {
    private String documentLink;


    public DocumentTask(String documentLink) {
        this.documentLink = documentLink;
    }

    @Override
    public void showTask() {
        System.out.println("Отображаем документ. Ссылка на документ " + documentLink);
    }

}
