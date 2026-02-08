package ca.bcit.comp2522.bookstore;

/**
 * Represents a person
 *
 * @author Julia Ziebart
 * @author Mayvee Tran
 */
public class Person implements Comparable<Person>, Printable, Reversible
{
    private final Name name;
    private final Date dateOfBirth;
    private Date dateOfDeath;

    /**
     * Creates and initializes a person with a birth date and a death date.
     *
     * @param name the person's name
     * @param dateOfBirth the person's birth date
     * @param dateOfDeath the person's death date
     */
    public Person(final Name name, final Date dateOfBirth, final Date dateOfDeath)
    {
        validateDateOfBirth(dateOfBirth);

        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
    }

    /**
     * Creates and initializes a Person with a birth date (this person is still alive)
     *
     * @param name The person's name
     * @param dateOfBirth The person's birth date
     */
    public Person(final Name name, final Date dateOfBirth)
    {
        this(name, dateOfBirth, null);
    }

    /**
     * Kills a person (sets their date of death to a specified date).
     *
     * @param deathDate the date of the person's death
     */
    public void kill(Date deathDate) {
        dateOfDeath = deathDate;
    }

    /*
     * Validates a passed in date of birth.
     *
     * @param dateOfBirth the date to validate
     * @throws IllegalArgumentException if the date is invalid
     */
    private static void validateDateOfBirth(final Date dateOfBirth) throws IllegalArgumentException
    {
        if(dateOfBirth == null)
        {
            throw new IllegalArgumentException("DOB can't be null");
        }

        if(dateOfBirth.isAfter(Date.getCurrentDate())) {
            throw new IllegalArgumentException("Invalid date.");
        }
    }

    /**
     * Quantifies the difference between two Persons as an integer.
     *
     * @param other the object to be compared.
     * @return the numerical difference
     */
    @Override
    public int compareTo(final Person other)
    {
        //magic numbers are used because we discussed previously that these numbers are convention
        if(dateOfBirth.isAfter(other.getDateOfBirth()))
        {
            return -1;
        }
        else if(other.getDateOfBirth().isAfter(dateOfBirth))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    /**
     * Returns this person's date of birth.
     * @return the date of birth as a Date
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String print() {
        //whoop whoop implement
        return "";
    }

    @Override
    public void reverse() {
        //whoop whoop implement
    }
}
