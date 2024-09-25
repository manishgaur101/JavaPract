package com.general;


/**
 *  A year is a leap year if
 *  - divisible by 4 but not divisible by 100
 *  - If divisibile by 4, 100 and 400
 */
public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;
        System.out.println("Year "+year+" is a leap year: "+isLeapYear(year));
    }

    public static boolean isLeapYear(int year){
        boolean value =  false;
        if(year % 4==0){
            if(year % 100 == 0){
                if( year % 400 == 0){
                    value = true;
                }
            }
            else{
                value = true;
            }

        }
        return value;
    }
}
