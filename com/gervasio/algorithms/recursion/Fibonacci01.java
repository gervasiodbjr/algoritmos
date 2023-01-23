package com.gervasio.algorithms.recursion;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci01 {
    
    static List<Integer> fibonnacci(Integer num) {
        List<Integer> serie = new ArrayList<>();
        for (Integer i = 0; i < num; i++) {
            if (i <= 1) {
                serie.add(1);
            } else {
                serie.add(serie.get(i-1)+serie.get(i-2));
            }
        }
        return serie;
    }

    public static void main(String[] args) {
        
        List<Integer> list = fibonnacci(20);
        System.out.println(list.toString());

    }
    
}
