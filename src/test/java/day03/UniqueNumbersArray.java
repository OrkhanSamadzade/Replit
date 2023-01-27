package day03;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbersArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array!!!");
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE
        int size = nums.length;
        int [] empty = new int[size];


        int count = 0;
        for(int i = 0; i < size; i++ ) {

            empty[i] = nums[i];

            for (int j = size-1; j >= 0; j--) {
                if (empty[j] == nums[i]) {
                    count++;


                }
            }

        }
        System.out.println(count);

    }

//todo:
}