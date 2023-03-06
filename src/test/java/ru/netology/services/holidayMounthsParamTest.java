package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class holidayMounthsParamTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/main/resources/holidaysFirstTest")
    public void holidayMounthsTestFirst(int income, int expenses, int threshold) {
        holidayMonths calculate = new holidayMonths();
        int expected = 3;
        int actual = calculate.calculateHolidayMounths(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/main/resources/holidaysSecondTest")
    public void holidayMounthsTestSecond(int income, int expenses, int threshold) {
        holidayMonths calculate = new holidayMonths();
        int expected = 2;
        int actual = calculate.calculateHolidayMounths(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
