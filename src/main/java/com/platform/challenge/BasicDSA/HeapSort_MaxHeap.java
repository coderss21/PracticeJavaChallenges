package com.platform.challenge.BasicDSA;

public class HeapSort_MaxHeap {
    public static void Max_Heapify(int[] a,int heap_size, int parent){
        int left_child = 2*parent +1;
        int right_child = 2*parent +2;
        int largest = parent;
        if(left_child<heap_size && a[left_child]>a[parent])
            largest= left_child;

        if(right_child < heap_size && a[right_child] > a[largest])
            largest= right_child;

        if(largest != parent){
            int temp = a[parent];
            a[parent] = a[largest];
            a[largest] = temp;
            Max_Heapify(a,heap_size,largest);
        }

    }

    public static void BUILD_MAX_HEAP(int[] a){
        int heap_size = a.length;
        for(int i = heap_size/2; i>0;i--)
            Max_Heapify(a,heap_size,i);
    }

    public static void main(String[] args){
        int[] a={9,6,5,0,8,2,1,3};
        BUILD_MAX_HEAP(a);
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
