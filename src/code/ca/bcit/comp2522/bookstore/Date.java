package ca.bcit.comp2522.bookstore;

/**
 * Represents a date containing a day, a month, and a year.
 *
 * @author Julia Ziebart
 * @author Mayvee Tran
 * *
 * @version 1.0
 */
public class Date implements Printable
{

    private static final int MINIMUM_YEAR = 1800;
    public static final int CURRENT_YEAR = 2025;

    private static final int MINIMUM_MONTH = 1;
    private static final int NUMBER_OF_MONTHS = 12;

    //the lowest day in a month
    private static final int MINIMUM_DAY = 1;

    //the length of a short month
    private static final int LENGTH_SHORT_MONTH = 30;

    //length of a long month
    private static final int LENGTH_LONG_MONTH = 31;

    //length of a non-leap-year February
    private static final int LENGTH_SHORT_FEB = 28;

    //length of a leap year February
    private static final int LENGTH_LONG_FEB = 29;

    //constants representing the months and their ordinal value in the calendar
    private static final int JANUARY = 1;
    private static final int FEBRUARY = 2;
    private static final int MARCH = 3;
    private static final int APRIL = 4;
    private static final int MAY = 5;
    private static final int JUNE = 6;
    private static final int JULY = 7;
    private static final int AUGUST = 8;
    private static final int SEPTEMBER = 9;
    private static final int OCTOBER = 10;
    private static final int NOVEMBER = 11;
    private static final int DECEMBER = 12;

    private static final int LEAP_YEAR_FREQUENCY = 4;
    private static final int LEAP_YEAR_SKIP_FREQUENCY = 100;
    //I don't have a fantastic name for this. suggestions are welcomed.
    private static final int LEAP_YEAR_RESUME_FREQUENCY = 400;

    private final int day;
    private final int month;
    private final int year;

    //these are some constants required for the algorithm used to calculate the day of the week.
    private static final int ADD_IF_MILLENNIUM_IS_2000 = 6;
    private static final int ADD_IF_JAN_FEB_LEAP_YEAR = 6;
    private static final int ADD_IF_MILLENNIUM_IS_1800 = 2;

    private static final int LAST_TWO_DIGITS_OF_YEAR_DIVISOR = 100;

    private static final int YEAR_2000 = 2000;
    private static final int YEAR_1900 = 1900;

    private static final String MONTH_CODE = "0144025036146";

    private static final int ALGORITHM_STEP_3_DIVISOR = 4;
    private static final int ALGORITHM_STEP_6_DIVISOR = 7;

    //each one of these numbers that the day of the week algorithm spits out corresponds to a specific day of the week.
    private static final int ALGORITHM_SAT = 0;
    private static final int ALGORITHM_SUN = 1;
    private static final int ALGORITHM_MON = 2;
    private static final int ALGORITHM_TUE = 3;
    private static final int ALGORITHM_WED = 4;
    private static final int ALGORITHM_THU = 5;
    private static final int ALGORITHM_FRI = 6;

    /**
     * Constructor. Generates a date based on the given parameters, if valid.
     *
     * @param year  The year of the date.
     * @param month The month of the date.
     * @param day   The day of the date.
     */
    public Date(final int year,
                final int month,
                final int day)
    {
        validateDate(year, month, day);

        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Gets this date's day.
     *
     * @return the day
     */
    public int getDay()
    {
        return day;
    }

    /**
     * Gets this date's month.
     *
     * @return the month
     */
    public int getMonth()
    {
        return month;
    }

    /**
     * Gets this date's year.
     *
     * @return the year
     */
    public int getYear()
    {
        return year;
    }

    /**
     * Returns the date, as a string, formatted YYYY-MM-DD.
     *
     * @return A string containing the formatted date.
     */
    public String getYYYYMMDD()
    {
        return String.format("%4d-%02d-%02d", year, month, day);
    }

    /**
     * Gets the day of the week that this date corresponds to, according to a specific formula
     * step 1: calculate the number of twelves in the last two days of the year
     * step 2: calculate the remainder from step 1
     * step 3: calculate the number of fours in step 2
     * step 4: add the day of the month to each step above
     * step 5: there is a digit for each month, defined in a constant above. Add the number that corresponds to the month.
     * step 6: add the previous five numbers and mod by 7
     * step 7: The algorithm will spit out 0 1 2 3 4 5 6, which respectively correspond to sat sun mon tue wed thu fri
     *
     * @return the day of the week as a string
     */
    public String getDayOfWeek()
    {
        //buckle up because we're following a long, confusing, and specific algorithm for this.
        //first we have a variable. this is going to end up equal to a number 1-7, corresponding to the day of the week.
        int dayOfWeekTracker;
        dayOfWeekTracker = 0;

        //then we need to calculate the last two digits of the year.
        final int lastTwoDigitsOfYear;
        lastTwoDigitsOfYear = year % LAST_TWO_DIGITS_OF_YEAR_DIVISOR;

        //if it's a leap year, we need to add 6
        if (isLeapYear(year) && (month == JANUARY || month == FEBRUARY))
        {
            dayOfWeekTracker += ADD_IF_JAN_FEB_LEAP_YEAR;
        }

        //then if the year is in the 2000s, add 6
        if (year >= YEAR_2000)
        {
            dayOfWeekTracker += ADD_IF_MILLENNIUM_IS_2000;
        }
        //or if the year is in the 1800s, add 2.
        else if (year < YEAR_1900)
        {
            dayOfWeekTracker += ADD_IF_MILLENNIUM_IS_1800;
        }

        //step 1
        dayOfWeekTracker += lastTwoDigitsOfYear / NUMBER_OF_MONTHS;

        //step 2
        dayOfWeekTracker += lastTwoDigitsOfYear % NUMBER_OF_MONTHS;

        //step 3
        dayOfWeekTracker += lastTwoDigitsOfYear % NUMBER_OF_MONTHS;

        //step 4
        dayOfWeekTracker /= ALGORITHM_STEP_3_DIVISOR;

        //step 5
        dayOfWeekTracker += day;

        //step 6
        dayOfWeekTracker += Integer.parseInt(String.valueOf(MONTH_CODE.charAt(month)));
        dayOfWeekTracker %= ALGORITHM_STEP_6_DIVISOR;

        //parse the number
        if (dayOfWeekTracker == ALGORITHM_SAT)
        {
            return "Saturday";
        }
        else if (dayOfWeekTracker == ALGORITHM_SUN)
        {
            return "Sunday";
        }
        else if (dayOfWeekTracker == ALGORITHM_MON)
        {
            return "Monday";
        }
        else if (dayOfWeekTracker == ALGORITHM_TUE)
        {
            return "Tuesday";
        }
        else if (dayOfWeekTracker == ALGORITHM_WED)
        {
            return "Wednesday";
        }
        else if (dayOfWeekTracker == ALGORITHM_THU)
        {
            return "Thursday";
        }
        else if (dayOfWeekTracker == ALGORITHM_FRI)
        {
            return "Friday";
        }
        //not really sure what else to throw. I tried to throw Exception but Java did not like it.
        else
        {
            throw new IllegalArgumentException("Error calculating day of week!");
        }
    }

    /**
     * Checks whether the specified year is a leap year.
     *
     * @param year the year
     *
     * @return whether the supplied year is a leap year
     */
    public static boolean isLeapYear(final int year)
    {
        return year % LEAP_YEAR_FREQUENCY == 0 && year % LEAP_YEAR_SKIP_FREQUENCY != 0 ||
                year % LEAP_YEAR_RESUME_FREQUENCY == 0;
    }

    /*
     * validates the full date
     *
     * @param year the year component
     * @param month the month component
     * @param day the day component
     */
    private static void validateDate(final int year,
                                     final int month,
                                     final int day)
    {
        validateYear(year);
        validateMonth(month);
        validateDay(day, month, year);
    }

    //validates a year
    private static void validateYear(final int year)
    {
        if (year < MINIMUM_YEAR)
        {
            throw new IllegalArgumentException("Year " + year + " cannot be lower than " + MINIMUM_YEAR);
        }

        if (year > CURRENT_YEAR)
        {
            throw new IllegalArgumentException("Year " + year + " cannot be higher than " + CURRENT_YEAR);
        }
    }

    //validates a month
    private static void validateMonth(final int month)
    {
        if (month < MINIMUM_MONTH)
        {
            throw new IllegalArgumentException("Month " + month + " can't be lower than " + MINIMUM_MONTH);
        }

        if (month > NUMBER_OF_MONTHS)
        {
            throw new IllegalArgumentException("Month " + month + " can't be higher than " + NUMBER_OF_MONTHS);
        }
    }

    //validates a day
    private static void validateDay(final int day, final int month, final int year)
    {
        boolean dayIsTooLong;
        dayIsTooLong = false;

        if (day > LENGTH_LONG_MONTH)
        {
            dayIsTooLong = true;
        }
        else if (month == APRIL || month == JUNE || month == SEPTEMBER || month == NOVEMBER)
        {
            if (day > LENGTH_SHORT_MONTH)
            {
                dayIsTooLong = true;
            }
        }
        else if (month == FEBRUARY)
        {
            if (day > LENGTH_LONG_FEB)
            {
                dayIsTooLong = true;
            }
            else if (isLeapYear(year))
            {
                if (day > LENGTH_SHORT_FEB)
                {
                    dayIsTooLong = true;
                }
            }
        }

        if (dayIsTooLong)
        {
            throw new IllegalArgumentException("Day " + day + " is too large for this month. Max is " + LENGTH_LONG_MONTH);
        }
    }

    /**
     * Returns the content of this Date formatted as "[day of week], [YYYY/MM/DD]".
     *
     * @return the formatted string
     */
    @Override
    public String toString()
    {
        return getDayOfWeek() + ", " + getYYYYMMDD();
    }
}