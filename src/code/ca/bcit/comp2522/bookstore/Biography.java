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
    private final Person subject;

    /**
     * Constructs a Biography.
     *
     * @param title  the title
     * @param author the author
     */
    public Biography(final String title, final int yearPublished, final Author author, final Person subject)
    {
        super(title, yearPublished, author);
        if(subject == null)
        {
            throw new IllegalArgumentException("Subject cannot be null.");
        }

        this.subject = subject;

    }
    public Person getSubject()
    {
        return subject;
    }

    @Override
    public void display()
    {
        System.out.print("Biography ");
        super.display();
        System.out.print("Subject is ");
        subject.display();
    }

    /**
     * Two biographies are equal if they are about the same subject.
     */
    @Override
    public boolean equals(final Object obj)
    {
        if(this == obj)
        {
            return true;
        }

        if(!(obj instanceof Biography))
        {
            return false;
        }

        final Biography other = (Biography) obj;
        return subject.equals(other.subject);
    }
}

