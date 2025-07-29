import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random rand = new Random();

        // Bước 1: Tạo LinkedList chứa 8 số nguyên < 100
        for (int i = 0; i < 8; i++) {
            list.add(rand.nextInt(100)); // Số từ 0 đến 99
        }
        System.out.println("Danh sách ban đầu: " + list);

        // Bước 2: Thêm phần tử 25 vào vị trí số 2
        list.add(2, 25);
        System.out.println("Sau khi thêm 25 vào vị trí 2: " + list);

        // Bước 3: Xoá phần tử có giá trị < 30
        list.removeIf(n -> n < 30);
        System.out.println("Sau khi xoá phần tử < 30: " + list);

        // Bước 4: In vị trí của phần tử có giá trị từ 40 đến 80
        System.out.print("Vị trí các phần tử có giá trị từ 40 đến 80: ");
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            if (value >= 40 && value <= 80) {
                System.out.print(i + " ");
            }
        }
    }
}
