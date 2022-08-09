package com.practice;

public class RunningSum {

    public int[] runningSum(int[] nums) {

        for(int i=1; i<nums.length; i++) nums[i] += nums[i-1];
        return nums;
    }
}


/*
 [1,2,3,4]----input

 [1,3,6,10]<---output
 */