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
public class BSTDisplay {
    public static void displayBooksInOrder(BookNode root) {
        if (root != null) {
            displayBooksInOrder(root.left);
            System.out.println(root.book);
            displayBooksInOrder(root.right);
        }
    }
}
public class MainDataInit {
    public static void main(String[] args) {
        Book book1 = new Book(101, "Data Structures", "Mark Weiss", 2012);
        Book book2 = new Book(102, "Java Programming", "Joyce Farrell", 2019);
        Book book3 = new Book(103, "Database Systems", "Thomas Connolly", 2015);
        Book book4 = new Book(104, "Computer Networks", "Andrew Tanenbaum", 2021);
        Book book5 = new Book(105, "Operating Systems", "William Stallings", 2018);
        
        System.out.println("Sample books initialized successfully.");
    }
}
import java.util.ArrayList;

public class ArrayListTest {
    public static void testArrayListSolution(ArrayList<Book> bookList) {
        System.out.println("First Solution: ArrayList");
        System.out.println("Searching for Database Systems:");
        ArrayListSearch.searchUsingArrayList(bookList, "Database Systems");
    }
}
import java.util.ArrayList;

public class ArrayListNegativeTest {
    public static void testMissingBook(ArrayList<Book> bookList) {
        System.out.println("\nSearching for Artificial Intelligence:");
        ArrayListSearch.searchUsingArrayList(bookList, "Artificial Intelligence");
    }
}
