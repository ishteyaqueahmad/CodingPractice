package com.practice;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

 */
public class SumOfTwoNumbers {

  /*  This code takes O(n2) that is quadratic
    public int[] twoSum(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            for (int j=i+1;j< nums.length;j++){
                if (nums[i]+nums[j]==target)
                    return new int[]{i,j};
            }
        }
        return nums;
    }   */

    /*
    Let's solve it in O(n) time */
    Map<Integer,Integer> complement=new HashMap<>();
    public int[] twoSum(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            Integer complementIndex=complement.get(nums[i]);
            if (complementIndex!=null){
                return new int[]{i,complementIndex};
            }
            else {
                complement.put(target-nums[i],i);
            }
        }
        return nums;
    }
}
