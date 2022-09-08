
import Book.Book;
import java.util.HashSet;
import java.util.Set;

public class Application {
    public static void main(String[] args) {


        // Creating a HashSet and filling it with objects
        Set<Book> workersSet = new HashSet<>();
        workersSet.add( new Book("Steven", "Newmack", 1987, 6, 30));
        workersSet.add(new Book("Jennifer", "Nowak", 1988, 2, 28));
        workersSet.add( new Book("Robert", "Greenfield", 1987, 6, 15));
        workersSet.add(new Book("Monica", "Smith", 1984, 10, 18));
        workersSet.add(new Book("Stephanie", "Jackson", 1985, 4, 3));

        // Print out every worker from the set
        for (Book theWorker: workersSet) {
            if (theWorker.getBirthDate().getYear() >= 1986) {
                System.out.println(theWorker);
            };
        }
    }
}

