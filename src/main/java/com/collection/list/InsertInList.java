package com.collection.list;

import java.util.*;

public class InsertInList {
    // below String[] arg is for taking 'command line arguments'
    public static void main(String[] arg){
        /**
         * Ways to create a modifiable List.
         */
        //----- First way-------------
        List<String> list  = new ArrayList<>(); // ArrayList have 3 constructors, this creates list with default capcity of 10
        list.add("Manish");
        list.add("Gaur");

        System.out.println(list);

        //------- Second Way ----------
        List<Integer> listA = new ArrayList<>(4);// another constructor where we can define initial capacity.
        Collections.addAll(listA,3,4,6,8,99);
        System.out.println(listA);

        //------- Third Way will ----------------
        List<String> listB = new ArrayList<>(Arrays.asList("Dhara","Sharma")); // way to create modifiable list.
        /**System is a final class, out is a static final variable of PrintStream type
        * println() - method of PrintStream class
         */
        System.out.println(listB);
        listB.add("Gaur");
        System.out.println(listB);
        /**
         * Ways to crate unmodifiable List
         * Arrays.asList() - size of list cannot be changed but elements can be updated.
         * List.Of() - Size and elements cannot be changed.
         */
        //------ First Way - Unmodifiable List -----------------
        System.out.println("---------Unmodifiable List-------------");
        List<String> listC =  Arrays.asList("Jagriti","anmol");
        System.out.println(listC);
        listC.set(0,"Payal"); //update element is allowed in Arrays.asList()
        System.out.println(listC);
        //listC.add("Pari"); // UnSupportedOperationException as size update is not allowed

        //--------- Second Way - Unmodifiable List -----------------
        List<String> listD = List.of("ABC","XYZ"); //List.of() came in java9 version.
        System.out.println(listD);
        //listD.set(1,"Disha"); //update element or update size is not allowed in List created by List.of()
        //System.out.println(listD);





    }
}
