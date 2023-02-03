import java.util.ArrayList;


public class Company {
    public String name;

    public ArrayList<Department> departments = new ArrayList<>();
    public ArrayList<Worker> allWorkers = new ArrayList<>();

    public Company(String name){
        this.name = name;
    }
    public void addDepartment(Department d){
        departments.add(d);
        d.company = this;
    }
    public void showDepartments(){
        int i = 0;
        for (Department d: departments){
            System.out.println(i + " - " + d);
            i = i + 1;
        }
    }
    public void showWorkers(){
        int i = 0;
        for (Worker w: allWorkers){
            System.out.println(i + " - " + w);
            i = i + 1;
        }
    }
    public void addWorker(Worker w){
        this.allWorkers.add(w);
    }


}
