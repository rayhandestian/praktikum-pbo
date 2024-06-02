package items;
import interfaces.Downloadable;

public class EBook extends LibraryItem implements Downloadable {
    public EBook(String title, String author, int publicationYear) {
        super(title, author, publicationYear);
    }

    @Override
    public void displayInfo() {
        System.out.println("EBook: " + title + ", by " + author + ", published in " + publicationYear);
    }

    @Override
    public void download() {
        System.out.println("Downloading the eBook: " + title);
    }
}
