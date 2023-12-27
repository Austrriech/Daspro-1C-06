package P11_Perulangan2;

import java.util.Arrays;
import java.util.Scanner;

public class Porseni06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] atletData = new String[4][5];

        for (int i = 0; i < atletData.length; i++) {
            System.out.println("Input data atlet cabang ke-" + (i + 1));
            for (int j = 0; j < atletData[0].length; j++) {
                System.out.print("Nama atlet ke-" + (j + 1) + ": ");
                atletData[i][j] = scanner.nextLine();
            }
            System.out.println();
        }

        System.out.println("Data Atlet (diurutkan):");
        for (int i = 0; i < atletData.length; i++) {
            Arrays.sort(atletData[i]);
            System.out.println("Cabang " + (i + 1) + ": " + Arrays.toString(atletData[i]));
        }
    }
}
