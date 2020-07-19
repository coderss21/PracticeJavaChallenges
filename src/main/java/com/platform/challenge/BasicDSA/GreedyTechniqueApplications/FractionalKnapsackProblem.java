package com.platform.challenge.BasicDSA.GreedyTechniqueApplications;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsackProblem {
    //Greedy Approach with time complexity O(nlogn)
    static class ItemValue{
        double weight,profit,id;
        Double cost;
        //Constructor of Item Value
        public ItemValue(int weight,int profit,int id){

            this.weight = weight;
            this.profit = profit;
            this.id = id;
            cost=new Double(profit/weight);
        }
    }


 //function to get maximum profit
   private static double knapsackGreedyProcedure(int[] weight,int[] profit, int M){
       ItemValue[] computedArray = new ItemValue[weight.length];
       for(int i=0;i<weight.length;i++){
           computedArray[i] = new ItemValue(weight[i],profit[i],i);
       }
       Arrays.sort(computedArray, new Comparator<ItemValue>() {
           @Override
           public int compare(ItemValue o1, ItemValue o2) {
               return o2.cost.compareTo(o1.cost);
           }
       });


       double totalProfit = 0d;
       for(ItemValue value: computedArray){
           int currWt = (int) value.weight;
           int currProfit = (int) value.profit;
           if(currWt <= M){
            M = M-currWt;
            totalProfit = totalProfit + currProfit;
           }
           else{
               //if cant pick whole item
               double fraction = ((double) M/(double)currWt);
               totalProfit = totalProfit + (currProfit * fraction);
               M = (int) (M- (currWt*fraction));
               break;
           }
       }
       return totalProfit;
   }
  public static void main(String[] args){
       int[] profits = {75,50,90,40,30,80,60};
       int[] weights= {10,8,12,5,4,11,7};
       int maximumWeight = 43;

       double totalProfit = knapsackGreedyProcedure(weights,profits,maximumWeight);
       System.out.println("Total Profit obtained is : "+totalProfit);

  }
}
