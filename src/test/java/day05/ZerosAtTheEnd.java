package day05;

import java.util.Arrays;

public class ZerosAtTheEnd {
    public static void main(String[] args) {

        int[] test = new int[]{2,14,0,67,5,0};

        System.out.println(Arrays.toString(test));
        System.out.println(Arrays.toString(testMethod(test)));
    }
    public static int[] testMethod(int[] nums){

        int size = nums.length, count = 0;
        int[] result = new int[size];
        for (int i = 0; i < size; i++){
            if (nums[i] >0){
                result[count++] = nums[i];
            }

        }
        return result;
    }
}
