package io.dave.arrays;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] numArr = {1,2,3,4,5,6,7};
        System.out.println(" Initial Array list");
        System.out.println(Arrays.toString(numArr));
        rotateRightUsingModByK(numArr,3);
        System.out.println(Arrays.toString(numArr));
    }

    public static void rotateLeftByK(int[] nums, int k){
        for (int i = 0; i < k; i++) {
            int firstElement=nums[0];
            for (int j = 0; j < nums.length-1; j++) {
                nums[j]= nums[j+1];
            }
            nums[nums.length-1]=firstElement;
        }

        System.out.println(" Result after Left rotate");
        System.out.println(Arrays.toString(nums));
    }

    public static void rotateRightByK(int[] nums, int k){
        for (int i = 0; i < k; i++) {
            int lastElement=nums[nums.length-1];
            for (int j =nums.length-1 ; j >0; j--) {
                nums[j]= nums[j-1];
            }
            nums[0]=lastElement;
        }

        System.out.println(" Result after Right rotate");
        System.out.println(Arrays.toString(nums));
    }

    public static void rotateRightUsingModByK(int[] nums, int k){
        int n = nums.length;
        int[] rotateArr= new int[n];
        for (int i = 0; i < n; i++) {
            int newPosition = (i + k + n)%n;
            rotateArr[newPosition]= nums[i];
        }
        System.out.println(" Result after Right rotate");
        System.arraycopy(rotateArr, 0, nums, 0, n);

    }
    public static void rotateLeftUsingModByK(int[] nums, int k){
        int n = nums.length;
        int[] rotateArr= new int[n];
        for (int i = 0; i < n; i++) {
            int newPosition = (i - k + n)%n;
            rotateArr[newPosition]= nums[i];
        }
        System.out.println(" Result after Right rotate");
        System.arraycopy(rotateArr, 0, nums, 0, n);

    }
}
