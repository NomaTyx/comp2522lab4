package ca.bcit.comp2522.bookstore;

public class Name implements Printable
{
    private final String first;
    private final String last;

    public Name(final String first, final String last)
    {
        validateName(first);
        validateName(last);

        this.first = first;
        this.last = last;
    }

    private static void validateName(final String name) throws IllegalArgumentException
    {
        if (name == null || name.isBlank())
        {
            throw new IllegalArgumentException("Name can't be null or blank");
        }
    }

    @Override
    public void display() {

    }
}
