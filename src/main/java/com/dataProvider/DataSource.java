package com.dataProvider;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataSource {

    // Single Dimentional String array
    @DataProvider
    public String[] dp1() {
        String[] data = new String[]{"manish","renuka","manu","chitra","sohan","mohan","sonia","vidhi"};
        return data;
    }

    // Single Dimentional Object array
    @DataProvider
    public Object[] dp2() {
        Object[] data = new String[]{"manish","renuka","2","diksha","4","manu","1",""};
        return data;
    }

    // Multi dimentional Object array
    @DataProvider(name="dp3Data")
    public String[][] dp3() {
        String[][] data = new String[][] {
                            {"Manish","Kashish"},
                            {"Sohan","Rohan"},
                            {"Babulal","tinku"}

        };
        return data;

       /* return new Object[][] {
                { new Object[][]
                        {
                                {"data1", 1},
                                {"data2", 2},
                                {"data3", 3}
                        }
                }
        };*/
    }

    //Iterator<Object> return type
    @DataProvider
    public Iterator<Object> dp4(){
        List<Object> data =  new ArrayList<>();
        data.add("Manish");
        data.add("Divya");
        data.add(5);
        return data.iterator();
    }

    //Iterator<Object[]> return type
    @DataProvider
    public Iterator<Object[]> dp5(){
        List<Object[]> data =  new ArrayList<>();
        data.add(new String[]{"manish","sonia"});
        data.add(new Object[]{"manish",5});
        data.add(new Integer[]{3,44});
        return data.iterator();
    }

}
