package com.javaclass.collections;

import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {

       String[] strArr = new String[2];
//       strArr.length
//        strArr[0] = "John";
//        strArr[1] = "Amy";
//        //strArr[2] = "Drake";
//        System.out.println(strArr);



        ArrayList strList = new ArrayList();
        strList.add("John");        // 0
        strList.add("Amy");
        strList.add("Drake");
        strList.add("Abc");
        strList.add("Pqr");
        strList.add("Lmn");
        strList.add("xyz");
        strList.add("test");
        strList.add("dummy");       // index 8
        strList.add("dummy");
        strList.add("dummy2");

        System.out.println(strList);
        System.out.println(strList.get(2));
        System.out.println(strList.get(8));   // arr[index]
        System.out.println(strList.size());   // arr.length (but dynamic)
        strList.remove(8);                 // remove by index
        System.out.println(strList.size());   // arr.length (but dynamic)
        System.out.println(strList);
        strList.remove("dummy2");          // Remove by value

        System.out.println(strList.remove("xyz"));
        System.out.println(strList.remove("some junk"));
        System.out.println(strList.size());   // arr.length (but dynamic)
        System.out.println(strList);

        // Check if the list contains an element
        System.out.println("Contains XXXXX " + strList.contains("XXXXXX"));
        System.out.println("Contains 'John' " + strList.contains("John"));

        // Utility method provided by 'Collections' class
        Collections.sort(strList);
        System.out.println(strList);

        ArrayList newList = new ArrayList();
        newList.add("Amy");
        newList.add("Drake");


        strList.removeAll(newList);          // Removes 'all' elements from the list that mach the specified list
        System.out.println(strList.size());   // arr.length (but dynamic)
        System.out.println(strList);

//        strList.retainAll(newList);         // Will 'retain' all elments that match the specified list
//        System.out.println(strList.size());   // arr.length (but dynamic)
//        System.out.println(strList);

        strList.clear();
        System.out.println(strList.size());   // arr.length (but dynamic)
        System.out.println(strList);




        // Print all elements of a List
//        ArrayList list2 = new ArrayList();
//        list2.add(new MyClass("Ele 1"));
//        list2.add(new MyClass("Ele 2"));
//
//        System.out.println(list2);
//
//        int listSize = list2.size();
//
//        for(int i=0; i<listSize; i++){
//            System.out.println("Element " + i + " is " + list2.get(i));
//        }
//
//        ;
//        list2.clear();

    }
}


class MyClass {
    private String name;

    public MyClass(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}