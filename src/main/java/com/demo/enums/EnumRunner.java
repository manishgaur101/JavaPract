package com.demo.enums;

public class EnumRunner {
    public static void main(String[] args) {
        System.out.println(Severity.CRITICAL);
        Severity sev = Severity.CRITICAL;
        if (sev == Severity.CRITICAL){
            System.out.println("critical");
        }
        else {
            System.out.println("Not Critical");
        }
    }
}
