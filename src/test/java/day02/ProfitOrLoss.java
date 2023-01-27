package day02;

import java.util.Scanner;

public class ProfitOrLoss {

    /*
    ### Finish the method called `profit()` that will take two `int` arguments and returns a String saying if there is a `profit`, a `loss`, or `no loss`. The first argument is the `buyPrice` value and the second argument is the `sellPrice` value. There is a profit if the sell price is more than the buy price.

#### This is a `return` method with two `int` parameters

Main topics: methods, Scanner, primitive datatypes, operators, if statements

Example:
```
  profit(100,1500)

output:
  profit
```
Example:
```
  profit(20, 5)

output:
  loss
```
Example:
```
  profit(100,100)

output:
  no loss
```

     */
    public static String profit(int buyPrice,int sellPrice){
        //WRITE YOUR CODE BELOW

        String message = "";
        if (buyPrice < sellPrice){
            message = "profit";
        }else if (buyPrice > sellPrice){
            message = "loss";
        }else {
            message = "no loss";
        }


    return message;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profit(in.nextInt(), in.nextInt()));
    }

}
