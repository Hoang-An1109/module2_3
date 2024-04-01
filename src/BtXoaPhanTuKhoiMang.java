// Bài tập Xóa phần tử khỏi mảng

import java.util.*;

public class BtXoaPhanTuKhoiMang {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = createArray();
        System.out.println("Mảng vừa nhập là: " + Arrays.toString(array));
        System.out.print("Nhập giá trị muốn xóa: ");
        int value = scanner.nextInt();

        int count=(countValue(value,array));
        int[] arrayNew=deleteElement(value,array);
        if(count==0){
            System.out.println("Giá trị bạn vừa nhập không có trong mảng!");
        }else {
            System.out.println("Mảng sau khi đã xóa giá trị "+value+" là: "+Arrays.toString(arrayNew));
        }
    }

    public static int[] createArray() {
        int[] array;
        System.out.print("Nhập độ dài mảng: ");
        int size = scanner.nextInt();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập giá trị phần tử thứ " + (i + 1) + " : ");
            int element = scanner.nextInt();
            array[i] = element;
        }
        return array;
    }

    public static int countValue(int value, int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                count++;
            }
        }
        return count;
    }

    public static int[] deleteElement(int value, int[] array) {
        int count=(countValue(value,array));

        int[] arrayNew = new int[array.length - count];

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != value) {
                arrayNew[index] = array[i];
                index++;
            }
        }
        return arrayNew;
    }
}
