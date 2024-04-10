/**
 * Provides a user interface for the library staff
 */
public class UserInterface
{
    private Library library;
    private InputReader inputReader;

    /**
     * Constructs a new UserInterface object
     */
    public UserInterface()
    {
        this.library = new Library();
        this.inputReader = new InputReader();
    }

    /**
     * Provides a main menu for the application.
     * Continues to serve the user until they choose 0 for quit
     */
    public void mainMenu()
    {
        boolean quit = false;

        while (quit == false)
        {
            System.out.println("Please choose: ");
            System.out.println("1. Add a book");
            System.out.println("2. List all books");
            System.out.println("0. Quit");

            String userInput = inputReader.getInput();

            switch (userInput)
            {
                case "1":
                    this.addBook();
                    break;
                case "2":
                    this.listAllBooks();
                    break;
                case "0":
                    quit = true;
                    break;
                default:
                    System.out.println("That's not a valid option");
            }

        }


    }

    public void addBook()
    {
        System.out.println("Please enter the author of the book: ");
        String author = this.inputReader.getInput();

        System.out.println("Please enter the title of the book: ");
        String title = this.inputReader.getInput();

        System.out.println("Please enter the book's ISBN: ");
        String isbn = this.inputReader.getInput();

        Book b = new Book(author, title, isbn);
        this.library.addBook(b);

    }

    /**
     * Lists all books in the library
     */
    public void listAllBooks()
    {
        this.library.listBooks();
    }





}
