package alhorithm.how_do_homework;

public class TaskString implements ITask  {
    @Override
    public String run(String[] data) {
        return String.valueOf(data.length);
    }
}