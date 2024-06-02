import items.Book;
import items.Magazine;
import items.EBook;
import members.RegularMember;
import members.PremiumMember;

public class Main {
    public static void main(String[] args) {
        // items
        Book book1 = new Book("Guns, Germs, and Steel: The Fates of Human Societies", "Jared Diamond", 1997);
        Magazine magazine1 = new Magazine("Manga Time Kirara", "Houbunsha", 2021);
        EBook ebook1 = new EBook("Hyōka", "Honobu Yonezawa", 2001);


        // members
        RegularMember member1 = new RegularMember("Amelia Watson");
        PremiumMember member2 = new PremiumMember("Ninomae Ina'nis");

        book1.displayInfo();
        magazine1.displayInfo();
        ebook1.displayInfo();

        // regular member actions
        System.out.println("\nRegular Member Actions:");
        member1.borrowItem(book1);
        member1.borrowItem(magazine1);
        member1.borrowItem(ebook1); // akan gagal karena RegularMember tidak bisa mendownload

        // premium member actions
        System.out.println("\nPremium Member Actions:");
        member2.borrowItem(book1);
        member2.borrowItem(magazine1);
        member2.borrowItem(ebook1);
    }
}
