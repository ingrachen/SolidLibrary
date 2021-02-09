import java.util.List;


public class Book{
    private String title;
    private String author;
    private long reference;


    public Book(String title, String author){
         this.title = title;
         this.author = author;
    }

    private void afficherlivre(Book book){
        System.out.println("Titre: " + book.title + " " +"Author: " + book.author);
    }


    private boolean isReferenced(Book book){
        if (reference == 0)
            return false;
        return true;

    }


}



