package schedule;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    List<Task> taskList = new ArrayList<>();

    public void addTask(String title, String finishDate, String description) {
        Task task = new Task(title, finishDate, description);
        taskList.add(task);
    }

    public void printAllTask() {
        for (int i = 0; i < taskList.size(); i++) {
            Task result = taskList.get(i);
            result.printInformation();
        }
    }

    public static void main(String[] args) {
        Schedule b = new Schedule();
        b.addTask("Visit to hospital", "28.03.2022", "Procedure");
        b.addTask("Wake up", "28.03.2022", "Morning");
        b.printAllTask();
    }
}

