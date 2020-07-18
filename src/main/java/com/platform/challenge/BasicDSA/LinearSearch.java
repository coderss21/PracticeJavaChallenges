package com.platform.challenge.BasicDSA;

public class LinearSearch {
    /*
      For this linear search the array need not be sorted and in worst case it will take O(n) time with O(1) space complexity.
      No extra space is required except some variables to be stored.
     */
    public static int linearSearching(int[] a, int low, int high,int element){
        if(low==high)
            if(a[low] == element) {
                return low;
            }
        else
            return -1;
        for(int i = low;i<high;i++){
            if(a[i] == element)
                return i;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] a = {1,90,76,26,78,98,12,45,76,87,22,23,0,10};
        int position = linearSearching(a,0,a.length,90);
        System.out.println("The element 90 position is "+position);
        position= linearSearching(a,0,a.length,8);
        System.out.println("The element 87 position is: "+position);
        position= linearSearching(a,0,a.length,10);
        System.out.println("The position of element 10 is : "+position);
    }
}
