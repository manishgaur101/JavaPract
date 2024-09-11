package com.datetime;

import java.time.LocalDate;

public class MoveDateInPast {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        //Moving date 20 days in past
        LocalDate pastDate =  currentDate.minusDays(20);
        System.out.println(pastDate);
    }
}
