package com.example.demo.java.corejavademo.hashmaps;

import java.util.*;

import static java.util.stream.Collectors.*;
import static java.util.Map.*;

public  class HasmapSortingMainInt {


    public static Object obj;

    public  static void main(String[] args) {


        //Sort hashmap by key
        Map<Integer,String> has = new HashMap();

        has.put(2, "asf2");
        has.put(6, "asf16");
        has.put(3, "asf3");
        has.put(1, "asf1");
        has.put(5, "asf5");
        has.put(15, "asf15");
        has.put(16, "asf16");

        //Put in map
        has.put(4, "asf4");


        //get in map
        System.out.println(has.get(1));

        //remove in hashmap
        System.out.println(has.remove("1"));


        System.out.println(has);


        //Method 1
        Map<Integer,String> treeMap = new TreeMap(has);
        System.out.println(treeMap);


        //Sort hashmap by value


        Map  valueSortedTree = sortByValues(has);

        System.out.println(valueSortedTree);



    }



    public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {

        Comparator<K> comparato=(k1,k2)->{

            int compare=map.get(k1).compareTo(map.get(k2));

            if (compare==0){
                return 1;
            }else {
                return compare;
            }
        };


        Map<K,V> sortedTree=new TreeMap<>(comparato);

        sortedTree.putAll(map);

        return sortedTree;
    }


    private void sortByValueUsingStreamAPI(Map has){

//        //Using Stream API
//        Map<String, String> sortedMapUsingStream=has.entrySet().stream()
//                .sorted(Entry.comparingByValue())
//                .collect(toMap(Entry::getKey, Entry::getValue,(e1, e2)->e2, LinkedHashMap::new));



    }


}
