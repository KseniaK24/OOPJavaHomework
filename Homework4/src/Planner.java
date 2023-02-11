import java.util.ArrayList;

public class Planner {
    public String name;
    public Human author;
    public ArrayList<Task> allTask = new ArrayList<>();
    public ArrayList<Task> priorityImportant = new ArrayList<>();
    public ArrayList<Task> priority1 = new ArrayList<>();
    public ArrayList<Task> priority2 = new ArrayList<>();
    public Planner(String name, Human h){
        this.name = name;
        this.author = h;
    }
    public void addTask (Task t){
        this.allTask.add(t);
        if (t.priority.equals("важно")){
            this.priorityImportant.add(t);
        }
        if (t.priority.equals(1)){
            this.priority1.add(t);
        }
        if (t.priority.equals(2)){
            this.priority2.add(t);
        }

    }

    public void showTasks(){
        int i = 1;
        System.out.println("Список задач:");
        for (Task t:priorityImportant) {
            System.out.println(i + " - " + t);
            i++;
        }
        for (Task t:priority1){
            System.out.println(i + " - " + t);
            i++;
        }
        for (Task t:priority2){
            System.out.println(i + " - " + t);
            i++;
        }
    }
    public void deleteTask(Task t){
        this.allTask.remove(t);
        if (t.priority.equals("важно")){
            this.priorityImportant.remove(t);
        }
        if (t.priority.equals(1)){
            this.priority1.remove(t);
        }
        if (t.priority.equals(2)){
            this.priority2.remove(t);
        }

    }
}
