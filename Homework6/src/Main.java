public class Main {
    public static void main(String[] args) throws Exception {
        App app = new App(new Presenter(new Model(),new View()));
        app.buttonClick();
    }
}