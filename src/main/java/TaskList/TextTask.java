package TaskList;

public class TextTask implements Task{
    private String text;
    private boolean finished;

    public TextTask(String text) {
        this.text = text;
    }

    @Override
    public void showTask() {

    }

    @Override
    public void executed() {

    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
