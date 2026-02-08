package ca.bcit.comp2522.bookstore;

/**
 * A representation of an author.
 *
 * @author Julia Ziebart
 * @author Mayvee Tran
 *
 * @version 1.0
 */
public class Author extends Person implements Printable
{
    private String genre;

    private static final int MAX_GENRE_LENGTH = 30;

    /**
     *
     * @param name
     * @param birthDate
     * @param deathDate
     * @param genre
     */
    public Author(final Name name, final Date birthDate, final Date deathDate, final String genre)
    {
        super(name, birthDate, deathDate);

    }

    /**
     *
     * @param name
     * @param birthDate
     * @param genre
     */
    public Author(final Name name, final Date birthDate, final String genre)
    {
        //mm something seems imperfect about this but i can't be bothered to fix this rn sorry
        this(name, birthDate, null, genre);
    }

    /*
     * Validates a passed in genre
     * @param genre The string to check
     * @throws IllegalArgumentException If the string is invalid
     */
    private static void validateGenre(final String genre) throws IllegalArgumentException
    {
        if(genre == null || genre.isBlank() || genre.length() > MAX_GENRE_LENGTH)
        {
            throw new IllegalArgumentException("Genre is invalid.");
        }
    }

    @Override
    public void display() {
        //whoop whoop implement
    }

    @Override
    public void backward() {
        //whoop whoop implement
    }
}
