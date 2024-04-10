import java.util.Scanner;

/**
 * Utility class to work with user input
 */
public class InputReader
{
    private Scanner scanner;

    /**
     * Constructs a new InputReader object
     */
    public InputReader()
    {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Gets user input from the terminal and returns it to the caller
     * @return some input from the terminal
     */
    public String getInput()
    {
        String userInput = scanner.next();

        return userInput;
    }

}
