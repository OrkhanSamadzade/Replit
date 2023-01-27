package day02;

import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }



    public static String uniqueChars(String str) {
        String result="";
        for(int i=0; i<str.length(); i++){
            if(!result.contains(""+str.charAt(i)))
                result+=str.charAt(i);
        }
        return result;
    }
}