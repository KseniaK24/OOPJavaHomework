import java.util.ArrayList;
import java.util.Scanner;

public class View implements ViewPrint, ViewGetConsol {
    public void  printString(String str){
        System.out.println(str);
    }
    public String getString(String str){
        Scanner scan = new Scanner(System.in);
        System.out.println(str);
        return scan.nextLine();
    }
    public int getInt(String str){
        Scanner scan = new Scanner(System.in);
        System.out.println(str);
        return scan.nextInt();
    }
    public void printList(ArrayList<Contacts> list){
        int i = 1;
        for (Contacts con:list ){
            System.out.println(i + " - " + con);
            i++;
        }
    }
}
