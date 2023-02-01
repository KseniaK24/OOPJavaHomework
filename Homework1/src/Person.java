
import java.util.ArrayList;

public class Person {
    public String fullName;
    public String DOB;
    public Person partner;

    public Person (String name, String data){
        this.fullName = name;
        this.DOB = data;
    }
    public Person(String name){
        this(name,"-");
    }

    @Override
    public String toString() {
        String str;
        str = fullName + " " + DOB;
        return str;
    }

    public void addPartner(Person per){
        this.partner = per;
    }
    ArrayList<Person> parents = new ArrayList<>();
    ArrayList<Person> children = new ArrayList<>();
    public void addParents(Person per){
        parents.add(per);
        per.children.add(this);
    }

    public void feedCat (Cat c){
        c.satiety += 10;
    }
    public void petCat (Cat c){
        c.pleasure += 10;
    }
    public void callCat (Cat c){
        System.out.println("Кис-кис");
        c.meow();
    }


}


