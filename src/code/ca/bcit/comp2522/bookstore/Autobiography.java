package ca.bcit.comp2522.bookstore;

/**
 * Represents an autobiography.
 * The subject of the biography is automatically the author.
 *
 * @author Julia Ziebart
 * @author Mayvee Tran
 * @version 1.0
 */
public class Autobiography extends Biography
{
    /**
     * Creates an autobiography.
     * The subject is automatically set to the author.
     *
     * @param title the title of the autobiography
     * @param yearPublished the year the book was published
     * @param author the author of the autobiography
     * @throws IllegalArgumentException if author is null
     */
    public Autobiography(final String title, final int yearPublished, final Author author)
    {
        super(title, yearPublished, author, author);
    }

    /**
     * Displays the autobiography information.
     * This includes the book details and the author's information.
     */
    @Override
    public void display()
    {
        System.out.print("Autobiography: ");
        super.display();
    }
}
