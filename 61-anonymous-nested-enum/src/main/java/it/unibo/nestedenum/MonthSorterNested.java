package it.unibo.nestedenum;

import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;

/**
 * Implementation of {@link MonthSorter}.
 */
public final class MonthSorterNested implements MonthSorter {

    public enum Months{
        JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), 
        MAY(30), JUNE(30), JULY(30), AUGUST(30), 
        SEPTEMBER(30), OCTOBER(30), NOVEMBER(30), DECEMBER(30);
        
        private final int days;
        Months(final int days) {
            this.days = days;
        }


    }

    @Override
    public Comparator<String> sortByDays() {
        
        return null;
    }

    @Override
    public Comparator<String> sortByOrder() {
        return null;
    }
}
