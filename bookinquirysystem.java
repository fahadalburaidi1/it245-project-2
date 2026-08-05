public class Book {
    private final int bookId;
    private final String title;
    private final String author;
    private final int publicationYear;

    public Book(int bookId, String title, String author, int publicationYear) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId
                + ", Title: " + title
                + ", Author: " + author
                + ", Publication Year: " + publicationYear;
    }
}
public class BookNode {
    Book book;
    BookNode left;
    BookNode right;

    public BookNode(Book book) {
        this.book = book;
    }
}
import java.util.ArrayList;

public class ArrayListOperations {
    import java.util.ArrayList;

public class ArrayListSearch {
    public static void searchUsingArrayList(ArrayList<Book> books, String searchTitle) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(searchTitle)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }
    }
}
    public static void addBookToList(ArrayList<Book> books, Book newBook) {
        books.add(newBook);
    }
}
public class BSTInsertion {
    public static BookNode insertBook(BookNode root, Book newBook) {
        if (root == null) {
            return new BookNode(newBook);
        }
        int comparison = newBook.getTitle().compareToIgnoreCase(root.book.getTitle());
        if (comparison < 0) {
            root.left = insertBook(root.left, newBook);
        } else {
            root.right = insertBook(root.right, newBook);
        }
        return root;
    }
}
public class BSTSearch {
    public static Book searchUsingBST(BookNode root, String searchTitle) {
        if (root == null) {
            return null;
        }
        int comparison = searchTitle.compareToIgnoreCase(root.book.getTitle());
        if (comparison == 0) {
            return root.book;
        } else if (comparison < 0) {
            return searchUsingBST(root.left, searchTitle);
        } else {
            return searchUsingBST(root.right, searchTitle);
        }
    }
}
