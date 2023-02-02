

public abstract class Book {
    private String BookAutor;
    private String BookName;
    private String BookLang;

    public void SetBookAutor (String bookAutor){
        this.BookAutor = bookAutor;
    }
    public void SetBookName (String bookName){
        this.BookName = bookName;
    }
    public void SetBookLang (String bookLang){
        this.BookLang = bookLang;
    }

    public String GetBookAutor (){
        return BookAutor;
    }
    public String GetBookName (){
        return BookName;
    }
    public String GetBookLang (){
        return BookLang;
    }



}