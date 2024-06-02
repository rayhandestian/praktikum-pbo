package items;
import interfaces.Loanable;
import members.LibraryMember;

public class Book extends LibraryItem implements Loanable {
    public Book(String title, String author, int publicationYear) {
        super(title, author, publicationYear);
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: " + title + ", by " + author + ", published in " + publicationYear);
    }

    @Override
    public void loan() {
        System.out.println("Loaning the book: " + title);
    }

    @Override
    public void returnItem() {
        System.out.println("Returning the book: " + title);
    }
}