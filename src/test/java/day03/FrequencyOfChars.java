package day03;

import java.util.Scanner;

public class FrequencyOfChars {
    /*
    ### Finish the method called `countLetters()` that will take a `String` argument `str` and returns a `String`. Find the frequency of each character in `str` and concatenate the frequency number with the character. Return the concatenated String with all the frequencies. The `countLetters()` method is already called in the main method with an argument.

#### This is a `return` method with a `String` parameter

Concatenated String should be in this format:
> frequency number + letter

Main topics: methods, Scanner, String, loops

Example:
```
	countLetters("aaabbcccc");

output:
	3a2b4c
```
Example:
```
	countLetters("appleeess");

output:
	1a2p1l3e2s
```

     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));

    }

    public static String countLetters(String str) {
        String word = "";
        String meesage = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

                if (!word.contains("" + str.charAt(i))) {
                    word += str.charAt(i);



                }else {
                    count++;
                    meesage = count + " " + str.charAt(i);
                }



        }
        return meesage;
//todo:


    }
    }

