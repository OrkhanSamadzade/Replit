package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        // DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        // TYPE YOUR CODE BELOW:


        String[] arr = sentence.split(" ");
        String result = "";
        System.out.println(Arrays.toString(arr));

        for (int i = arr.length -1; i >= 0; i--) {
        if (i == 0){
            result += arr[i];
        }else {
            result += arr[i] + " ";
        }
    }
        System.out.println(result);
    }
}