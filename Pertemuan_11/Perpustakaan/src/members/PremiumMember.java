package members;
import items.LibraryItem;
import interfaces.Loanable;
import interfaces.Downloadable;

public class PremiumMember extends LibraryMember {
    public PremiumMember(String name) {
        super(name);
    }

    @Override
    public void borrowItem(LibraryItem item) {
        if (item instanceof Downloadable) {
            ((Downloadable) item).download();
            System.out.println("Premium Member " + name + " downloaded '" + item.getTitle() + "'");
        } else if (item instanceof Loanable) {
            ((Loanable) item).loan();
            System.out.println("Premium Member " + name + " borrowed '" + item.getTitle() + "'");
        }
    }
}