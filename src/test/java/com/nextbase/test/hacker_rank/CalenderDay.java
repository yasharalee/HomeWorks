package com.nextbase.test.hacker_rank;

import java.time.DayOfWeek;
import java.util.Calendar;

public class CalenderDay {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int year = 2017;
        int month = 8;
        int day = 14;
        c.set(year, month - 1, day);
        int dayInInt = c.get(Calendar.DAY_OF_WEEK)-1;
        if(dayInInt == 0)
            dayInInt =7;
        System.out.println(DayOfWeek.of(dayInInt).toString());

    }
}
