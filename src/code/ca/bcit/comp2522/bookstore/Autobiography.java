package ca.bcit.comp2522.bookstore;

/**
 * Represents an autobiography.
 *
 * @author Julia Ziebart
 * @author Mayvee Tran
 *
 * @version 1.0
 */
public class Autobiography extends Biography
{
    /**
     * Constructs an Autobiography.
     *
     * @param title  the title
     * @param author the author
     */
    public Autobiography(final String title, final int yearPublished, final Author author)
    {
        super(title, yearPublished, author);
    }
}
