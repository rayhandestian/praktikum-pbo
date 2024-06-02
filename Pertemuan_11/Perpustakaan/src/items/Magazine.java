package items;
import interfaces.Loanable;
import members.LibraryMember;

public class Magazine extends LibraryItem implements Loanable {
    public Magazine(String title, String author, int publicationYear) {
        super(title, author, publicationYear);
    }

    @Override
    public void displayInfo() {
        System.out.println("Magazine: " + title + ", by " + author + ", published in " + publicationYear);
    }

    @Override
    public void loan() {
        System.out.println("Loaning the magazine: " + title);
    }

    @Override
    public void returnItem() {
        System.out.println("Returning the magazine: " + title);
    }
}