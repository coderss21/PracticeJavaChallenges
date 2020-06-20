package TechGig;

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

        //Write code here
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter no of ingredients");
        int noOfIngredients = scan.nextInt();
        int[] qtyRequired = new int[noOfIngredients];
        int[] qtyAvailable = new int[noOfIngredients];
        int[] div = new int[noOfIngredients];
        //System.out.println("enter each ingradient qty ava");
        for(int i =0; i<noOfIngredients; i++){
            qtyRequired[i] = scan.nextInt();

        }
        for(int i =0 ;i<noOfIngredients; i++) {
            qtyAvailable[i] = scan.nextInt();
        }
        for (int i=0;i<noOfIngredients;i++){
            int valueAvailable = qtyAvailable[i];
            int valuerequired = qtyRequired[i];

            div[i] = valueAvailable/valuerequired;
            System.out.print(div[i]);
        }
        int max = div[0];
        System.out.println(max);
        for(int j= 0;j<noOfIngredients; j++)
        {
            if (div[j]<=max){
                max=div[j];
                System.out.println(max);
            }
        }
        System.out.println(max);

    }
}

