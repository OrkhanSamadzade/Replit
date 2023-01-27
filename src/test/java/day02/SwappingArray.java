package day02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SwappingArray {

    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2) {
        ArrayList<String> swapping = new ArrayList<>();
        String container = "";

        for (int i = 0; i < list.size(); i ++){

            container = list.get(pos2);
            if (i == pos1){
              swapping.add(container);
            }else if (i == pos2){
            swapping.add(list.get(pos1));

            }else {
                swapping.add(list.get(i));
            }

        }

        Collections.swap(list,pos1,pos2);

return swapping;
    }


    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int pos1 = in.nextInt();
        int pos2 = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(swap(list, pos1, pos2));

    }

}