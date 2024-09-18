package task;

public class Deadline extends Task {

    protected String by;

    public Deadline(String taskName, boolean isMarked, String by) {
        super(taskName, isMarked);
        this.by = by;
    }
    public String getBy() {
        return by;
    }
    public void setBy(String by) {
        this.by = by;
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + by + ")";
    }

    @Override
    public String toFileFormat() {
        return "D | " + (isMarked()? "1":"0") + " | " + getTaskName() + " | " + getBy();
    }
}

