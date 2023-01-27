package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySwapNumber {

    static int[] swap(int[] arr, int k){
        int size = arr.length;
        int[] result = new int[size];
        int container;
        container = arr[k-1];
        System.out.println(container);
        for (int i = 0; i < size; i ++){
            result[i] = arr[i];
            if (i == k-1){
                result[k-1] = arr[size-1];
            } else if(i == size -1){
                result[size-1] = container;
            }
        }
        return result;
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(swap(arr,2)));
    }

}
