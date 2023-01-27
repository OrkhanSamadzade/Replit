package day02;

import java.util.ArrayList;
import java.util.Scanner;

public class Refuels {
    /*
    ## A pizza delivery men has a scooter an a lot of deliveries to make, he will have to refuel a few times.

### Finish the method called `refuels()` that will take an `ArrayList<Integer>` argument `deliveries` and an `int` `gasTank`. The method returns an `int` for the number of refuels needed. The given values in `deliveries` tells the amount of fuel needed for each delivery and the `gasTank` argument define the max capacity of fuel the car can hold. Use all the given information to determine how much total times the driver will need to stop to refuel. The `refuels()` method is already called in the main method with an argument.

Note: the driver is able to stop for fuel during each delivery, or multiple times during a delivery. Look at total fuel numbers

#### This is a `return` method with an `ArrayList<Integer>` and `int` parameters

Main topics: methods, Scanner, ArrayList, loops, operators

Example:
```
	refuels([7,7,7],7)

output:
	3
	(3 fuel stops 7 units each delivery)
```
Example:
```
	refuels([9,1],3)

output:
	4
	(3 fuel stops for first delivery and +1 stop for second)
```
Example:
```
	refuels([100,200,10],10)

output:
	31
```
     */
public static int refuels(ArrayList<Integer> deliveries, int gasTank) {

    int numberOfRefull = 0;
    int total = 0;
    for (int i = 0; i < deliveries.size(); i++){
        total += deliveries.get(i);
        numberOfRefull = total/gasTank;
        if (total % gasTank != 0){
            numberOfRefull += 1;
        }
    }




    return numberOfRefull;

}



    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int fuel = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(refuels(list, fuel));

    }

}