package ca.bcit.comp2522.bookstore;

public class Person implements Comparable<Person>, Printable, Reversible
{
    public final Date dateOfBirth;
    public Date dateOfDeath;

    /**
     * Creates and initializes a person with a birth date and a death date.
     *
     * @param dateOfBirth the person's birth date
     * @param dateOfDeath the person's death date
     */
    public Person(final Date dateOfBirth, final Date dateOfDeath)
    {
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
    }

    /**
     * Creates and initializes a Person with a birth date (this person is still alive)
     *
     * @param dateOfBirth The person's birth date
     */
    public Person(final Date dateOfBirth)
    {
        this(dateOfBirth, null);
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
        //TODO: implement lmao
        return 0;
    }
}
