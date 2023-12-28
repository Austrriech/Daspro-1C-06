package P13_Fungsi1;

import java.util.Scanner;

public class NilaiMahasiswa_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = scanner.nextInt();

        // Matriks untuk menyimpan nilai tugas mahasiswa
        int[][] nilaiTugas = new int[jumlahMahasiswa][jumlahTugas];

        // Input data nilai mahasiswa
        inputDataNilai(scanner, nilaiTugas);

        // Menampilkan nilai mahasiswa
        tampilkanNilaiMahasiswa(nilaiTugas);

        // Mencari hari keberapakah terdapat nilai tertinggi
        int hariTertinggi = cariHariTertinggi(nilaiTugas);
        System.out.println("Nilai tertinggi ditemukan pada minggu ke-" + hariTertinggi);

        // Menampilkan mahasiswa yang memiliki nilai tertinggi
        tampilkanMahasiswaTertinggi(nilaiTugas, hariTertinggi);
    }

    public static void inputDataNilai(Scanner scanner, int[][] nilaiTugas) {
        for (int i = 0; i < nilaiTugas.length; i++) {
            System.out.println("Masukkan nilai tugas untuk Mahasiswa " + (i + 1) + ":");
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiTugas[i][j] = scanner.nextInt();
            }
        }
    }

    public static void tampilkanNilaiMahasiswa(int[][] nilaiTugas) {
        System.out.println("Nilai Tugas Mahasiswa:");
        for (int i = 0; i < nilaiTugas.length; i++) {
            System.out.print("Mahasiswa " + (i + 1) + ": ");
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                System.out.print(nilaiTugas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int cariHariTertinggi(int[][] nilaiTugas) {
        int hariTertinggi = 1;
        int nilaiTertinggi = nilaiTugas[0][0];

        for (int j = 1; j < nilaiTugas[0].length; j++) {
            int nilaiMingguIni = 0;
            for (int[] tugas : nilaiTugas) {
                nilaiMingguIni += tugas[j];
            }

            if (nilaiMingguIni > nilaiTertinggi) {
                nilaiTertinggi = nilaiMingguIni;
                hariTertinggi = j + 1;
            }
        }

        return hariTertinggi;
    }

    public static void tampilkanMahasiswaTertinggi(int[][] nilaiTugas, int hariTertinggi) {
        System.out.println("Mahasiswa dengan nilai tertinggi pada minggu ke-" + hariTertinggi + ":");
        for (int i = 0; i < nilaiTugas.length; i++) {
            if (nilaiTugas[i][hariTertinggi - 1] == nilaiTugas[0][hariTertinggi - 1]) {
                System.out.println("Mahasiswa " + (i + 1) + " dengan nilai " + nilaiTugas[i][hariTertinggi - 1]);
            }
        }
    }
}
