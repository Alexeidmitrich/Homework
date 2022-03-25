package schedule;

public class Task {
    String title;
    String finishDate;
    String description;

    public Task(String title, String finishDate, String description){
        this.title = title;
        this.finishDate = finishDate;
        this.description = description;
    }
    public void printInformation(){
        System.out.println(title + " " + finishDate + " " + description);
    }
}
