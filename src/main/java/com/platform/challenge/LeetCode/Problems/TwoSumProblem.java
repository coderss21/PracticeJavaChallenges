package com.platform.challenge.LeetCode.Problems;

/*----------------------------------------------------------------------------------------------------
 Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 ------------------------------------------------------------------------------------
*/

import java.util.Arrays;
import java.util.Scanner;

public class TwoSumProblem {
    public int[] twoSum(int[] nums, int target) {

        int[] n =new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(target == (nums[i]+nums[j])){
                    n[0] = i;
                    n[1]= j;
                }
            }
        }
        return (n);
    }

    public static void main(String[] args){
        int[] a = new int[10];
        int target;
        Scanner sc = new Scanner(System.in);
        for (int i =0;i<a.length;i++){
            sc.nextInt();
        }
        target = sc.nextInt();
        TwoSumProblem s = new TwoSumProblem();
        int[] b = s.twoSum(a,target);
        System.out.println(Arrays.toString(b));
    }

}
