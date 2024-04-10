import java.util.ArrayList;


/**
 * Represents a library with a collection of books
 */
public class Library
{
    private ArrayList<Book> books;

    /**
     * Constructs a new Library object
     */
    public Library()
    {
        this.books = new ArrayList<>();
    }

    /**
     * Adds a book to the library's collection of books
     * @param aBook the book to add to the library
     */
    public void addBook(Book aBook)
    {
        this.books.add(aBook);
    }

    /**
     * Lists all the books in the library
     */
    public void listBooks()
    {
        for (Book b : this.books)
        {
            System.out.println(b);
        }
        
    }


}
