package P10_Array2;

import java.util.Scanner;

public class BioskopWithScanner06 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];
        String nama, next;
        int baris, kolom;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int pilihanMenu = sc.nextInt();
            sc.nextLine(); // Membersihkan newline di buffer

            switch (pilihanMenu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    do {
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine(); // Membersihkan newline di buffer

                        if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
                            if (penonton[baris - 1][kolom - 1] == null) {
                                penonton[baris - 1][kolom - 1] = nama;
                                System.out.println("Data penonton berhasil diinput.");
                                break; // Keluar dari loop jika data berhasil diinput
                            } else {
                                System.out.println("Kursi sudah terisi. Pilih kursi lain.");
                            }
                        } else {
                            System.out.println("Input baris/kolom diluar batas array. Pilih kembali.");
                        }
                    } while (true);
                    break;
                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("***\t");
                            } else {
                                System.out.printf("%s \t", penonton[i][j]);
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Program selesai.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid. Silakan pilih 1, 2, atau 3.");
            }

            System.out.print("Lanjutkan? (y/n): ");
            next = sc.nextLine();
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }

        sc.close();
    }
}
