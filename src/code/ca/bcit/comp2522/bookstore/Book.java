package ca.bcit.comp2522.bookstore;

public class Book implements Comparable<Book>, Printable, Reversible
{
    private static final int MAX_TITLE_LENGTH = 100;
    private static final int MINIMUM_YEAR_PUBLISHED = 1;

    private final String title;
    private final int yearPublished;
    private final Author author;

    /**
     *
     * @param title
     * @param yearPublished
     * @param author
     */
    public Book(final String title, final int yearPublished, final Author author) {
        validateTitle(title);
        validateYearPublished(yearPublished);
        validateAuthor(author);

        this.title = title;
        this.yearPublished = yearPublished;
        this.author = author;
    }

    /*
     *
     * @param title
     * @throws IllegalArgumentException
     */
    private static void validateTitle(final String title) throws IllegalArgumentException
    {
        if(title == null || title.isBlank() || title.length() <= MAX_TITLE_LENGTH) {
            throw new IllegalArgumentException("Invalid title");
        }
    }

    /*
     *
     * @param yearPublished
     * @throws IllegalArgumentException
     */
    private static void validateYearPublished(final int yearPublished) throws IllegalArgumentException
    {
        if(yearPublished < MINIMUM_YEAR_PUBLISHED || yearPublished > Date.CURRENT_YEAR) {
            throw new IllegalArgumentException("Invalid publication year");
        }
    }

    /*
     *
     * @param author
     * @throws IllegalArgumentException
     */
    private static void validateAuthor(final Author author) throws IllegalArgumentException
    {
        if(author == null)
        {
            throw new IllegalArgumentException("Invalid author");
        }
    }

    /**
     *
     * @param other the object to be compared.
     * @return
     */
    public int compareTo(final Book other) {
        return other.getYearPublished() - yearPublished;
    }

    public int getYearPublished()
    {
        return yearPublished;
    }

    public String getTitle()
    {
        return title;
    }

    public Author getAuthor()
    {
        return author;
    }
}
