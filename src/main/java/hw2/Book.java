package hw2;

public class Book {
    public static void main(String[] arg) {

        Book firstBook = new Book("Гарри Поттер","Доуан Роулинг");

        firstBook.printInfo();

        firstBook.setAuthor("Джоан Роулинг");

        firstBook.printInfo();

    }

    String title;
    String author;

    Book(String someTitle, String someAuthor){
        this.title = someTitle;
        this.author = someAuthor;
    }

    String getTitle(){
        return this.title;
    }

    String hetAuthor(){
        return this.author;
    }

    void setTitle(String newTitle){
        this.title = newTitle;
    }

    void setAuthor(String newAuthor){
        this.author = newAuthor;
    }

    void printInfo(){
        System.out.println("Название: " + title + " Автор: " + author);

    }
}
