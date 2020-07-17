package com.platform.challenge.BasicDSA;

public class MergeSorting_OutPlace {
    //To divide the arrays into two halves and then call merge method
        public static int[] Merge_Sort(int[] a, int low, int high) {

            if (low < high) {
                int mid = (low + high) / 2;
                //sort 1st and 2nd halves
                Merge_Sort(a, low, mid);
                Merge_Sort(a, mid + 1, high);
                //Merge the sorted halves
                Merge(a, low, mid, high);
            }
            return a;
        }

        private static void Merge(int[] a, int low, int mid, int high) {
            int n1 = mid - low + 1;
            int n2 = high - mid;

            int[] dummy1 = new int[n1];
            int[] dummy2 = new int[n2];

            for (int i = 0; i < n1; i++) {
                dummy1[i] = a[low + i];
            }
            for (int j = 0; j < n2; j++) {
                dummy2[j] = a[mid + 1 + j];
            }

//Merge temp arrays

            int i = 0, j = 0;
            int k = low;
            while (i < n1 && j < n2) {
                if (dummy1[i] <= dummy2[j]) {
                    a[k] = (dummy1)[i];
                    i++;
                } else {
                    a[k] = dummy2[j];
                    j++;
                }
                k++;
            }
            while (i < n1) {
                a[k++] = dummy1[i++];
            }
            while (j < n2) {
                a[k++] = dummy2[j++];
            }
        }

        public static void main(String[] args) {
            int[] a = {10, 40, 60, 30, 20, 90, 80, 50, 70};
            int low = 0;
            int high = a.length - 1;
            Merge_Sort(a, low, high);
            for (int i = 0; i < high; i++) {
                System.out.print(a[i] + "  ");
            }
        }
}

