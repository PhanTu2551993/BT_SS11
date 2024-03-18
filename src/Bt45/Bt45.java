package Bt45;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Bt45 {
    public static void main(String[] args) {
        String str = "Rikkei Academy để nông dân viết code a ab";
        List<String> stringList = new ArrayList<>();
        String[] arrString = str.split("\\s");
        System.out.println(Arrays.toString(arrString));
//        C1 : dung addAll
        Collections.addAll(stringList,arrString);
//        C2
//        for (String word : arrString){
//            stringList.add((word.trim()));
//        }
        System.out.println("Danh sách những phần tử có độ dài lớn hơn 3 là : ");
        for (String word : stringList){
            if (word.length() >3){
                System.out.println(word);
            }
        }

        int min = stringList.get(0).length();
        System.out.println(stringList);
        List<String> listMin = new ArrayList<>();
        for (String word : stringList){
            if (word.length() < min){
                listMin.clear();
                listMin.add(word);
                min = word.length();
            } else if (word.length()==min) {
                listMin.add(word);
            }
        }
        System.out.println("Danh sách phần tử ngắn nhất ");
        System.out.println(listMin);
    }
}
