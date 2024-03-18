package Bt123;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Bt {
    public static void main(String[] args) {
//        BT1
        List<Integer> listnumber = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listnumber.add((int) (Math.random()*100));
        }
        for (Integer i : listnumber){
            System.out.print(i+" ");
        }

        System.out.println("\nGiá trị lớn nhất trong mảng là : "+ Collections.max(listnumber));

//        BT2
        System.out.println("List ban đầu "+listnumber);
        List<Integer> reveresedList = new ArrayList<>();
        for (int i = listnumber.size()-1; i >= 0 ; i--) {

            reveresedList.add(listnumber.get(i));
        }
        System.out.println("List đảo : "+reveresedList);

//        Bt3
        Collections.sort(listnumber);
        Collections.reverse(listnumber);
        System.out.println("Sap xếp giảm dần : "+listnumber);
    }
}
