package P11_Perulangan2;

import java.util.Scanner;

public class NestedLoop_2241720179 {
    public static void main(String[] args) {
        double[][] temps = new double[5][7];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        for (double[] kota : temps) {
            System.out.print("Kota: ");
            for (double suhu : kota) {
                System.out.print(suhu + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            double totalSuhu = 0.0;
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print(temps[i][j] + " ");
                totalSuhu += temps[i][j];
            }
            double rataRata = totalSuhu / temps[0].length;
            System.out.println(" | Rata-rata: " + rataRata);
        }
    }
}
