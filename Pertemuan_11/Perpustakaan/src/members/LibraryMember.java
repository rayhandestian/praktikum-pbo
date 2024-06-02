package members;
import items.LibraryItem;

public abstract class LibraryMember {
    protected String name;

    public LibraryMember(String name) {
        this.name = name;
    }

    public abstract void borrowItem(LibraryItem item);
}
