package com.platform.challenge.BasicDSA.GreedyTechniqueApplications;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class JobSequencingWIthDeadline {
    static class Job{
        char jobId;
        int profit;
        int deadline;

        Job(char jobId, int profit, int deadline){
            this.jobId= jobId;
            this.profit= profit;
            this.deadline= deadline;
        }
    }
    public static class Sorting implements Comparator {
        public int compare(Object obj1,Object obj2){
            Job j1 =(Job)obj1 ;
            Job j2 = (Job) obj2;
            if(j1.profit!= j2.profit){
                return j2.profit-j1.profit;
            }
            else
                return j2.deadline-j1.deadline;
        }
    }
    //Function to print Job Scheduling
    public static void printJobSchedule(Job[] jobs, int n){
        Sorting sort = new Sorting();
        Arrays.sort(jobs,sort);

        TreeSet<Integer> set = new TreeSet<>();
        for(int i =0;i<n;i++)
            set.add(i);
        for(int i =0;i<n;i++) {
            Integer x = set.floor(jobs[i].deadline-1);
            if(x!=null){
                System.out.print(jobs[i].jobId+" ");
                set.remove(x);
            }
        }
    }

    public static void main(String[] args){
        int n =5;
        Job[] jobs = new Job[n];

        jobs[0] = new Job('a',100,2);
        jobs[1] = new Job('b',19,1);
        jobs[2] = new Job('c',27,2);
        jobs[3] = new Job('d',67,1);
        jobs[4] = new Job('e',15,3);

        printJobSchedule(jobs,n);
    }

}


