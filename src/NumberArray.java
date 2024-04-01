// Thực hành Tìm giá trị lớn nhất trong mảng

import java.util.*;


public class NumberArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size;
        int[] array;

        do{
            System.out.print("Nhập độ dài của mảng: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Độ dài mảng không vượt qua 20.");
        }while (size>20);

        array=new int[size];
        int i=0;
        while(i<array.length){
            System.out.print("Nhập phần tử thứ "+(i+1)+" : ");
            array[i]=scanner.nextInt();
            i++;
        }

        System.out.print("Mảng vừa nhập là: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();

        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Giá trị thuộc tính lớn nhất trong danh sách là: " + max + " ,ở vị trí: " + index);

    }
}
