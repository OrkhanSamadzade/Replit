package day03;

import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TYPE YOUR CODE BELOW:
        String result = "";
        for (int i = 0; i < sentence.length(); i++){
            result += sentence.charAt(i);
            if (sentence.charAt(i) == ' '){
                result += "\n";
            }
        }
        System.out.println(result);
    }
}