
public class Worker extends Human {
    public String jobTitle;
    public Department department;

    public Worker (String name, String dof, String job, Department dep) {
        super.fullName = name;
        super.dateBirth = dof;
        this.jobTitle = job;
        this.department = dep;
    }
    public String toString(){
        return this.fullName + " " + " " + this.jobTitle + " " + " " + this.department;
    }



}
