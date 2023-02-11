import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task <T>{
     public String nameTask;
    public T priority;
    public Calendar dateTime = new GregorianCalendar();
    public Calendar deadline = new GregorianCalendar();


    public Task (String name,T prior, int dead) {
        this.nameTask = name;
        this.priority = prior;
        this.deadline.add(Calendar.DAY_OF_MONTH, dead);

    }
    public String toString(){

        return this.nameTask + ", приоритет: " + this.priority + ", Дата создания: "+ dateTime.getTime()+ ", Выполнить до: "+ deadline.getTime();
    }






}
