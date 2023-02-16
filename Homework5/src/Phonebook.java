import java.util.ArrayList;
public class Phonebook {
    public ArrayList<Contact> listContact = new ArrayList<>();

    public void removeContact(Contact c){
        this.listContact.remove(c);
    }
}
