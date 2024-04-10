


/**
 * Represents a book in the library
 *
 * @author Stew G.
 * @version April 2024
 */
public class Book
{
    private String author;
    private String title;
    private String isbn;
    private boolean onLoan; // camelCase


    /**
     * Constructor for the Book class
     * @param anAuthor The author of the book
     * @param aTitle The title of the book
     * @param anIsbn The ISBN of the book
     */
    public Book(String anAuthor, String aTitle, String anIsbn)
    {
        this.author = anAuthor;
        this.title = aTitle;
        this.isbn = anIsbn;

        this.onLoan = false;
    }

    /**
     * Returns the author of the book
     * @return A String representing the author of the book
     */
    public String getAuthor()
    {
        return this.author;
    }

    /**
     * Returns the title of the book
     * @return the title of the book
     */
    public String getTitle()
    {
        return this.title;
    }

    /**
     * Returns the ISBN of the book
     * @return the ISBN of the book
     */
    public String getIsbn()
    {
        return this.isbn;
    }

    /**
     * Returns a boolean indicating whether the book is on loan
     * @return a boolean indicating whether the book is on loan
     */
    public boolean isOnLoan()
    {
        return this.onLoan;
    }

    /**
     * Sets the value of the onLoan field to the value of the parameter
     * @param available
     */
    public void setOnLoan(boolean available)
    {
        this.onLoan = available;
    }


    /**
     * Returns a String describing the state of the Book object
     * @return a String describing the state of the Book object
     */
    public String toString()
    {
        String available;

        if (this.onLoan == true)
        {
            available = " (on loan)";
        }
        else
        {
            available = " (available)";
        }

        return "Title: " + this.getTitle() + ", author: " + this.getAuthor() + available;
    }



}
