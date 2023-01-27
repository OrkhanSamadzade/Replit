package day03;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }
        //WRITE YOUR CODE BELOW
        String singleWord = "";
        for (int i = 0; i < words.length; i++) {
            singleWord = words[i];
        }for (int j = 0; j < words.length; j++) {


                if (singleWord.length() < words[j].length()) {
                    singleWord = words[j];
                }
            }
        System.out.println(singleWord);

    }
}