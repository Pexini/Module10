package Middle.TaskList;


 public abstract class AbstTask implements Task {

    private boolean executed;

    @Override
    public void execute() {
        executed = true;
    }

    @Override
    public boolean isFinished() {
        return executed;
    }
     public abstract void showTask();
 }
