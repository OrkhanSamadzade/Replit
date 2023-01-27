package day02;

import java.util.Scanner;

public class CountHi {

    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW
        String word = "hello";
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (i > word.length()) {
                if ((str.substring(i, i + word.length())).contains(word)) {
                    count += 1;
                }
            }
            System.out.println(count);
        }
    }
}