// Thực hành Đảo ngược các phần tử của mảng

import java.util.*;


public class ReverseArray {
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

        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        System.out.print("Mảng sau khi đảo ngược: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

    }
}
