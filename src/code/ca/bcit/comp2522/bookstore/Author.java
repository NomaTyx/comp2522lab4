package ca.bcit.comp2522.bookstore;

public class Author extends Person implements Printable
{
    private String genre;

    private static final int MAX_GENRE_LENGTH = 30;

    public Author(final Name name, final Date birthDate, final Date deathDate, final String genre)
    {
        super(name, birthDate, deathDate);

    }

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
}
