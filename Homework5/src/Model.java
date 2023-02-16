import java.io.*;
import java.util.ArrayList;

public class Model {
    public Phonebook readFile (String path) throws Exception {
        Phonebook ph = new Phonebook();
        BufferedReader br = new BufferedReader(new FileReader(path));
        String str;
        try {
            while ((str = br.readLine()) != null) {
                String[] arr = str.split(" ");
                ph.listContact.add(new Contact(arr[0], arr[1]));
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return ph;
    }
    public void addToFile (String path,Contact con){
        try (FileWriter fw = new FileWriter(path, true)) {
            fw.append("\n");
            fw.write(con.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void writeToFile (String path, ArrayList<Contact> list) {
        try (FileWriter fw = new FileWriter(path, false)) {
            for (Contact con : list) {
                fw.write(con.toString());
                fw.append("\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public Phonebook removeContact(Phonebook ph, int i){
        ph.removeContact(ph.listContact.get(i-1));
        return ph;
    }






}


