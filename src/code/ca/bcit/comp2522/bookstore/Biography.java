package ca.bcit.comp2522.bookstore;

/**
 * Represents a biography.
 *
 * @author Julia Ziebart
 * @author Mayvee Tran
 *
 * @version 1.0
 */
public class Biography extends Book
{
    /**
     * Constructs a Biography.
     *
     * @param title  the title
     * @param author the author
     */
    public Biography(final String title, final int yearPublished, final Author author)
    {
        super(title, yearPublished, author);
    }

    @Override
    public void display() {

    }
}

