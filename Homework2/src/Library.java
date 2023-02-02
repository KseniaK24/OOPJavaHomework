import java.util.ArrayList;
class LibraryBooks{
    public String bAutor;
    public String bName;
    public String bLang;
}
public class Library extends Book{
    public String LibraryName;
    public Library(String libraryName){
        this.LibraryName = libraryName;
    }

    ArrayList<LibraryBooks> listBook = new ArrayList<>();

    public void AddBook(String bookAutor, String bookName, String bookLang){
        LibraryBooks lb = new LibraryBooks();
        SetBookAutor(bookAutor);
        SetBookName(bookName);
        SetBookLang(bookLang);
        lb.bAutor = GetBookAutor();
        lb.bName = GetBookName();
        lb.bLang = GetBookLang();
        listBook.add(lb);
    }

    public ArrayList<LibraryBooks> getBookList(){
        return listBook;
    }

}