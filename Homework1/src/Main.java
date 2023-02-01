public class Main {
    public static void main(String[] args) {
        Person per1 = new Person("Max", "12.05.1998");
        Person per2 = new Person("Mari", "20.08.1974");
        Person per3 = new Person("Misha", "10.10.1973");
        Person per4 = new Person("Ivan", "08.03.1949");
        Person per5 = new Person("Elena", "11.12.1950");
        Person per6 = new Person("Anna", "09.11.1947");
        Person per7 = new Person("Petr", "26.04.1945");
        per1.addParents(per2);
        per1.addParents(per3);
        per2.addParents(per4);
        per2.addParents(per5);
        per3.addParents(per6);
        per3.addParents(per7);

        System.out.println(per1);
        TreeView.viewAncestors(per1,3);
        System.out.println("------------------------");
        System.out.println(per5);
        TreeView.viewDescendants(per5,3);

        Cat cat = new Cat("Murzik");
        per1.callCat(cat);
        System.out.println("Сытость кота:"+ cat.satiety);
        System.out.println("Удовольствие кота:" + cat.pleasure);
        per1.feedCat(cat);
        per1.petCat(cat);
        System.out.println("Сытость кота:"+ cat.satiety);
        System.out.println("Удовольствие кота:" + cat.pleasure);

    }
}