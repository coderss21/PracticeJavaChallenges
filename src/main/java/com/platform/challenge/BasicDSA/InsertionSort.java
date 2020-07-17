package com.platform.challenge.BasicDSA;

public class InsertionSort {
    public static int[] insertionSort(int[] a){
        int n = a.length;
        for(int j =1; j<n; j++){
            int key = a[j];
            int i = j-1;
            while(i>=0 && a[i] > key){
                a[i+1] = a[i];
                i = i-1;
            }
            a[i+1] = key;
        }
        return a;
    }

    public static void main(String[] args){
        int[] a = {9,0,2,5,8,1,7,3,4,6};
        int[] result = insertionSort(a);
        for(int i =0;i<result.length;i++) {
            System.out.print(result[i]+" ");
        }
    }
}
