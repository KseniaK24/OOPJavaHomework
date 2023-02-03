import java.util.ArrayList;

public class Department {
    public String name;
    public ArrayList<Worker> workers = new ArrayList<>();
    public Company company;

    public Department(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
    public void addWorker(Worker w){
        this.workers.add(w);

    }

}
