package com.platform.challenge.BasicDSA;

public class QuickSorting {
    public static int partition(int[] array, int low,int high){
        int pivot = array[high];
        int i = low-1;
        for(int j = low;j<high;j++){
            if(array[j]<=pivot){
                i = i+1;
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
        int tmp = array[i+1];
        array[i+1]= array[high];
        array[high] = tmp;

        return i+1;
    }

    public static void QuickSort(int[] array, int low,int high){
        if(low<high){
            int divide = partition(array,low,high);
            QuickSort(array,low,divide-1);
            QuickSort(array,divide+1,high);
        }
    }

    public static void main(String[] args){
        int[] a = {9,7,0,2,3,8,1,6};
        int low = 0;
        int high = a.length-1;
        QuickSort(a,low,high);
        for(int i =0;i<a.length-1;i++)
            System.out.print(a[i]+" ");
    }
}
