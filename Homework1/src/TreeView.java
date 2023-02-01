public class TreeView {
    public static void viewAncestors (Person per, int num) {
        for (Person p : per.parents) {
            System.out.println(" ".repeat(num) + p);
        }
        for (Person p : per.parents) {
            viewAncestors(p, num + 3);
        }
    }
    public static void viewDescendants (Person per, int num){
            for (Person p: per.children){
                System.out.println(" ".repeat(num) + p);
            }
            for (Person p : per.children) {
                viewDescendants(p,num+3);
        }

    }
}
