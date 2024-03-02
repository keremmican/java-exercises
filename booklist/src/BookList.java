import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookList {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            Book book = new Book("Book"+i, String.valueOf(i*20), "Author"+i, String.valueOf(i));
            bookList.add(book);
        }

        Map<String, String> nameAndAuthor = bookList.stream()
                .collect(Collectors.toMap(Book::getName, Book::getAuthorName));

        System.out.println(nameAndAuthor);

        List<Book> filteredBook = bookList.stream().filter(book -> Integer.parseInt(book.getPageNum()) > 100).toList();

        System.out.println(filteredBook);
    }
}
