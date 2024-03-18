package Bt10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Bt10

        List<Integer> listNumber = new ArrayList<>();
        listNumber.add(1);
        listNumber.add(2);
        listNumber.add(3);
        listNumber.add(4);
        listNumber.add(5);

        // Khởi tạo biến tổng và tính tổng các phần tử trong danh sách
        int sum = 0;
        for (int so : listNumber) {
            sum += so;
        }

        // In ra tổng
        System.out.println("Tổng của các phần tử trong danh sách là: " +sum);

//        Bt11

        System.out.println("Giá trị nhỏ nhất là "+Collections.min(listNumber));

    }
}
