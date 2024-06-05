package may25.bookstream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookDemo {


    public static void main(String[] args) {


       Book book1 = new Book("1","Harry Potter","Jk Rolling",23.45);
       Book book2 = new Book("2","Atomic Habbits","James",45.99);
       Book book3 = new Book("3","Law of power","Harper",13.45);
       Book book4 = new Book("4","How to talk","Martha",12.45);
       Book book5 = new Book("5","Dark ","Edward Cullen",98.45);

        Map<Book,Integer> stock = new HashMap<>();
        stock.put(book1,10);
        stock.put(book2,5);
        stock.put(book3,15);
        stock.put(book4,34);
        stock.put(book5,54);

        System.out.println(book1.equals(book2));

        Map<Book,Integer> newStock = new HashMap<>(stock);

        newStock.putIfAbsent(book2,30);

        System.out.println("Original Map size "+stock.size());
        System.out.println("Original Entries "+stock.entrySet());

        double priceThreshold = 40.00;

        List<Book> bookList = Stream.of(book1, book2, book3, book4, book5).collect(Collectors.toList());
        List<Book> filterbooks = bookList.stream().filter(book -> book.getPrice() > 40.00).collect(Collectors.toList());


        System.out.println("Books with price greather than 40.00 :"+filterbooks);


        List<Book> sortedList = bookList.stream().sorted(Comparator.comparing(Book::getTitle)).collect(Collectors.toList());
        System.out.println("Sorted book by title: "+sortedList);



    }
}
