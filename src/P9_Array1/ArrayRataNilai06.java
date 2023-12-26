package P9_Array1;

import java.util.Scanner;

public class ArrayRataNilai06 {
    public static void main(String[] args) {
        double totalNilaiLulus = 0;
        double totalNilaiTidakLulus = 0;

        double rata2Lulus;
        double rata2TidakLulus;
        int[] nilaiMhs;

        int jumlahMahasiswa;
        int totalLulus = 0;
        int totalTidakLulus = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        jumlahMahasiswa = sc.nextInt();

        nilaiMhs = new int[jumlahMahasiswa];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int nilaiMh : nilaiMhs) {
            if (nilaiMh > 70) {
                totalNilaiLulus += nilaiMh;
                totalLulus += 1;
            } else {
                totalNilaiTidakLulus += nilaiMh;
                totalTidakLulus += 1;
            }
        }

        rata2Lulus = totalNilaiLulus / totalLulus;
        rata2TidakLulus = totalNilaiTidakLulus / totalTidakLulus;

        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);
    }
}
