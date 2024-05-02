package Middle.TaskList;

class TextTask extends AbstTask {
    private String text;


    public TextTask(String text) {
        this.text = text;
    }

    @Override
    public void showTask() {
        System.out.println("Отображаем текст: " + text);
    }

}
