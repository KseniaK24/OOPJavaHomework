public class View {
    public static void treeView(Persona root, int num){
        String line = "_".repeat(num);
//        System.out.println(line + root.FullName);
        System.out.println(line + root.GetName());
        for (Persona a: root.getListName()) {
            treeView(a, num + 1);
        }
    }
    public static void bookView(Persona root){
        System.out.println("имя библиотеки " + root.persLibr.LibraryName);
        for (LibraryBooks a: root.persLibr.listBook) {
            System.out.println(a.bAutor + " " + a.bName);
        }
    }
    public  static  void petView(Persona per){
        System.out.println("Домашние животные" + " "+ per.GetName());
        for (Animal p: per.pet){
            System.out.println(p.type + " " + p.getAnimalName());
            p.voice();
        }
    }

}