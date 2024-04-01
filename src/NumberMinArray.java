// Thực hành Tìm giá trị nhỏ nhất trong mảng sử dụng phương thức

import java.util.*;

public class NumberMinArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array=createArray();
        System.out.println("Mảng vừa nhập là: " + Arrays.toString(array));
        int minValue=minValue(array);
        System.out.println("Giá trị nhỏ nhất trong mảng vừa nhập là: " + minValue);
    }

    public static int[] createArray() {
        System.out.print("Nhập độ dài mảng: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập giá trị của phần tử thứ " + (i + 1) + " : ");
            int element = scanner.nextInt();
            array[i] = element;
        }
        return array;
    }

    public static int minValue(int array[]) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
