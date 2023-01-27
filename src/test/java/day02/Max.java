package day02;

import java.util.Scanner;

public class Max {

    /*
    ### Finish the method called `max()` that will take two `int` arguments and returns the number that is the biggest between them.

#### This is a `return` method with two `int` parameters

Main topics: methods, Scanner, primitive datatypes, operators, if statements

Example:
```
  max(1, 10)

output:
  10
```
Example:
```
  max(11, 5)

output:
  11
```
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));
    }


    public static int max(int x, int y){
        // WRITE YOUR METHOD BELOW

        int max = 0;
        if(x<y){
            max = y;
        }else {
            max = x;
        }

return max;
    }
}