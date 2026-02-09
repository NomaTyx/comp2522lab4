package ca.bcit.comp2522.bookstore;

/**
 * A representation of an author.
 *
 * @author Julia Ziebart
 * @author Mayvee Tan
 *
 * @version 1.0
 */
public class Author extends Person implements Printable
{
    private String genre;

    private static final int MAX_GENRE_LENGTH = 30;

    /**
     * Creates and initializes an author who is not alive
     *
     * @param name the author's name
     * @param birthDate the author's birth date
     * @param deathDate the author's death date
     * @param genre the genre the author writes in
     */
    public Author(final Name name, final Date birthDate, final Date deathDate, final String genre)
    {
        super(name, birthDate, deathDate);
        this.genre = genre;
    }

    /**
     * Creates and initializes a new Author who is still alive.
     *
     * @param name the author's name
     * @param birthDate the author's birth date
     * @param genre the genre the author wrote in.
     */
    public Author(final Name name, final Date birthDate, final String genre)
    {
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

    /**
     * Gets the genre that this author writes in.
     * @return the genre as a String.
     */
    public String getGenre()
    {
        return genre;
    }

    /**
     * Switches the genre that the author writes in.
     * @param newGenre The genre that they now write.
     */
    private void switchGenre(String newGenre)
    {
        this.genre = newGenre;
    }

    /**
     * Prints the Author and Genre.
     */
    @Override
    public void display() {
        System.out.print("Author ");
        super.display();
        System.out.println("Genre: " + genre + ".");
    }
}
