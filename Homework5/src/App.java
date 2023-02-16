import java.util.logging.Logger;

public class App {
    Presenter presenter;
    int key = 0;
    public App(Presenter pr){
        presenter = pr;
    }
    public void buttonClick() throws Exception {
        presenter.welcome();
        while (key!= 5){
            presenter.menu();
            key = presenter.getNumber();
            switch (key){
                case 1 : presenter.showContacts();
                break;
                case 2 : presenter.addContact();
                break;
                case 3 : presenter.deleteContact();
                break;
                case 4 : presenter.writeContacts();
                break;
            }
        }
        presenter.goodbye();

    }
}
