package members;
import items.LibraryItem;
import interfaces.Loanable;

public class RegularMember extends LibraryMember {
    public RegularMember(String name) {
        super(name);
    }

    @Override
    public void borrowItem(LibraryItem item) {
        if (item instanceof Loanable) {
            ((Loanable) item).loan();
            System.out.println("Regular Member " + name + " borrowed '" + item.getTitle() + "'");
        } else {
            System.out.println("This item cannot be borrowed.");
        }
    }
}