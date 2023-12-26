package P9_Array1;

import java.util.Scanner;

public class LinearSearch06 {
    public static void main(String[] args) {
        int[] arrayInt;
        int key, jumlahElemenArray;
        int hasil = 0;
        boolean isFound = false;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        jumlahElemenArray = sc.nextInt();

        arrayInt = new int[jumlahElemenArray];
        for (int i = 0; i < jumlahElemenArray; i++) {
            System.out.print("Masukkan elemen array ke-" + i + " : ");
            arrayInt[i] = sc.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        key = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                isFound = true;
                break;
            }
        }

        if (isFound) System.out.println("Key ada di posisi indeks ke-" + hasil);
        else System.out.println("Key tidak ditemukan");
    }
}
