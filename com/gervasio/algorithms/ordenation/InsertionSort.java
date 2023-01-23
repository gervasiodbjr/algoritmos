package com.gervasio.algorithms.ordenation;

public class InsertionSort implements Sort {
    
    @Override
    public void sort(int[] array){
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int ref = array[i];
            while (j >= 0 && array[j] > ref) {
                array[j+1] = array[j];
                array[j] = ref;
                j--;
            }
        }
    }
    
    @Override
    public void personalSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int ref = array[i];
            while (j >= 0 && array[j] > ref) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = ref;
        }
    }
    
}
