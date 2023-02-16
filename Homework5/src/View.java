import java.util.ArrayList;
import java.util.Scanner;

public class View {

    public void print (String str){
        System.out.println(str);
    }
    public String getString (String str){
        Scanner scan = new Scanner(System.in);
        System.out.println(str);
        return scan.nextLine();

    }
    public int getInt(String str){
        Scanner scan = new Scanner(System.in);
        System.out.println(str);
        return scan.nextInt();
    }
    public void printList(ArrayList<Contact> list){
        int i = 1;
        for (Contact con:list ){
                System.out.println(i + " - " + con);
                i++;
        }
    }
}
