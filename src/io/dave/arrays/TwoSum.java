package io.dave.arrays;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
    int[] nums={7,2,1,11,15};
    int target=9;
    System.out.println(Arrays.toString(twoSumUsingTwoPointers(nums,target)));

    }
    public static int[] twoSumUsingMap(int[] nums, int target){
        HashMap<Integer,Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            int complement= target- nums[i];
            if(numMap.containsKey(complement)){
                return new int[]{numMap.get(complement), i};
            }
             numMap.put(nums[i],i);
        }
        return null; 
    }
    public static int[] twoSumUsingTwoPointers(int[] nums, int target){
        Arrays.sort(nums);
        int i=0, j=nums.length-1;
        while (i<j){
            if(nums[i]+nums[j]==target){
                return new int[]{i,j};
            }else if(nums[i]+nums[j]> target){
                j--;
            }else{
                i++;
            }
        }
        return null;
    }
}
