public class Main {
    public static void main(String[] args) {


        Persona papa = new Persona("Ima", "F", 33, "lib1");
        Persona son = new Persona("Sin", "F", 13, "lib2");
        papa.AddName(son);

        papa.persLibr.AddBook("Пушкин", "Собрание сочинений", "RU");
        papa.persLibr.AddBook("Носов", "Незнайка на луне", "RU");

        son.persLibr.AddBook("Народное авторство", "Азбука", "RU");
        son.persLibr.AddBook("", "Light blue", "RU");

        papa.addPet(new Cat("Murzik", "Siamese","grey", 2, true));
        papa.addPet(new Dog("Rex", "shepherd-dog","brown", 5));
        son.addPet(new Cat("Murk", "Siberian", "black", 4, true));
        son.addPet(new Dog("Simba","Labrador","black", 2));

        View.treeView(papa, 0);

        System.out.println("*".repeat(15));
        View.bookView(papa);

        System.out.println("*".repeat(15));
        View.bookView(son);

        System.out.println("*".repeat(15));
        View.petView(papa);
        System.out.println("*".repeat(15));
        View.petView(son);

    }
}
