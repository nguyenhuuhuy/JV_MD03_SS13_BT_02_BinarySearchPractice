package demo.bt2;

import java.util.*;

public class Test {

    static int binarySearch(List<Integer> list, int left, int right, int value) {
        if (right >= left) {
            int middle = (left + right) / 2;
            if (list.get(middle) == value) {
                return middle;
            }
            if (list.get(middle) > value) {
                return binarySearch(list, left, middle - 1, value);
            } else {
                return binarySearch(list, middle + 1, right, value);
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        do {
            System.out.println("Nhập case\n1. up number" + "\n2.show" + "\n3.sort->Up");
            System.out.print("Mời chọn số : ");
            int choise = sc.nextInt();
            switch (choise) {
                case 1:
                    System.out.print("Mời nhập số: ");
                    int number = sc.nextInt();
                    list.add(number);
                    break;
                case 2:
                    System.out.println("Mảng ban đầu: ");
                    System.out.println(list);
                    break;
                case 3:
                    Collections.sort(list);
                    break;
                case 4:
                    int size = list.size();
                    System.out.println("Mời chọn số cần tìm vị trí: ");
                    int index = sc.nextInt();
                    System.out.println("ở vị trí thứ: "+binarySearch(list, 0, size - 1, index));
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choise);
            }
        } while (true);
    }
}
