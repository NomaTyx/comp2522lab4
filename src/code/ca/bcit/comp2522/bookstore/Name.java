package ca.bcit.comp2522.bookstore;

public class Name implements Printable
{
    private final String first;
    private final String last;

    /**
     * Creates and initializes a Name with a first and last name component.
     *
     * @param first The first name
     * @param last The last name
     */
    public Name(final String first, final String last)
    {
        validateName(first);
        validateName(last);

        this.first = first;
        this.last = last;
    }

    /*
     * Validates a name.
     *
     * @param name The name to validate
     * @throws IllegalArgumentException If invalid
     */
    private static void validateName(final String name) throws IllegalArgumentException
    {
        if (name == null || name.isBlank())
        {
            throw new IllegalArgumentException("Name can't be null or blank");
        }
    }

    @Override
    public void display() {
        //whoop whoop implement
    }
}
