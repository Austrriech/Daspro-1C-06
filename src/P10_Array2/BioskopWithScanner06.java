package P10_Array2;

import java.util.Scanner;

public class BioskopWithScanner06 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];
        String nama, next;
        int baris, kolom;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();

            penonton[baris - 1][kolom - 1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
