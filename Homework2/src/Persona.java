
import java.util.ArrayList;

public class Persona extends Human {
        public Library persLibr;
        public ArrayList<Animal> pet = new ArrayList<>();

        public Persona(String Name, String Sex, int Age, String persLibr) {
            SetSex(Sex);
            SetName(Name);
            SetAge(Age);
            this.persLibr = new Library(persLibr);
        }
        ArrayList<Persona> listName = new ArrayList<>();

        public void AddName(Persona persona) {
            listName.add(persona);
        }

        public ArrayList<Persona> getListName() {
            return listName;
        }

        public void Voice() {
            String name = GetName();
            System.out.println("Меня зовут " + name);
        }

        public void addPet(Animal an){
            this.pet.add(an);
        }

}
