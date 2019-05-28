package com.example.demo.java.corejavademo.hashmaps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public  class HasmapSortingMain {


    public static Object obj;

    public  static void main(String[] args) {


        //Sort hashmap by key
        Map has = new HashMap();

        has.put("2", "asf2");
        has.put("6", "asf6");
        has.put("3", "asf3");
        has.put("1", "asf1");
        has.put("5", "asf5");
        has.put("15", "asf15");
        has.put("16", "asf15");

        //Put in map
        has.put("4", "asf4");


        //get in map
        System.out.println(has.get("1"));

        //remove in hashmap
        System.out.println(has.remove("1"));


        System.out.println(has);


        //Method 1
        Map treeMap = new TreeMap(has);
        System.out.println(treeMap);


        //Sort hashmap by value


        //Using Stream API
//        Map<String, String> sortedMapUsingStream=has.




    }

}
