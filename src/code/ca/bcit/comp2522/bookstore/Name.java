package ca.bcit.comp2522.bookstore;

/**
 * Represents a first name and last name.
 *
 * @author Julia Ziebart
 * @author Mayvee Tran
 * @version 1.0
 */
public class Name implements Printable
{
    private static final int MAX_NAME_LENGTH = 50;

    private final String first;
    private final String last;

    /**
     * Creates a name with a first and last name.
     *
     * @param first the first name (not null, not blank, less than 50 characters)
     * @param last  the last name (not null, not blank, less than 50 characters)
     * @throws IllegalArgumentException if any parameter is invalid
     */
    public Name(final String first, final String last)
    {
        validateNamePart(first, "first");
        validateNamePart(last, "last");

        this.first = first;
        this.last = last;
    }

    private static void validateNamePart(final String value, final String label)
    {
        if(value == null || value.isBlank())
        {
            throw new IllegalArgumentException(label + " name cannot be null or blank.");
        }

        if(value.length() >= MAX_NAME_LENGTH)
        {
            throw new IllegalArgumentException(label + " name must be less than 50 characters.");
        }
    }

    /**
     * Displays the full name in one sentence.
     */
    @Override
    public void display()
    {
        System.out.println("The full name is " + this + ".");
    }

    /**
     * Returns the full name as "first last".
     *
     * @return full name
     */
    @Override
    public String toString()
    {
        return first + " " + last;
    }
}
