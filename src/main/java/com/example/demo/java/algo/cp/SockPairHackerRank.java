package com.example.demo.java.algo.cp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SockPairHackerRank {


    public static void main(String[] args) {

        int[] a={10,20, 20, 10, 10, 30, 50, 10, 20};

        int size=a.length;

        System.out.println(sockMerchant(size,a));

    }

    static int sockMerchant(int n, int[] ar) {
        int totalPair = 0;

        List<String> pair = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (pair.contains(ar[i]+"")){
                totalPair++;
                pair.remove(ar[i]+"");
            }else {
                pair.add(ar[i]+"");

            }

        }

        return totalPair;
    }

}
