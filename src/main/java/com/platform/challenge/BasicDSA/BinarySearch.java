package com.platform.challenge.BasicDSA;

/* For binary search the array should be sorted so we assume our array is already sorted.
   On the given list we apply the binary and find the position of given element
 */
public class BinarySearch {
    public static int binarySearch(int[] a , int low, int high, int element){
        //the base condition to check if not found return -1
        if(low== high){
            if(a[low] == element)
                return low;
            else
                return -1;
        }
        else
        {
            int mid = (low+high)/2;
            if(a[mid] == element)
                return mid;
            else
                if(element <a[mid])
                    return binarySearch(a,low,(mid-1),element);
                else
                    return binarySearch(a,mid+1, high,element);
        }
    }

    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7,8,9};
        int low = 0;
        int high = a.length-1;
        int position = binarySearch(a,low,high,8);
        System.out.println("Element 8 found at position : "+position);
        position= binarySearch(a,low,high,29);
        System.out.println("Element 29 found at position: "+position);
    }

}
