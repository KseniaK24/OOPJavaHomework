public class Presenter implements PresenterShow, PresenterAdd, PresenterDelete{
    View view;
    Model model;

    public Presenter(Model m, View v){
        model = m;
        view = v;
    }
    public void showContacts() throws Exception {
        Phonebook ph = model.readFile(Config.PATH);
        view.printList(ph.listContact);

    }
    public void addContact(){
        Contacts con = new ContactPhoneBook(view.getString("Введите имя"),view.getString("Введите номер телефона"));
        model.addToFile(Config.PATH,con);
    }
    public void deleteContact() throws Exception{
        view.printString("Выберите контакт");
        Phonebook ph = model.readFile(Config.PATH);
        view.printList(ph.listContact);
        ph = model.removeContact(ph,view.getInt("Введите порядковый номер контакта:"));
        model.writeToFile(Config.PATH,ph.listContact);
    }
    public void welcome(){
        view.printString("Добро пожаловать в телефонный справочник!");
    }
    public void menu(){
        view.printString("=".repeat(15) + "\nВыберите действие:\n1 - Показать контакты;\n2 - Добавить контакт;\n3 - Удалить контакт;\n4 - Записать контакты в файл;\n5 - Выход;");
    }
    public int getNumber(){
        return view.getInt("Введите число:");

    }

    public void goodbye(){
        view.printString("Досвидания!");
    }

    public void writeContacts()throws Exception{
        Phonebook ph = model.readFile("Homework5/src/Phonebook.txt");
        model.writeToFile(view.getString("Введите путь к файлу:"), ph.listContact);
    }

}

