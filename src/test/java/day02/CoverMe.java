package day02;

import java.util.Scanner;

public class CoverMe {
    /*
    ### Finish the method called `coverString()` that will take two `String` arguments `main` and `coverMe` and returns a `String`. Find each occurrence of the String `coverMe` in `main`. Wrap each occurrence of `coverMe` in square brackets. In the case that `main` does not have any occurrence of `coverMe` return a String with the whole `main` String wrapped in square brackets
The `coverString()` method is already called in the main method with an argument.

#### This is a `return` method with two `String` parameter

Main topics: methods, Scanner, String, loops

Example:
```
	coverString("java methods", "me"))

output:
	java [me]thods
```
Example:
```
	coverString("Certified Wooden Spoon", "o"))

output:
	Certified W[o][o]den Sp[o][o]n
```
Example:
```
	coverString("hello hello", "ello"))

output:
	h[ello] h[ello]
```
Example:
```
	coverString("apples", "pears"))

output:
	[apples]
```
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(coverString(in.nextLine(), in.nextLine()));
    }

    public static String coverString(String main, String coverMe) {
        // your code here
        String word = "";

           for (int i = 0; i < main.length() -1; i ++) {
               if (main.contains(coverMe)) {
                   word += "[" + coverMe.charAt(i) + "]";
               }
           }






return word;

    }

}