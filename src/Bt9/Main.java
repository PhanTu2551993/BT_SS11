package Bt9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);

        System.out.println("Danh sách trước khi xóa phần tử trùng lặp:");
        System.out.println(numbers);

    // Xóa phần tử trùng lặp
    removeDuplicates(numbers);

        System.out.println("Danh sách sau khi xóa phần tử trùng lặp:");
        System.out.println(numbers);
}

public static void removeDuplicates(List<Integer> numbers) {
    List<Integer> uniqueList = new ArrayList<>();
    for (Integer number : numbers) {
        if (!uniqueList.contains(number)) {
            uniqueList.add(number);
        }
    }
    numbers.clear();
    numbers.addAll(uniqueList);
}}
