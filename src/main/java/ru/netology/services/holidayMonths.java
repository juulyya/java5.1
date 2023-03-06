package ru.netology.services;

public class holidayMonths {

    public int calculateHolidayMounths(int income, int expenses, int threshold) {
        int mounthsCount = 0;
        int balance = 0;
        for (int i = 1; i <= 12; i++) {
            if (balance <= threshold) {
                balance = balance + income;
                balance = balance - expenses;
            } else {
                balance = balance - expenses;
                balance = balance / 3;
                mounthsCount++;
            }
        }
        return mounthsCount;
    }
}
