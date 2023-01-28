package day05;


import java.util.Arrays;

public class ReverseEachWordAndDeleteSpecialChar {


    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length;i++ ){
            for(int j = i+1; j < nums.length;j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[]{2, 4, 6, 3, 8}, 9)));
    }


}
