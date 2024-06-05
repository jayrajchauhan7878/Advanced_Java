package may25.bookstream;

import java.util.Objects;

public class Book {

    private String isbn;
    private String title;
    private String author;

    private Double price;

    public Double getPrice() {
        return price;
    }

    public Book(String isbn, String title, String author, Double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn) && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(price, book.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, author, price);
    }


    public String getTitle() {
        return title;
    }
}
