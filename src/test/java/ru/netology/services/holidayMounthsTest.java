package ru.netology.services;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class holidayMounthsTest {

    @org.junit.jupiter.api.Test
    void holidayMounthsTestOne() {
        holidayMonths calculate = new holidayMonths();
        int expected = 3;
        int actual = calculate.calculateHolidayMounths(10000, 3000, 20000);
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void holidayMounthsTestTwo() {
        holidayMonths calculate = new holidayMonths();
        int expected = 2;
        int actual = calculate.calculateHolidayMounths(100000, 60000, 150000);
        Assertions.assertEquals(expected, actual);
    }
}
