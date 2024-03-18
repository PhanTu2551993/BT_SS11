package Bt14;

import java.util.ArrayList;
import java.util.Random;

public class SquareMatrix {
    public static void main(String[] args) {
        // Tạo một đối tượng Random để sinh số ngẫu nhiên
        Random random = new Random();

        // Tạo một số ngẫu nhiên từ 1 đến 10 để làm kích thước của ma trận vuông
        int size = random.nextInt(10) + 1;

        // Khởi tạo một ArrayList của ArrayList để tạo ma trận vuông
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        // Tạo ma trận vuông với kích thước và giá trị phần tử ngẫu nhiên
        for (int i = 0; i < size; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                // Thêm phần tử ngẫu nhiên có giá trị từ 0 đến 100 vào hàng
                row.add(random.nextInt(101));
            }
            // Thêm hàng vào ma trận
            matrix.add(row);
        }

        // In ra ma trận vuông
        System.out.println("Ma trận vuông:");
        for (ArrayList<Integer> row : matrix) {
            System.out.println(row);
        }
    }
}
