package day04;

import java.util.Scanner;

public class WaterTax {

    public static double waterTax(double units) {
        //WRITE YOUR CODE BELOW:
        double result = 0;
        if (units <= 50) {
            result = units * 0.60;
        } else if (units > 50) {
            if (units <= 100) {
                result  = units * 0.90;
            } else if (units <= 150) {
                result = units * 0.60 + 50;
            } else if (units > 150) {
                result = units * 0.60 + 100;
            }
        }
        return result;
    }
        //end waterTax

        public static void main (String[] args){
            Scanner in = new Scanner(System.in);
            System.out.println(waterTax(in.nextDouble()));
        }
    }

