package Bt7;

import java.util.ArrayList;
import java.util.List;

public class Bt {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();

        number.add(2);
        number.add(4);
        number.add(7);
        number.add(11);
        number.add(14);
        number.add(6);

        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < number.size(); i++) {
            if (number.get(i)%2!=0){
                newList.add(number.get(i));
            }
        }
        System.out.println(newList);
    }
}
