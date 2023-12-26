package P9_Array1;

import java.util.Scanner;

public class Tugas06 {
    public static void main(String[] args) {
        int totalElement;
        int highestPoint = Integer.MIN_VALUE;
        int lowestPoint = Integer.MAX_VALUE;
        int[] points;
        double average;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        totalElement = sc.nextInt();

        points = new int[totalElement];
        for (int i = 0; i < totalElement; i++) {
            System.out.print("Masukkan nilai elemen ke-" + i + " : ");
            points[i] = sc.nextInt();

            if (points[i] > highestPoint) {
                highestPoint = points[i];
            }
            if (points[i] < lowestPoint) {
                lowestPoint = points[i];
            }
        }

        int sum = 0;
        for (int point : points) {
            sum += point;
        }
        average = (double) sum / totalElement;

        System.out.println("Nilai Tertinggi: " + highestPoint);
        System.out.println("Nilai Terendah: " + lowestPoint);
        System.out.println("Rata-rata: " + average);
    }
}
