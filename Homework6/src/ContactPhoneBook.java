public class ContactPhoneBook extends Contacts{
    public ContactPhoneBook(String name, String tel) {
        setFullName(name);
        setTel(tel);
    }
    public String toString(){
        return super.getFullName() + " " + super.getTel();
    }
}
