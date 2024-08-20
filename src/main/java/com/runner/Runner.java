package com.runner;

import com.dataProvider.DataSource;
import org.testng.annotations.Test;

import java.util.Arrays;

public class Runner {
    @Test(dataProvider = "dp1", dataProviderClass = DataSource.class)
    public void test1(String[] data){
        for (String datum : data) {
            System.out.println(datum);
        }
    }

    @Test(dataProvider = "dp2", dataProviderClass = DataSource.class)
    public void test2(Object[] data){
        for (Object datum : data) {
            System.out.println(datum);
        }
    }

    @Test(dataProvider = "dp3Data", dataProviderClass = DataSource.class)
    public void test3(String[] dataa){
        for (String datum : dataa) {
            //String data1 =  (String) datum[0];
            //String data2 =  (String) datum[1];
            System.out.println(datum);
            //System.out.println(data1 + ">> " + data2);
        }
    }

    @Test(dataProvider = "dp4", dataProviderClass = DataSource.class)
    public void test4(Object dataa){
            System.out.println(dataa);
        }
}
