package com.gervasio.algorithms.algoTests.level01;

import java.util.*;



// Given an array of positive integers representing the values of coins in your
// possession, write a function that returns the minimum amount of change (the
// minimum sum of money) that you cannot  create. The given coins can have
// any positive integer value and aren't necessarily unique (i.e., you can have
// multiple coins of the same value).
public class NonConstructibleChange {
    
    public static void main(String[] args) {
        
        int[] coins = {5, 7, 1, 1, 2, 3, 22};
        int saida = nonConstructibleChange(coins);
        
        System.out.println("");
        System.out.println(saida);
        
    }
    
    public static int nonConstructibleChange(int[] coins) {
        // Ordering the array 'coins'
        int n = coins.length;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (coins[j-1] > coins[j]) {
                    int tmp = coins[j-1];
                    coins[j-1] = coins[j];
                    coins[j] = tmp;
                }
            }
        }
        int currentValue = 0;
        for (int i = 0; i < n; i++) {
            int coin = coins[i];
            // System.out.print(coin + " ");
            if (coin > currentValue + 1)
                return currentValue + 1;
            
            currentValue += coin;
        }
        return currentValue + 1;
      }
    
}
