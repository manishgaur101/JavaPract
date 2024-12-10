package com.collection.list;

import java.util.*;

public class IntegerArrtoListtoSet {
    public static void main(String[] args) {
        Integer[] a = {1,3,2,5,4,7,6};

        /**if array is int type and not Integer then below code for converstion will not work
        as Arrays.asList() takes Wrapper type not primitive type data type.**/
        int[] b = {3,5,7,8};

        /**
         * If we have primitive array and want to convert into collection
         * then we use loop
         * for(int h : b){
         *   listObj.add(h);
         * }
         */

        /**
         * Below commented line gives error coz return type of
         * Arrays.asList() is a List not ArrayList
         */
        //ArrayListist<Integer> a_lst = Arrays.asList(a);
        List<Integer> a_lst = Arrays.asList(a);

        // Convert List into Set
        Set<Integer> a_set =  new LinkedHashSet<>(a_lst);

        //above step we can also do like this in one line
        Set<Integer> aa_set =  new LinkedHashSet<>(Arrays.asList(a));

        System.out.println(a_lst);
    }

}
