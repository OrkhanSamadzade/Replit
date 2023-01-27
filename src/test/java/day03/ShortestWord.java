package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestWord {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW

        String[] arr = str.split(" ");
        String container = "";

        String[] result = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            container = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (container.length() > arr[j].length()) {
                    result[j] = arr[j];
                } else if (container.length() == arr[j].length()) {
                    result[j] = container;
                }
            }
//todo:

        }
        System.out.println(Arrays.toString(result));
    }
}