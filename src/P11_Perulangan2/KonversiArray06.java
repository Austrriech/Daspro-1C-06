package P11_Perulangan2;

public class KonversiArray06 {
    public static void main(String[] args) {
        char[] namaLengkap = {'A', 'u', 's', 't', 'r', 'r', 'i', 'e', 'c', 'h', 'A', 'r', 'g', 'o', 'n', 'o'};

        int baris = 8;
        int kolom = 5;

        char[][] arrayDuaDimensi = new char[baris][kolom];

        int indeksNama = 0;

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                if (indeksNama < namaLengkap.length) {
                    arrayDuaDimensi[i][j] = namaLengkap[indeksNama];
                    indeksNama++;
                } else {
                    indeksNama = 0;
                    arrayDuaDimensi[i][j] = namaLengkap[indeksNama];
                    indeksNama++;
                }
            }
        }

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(arrayDuaDimensi[i][j] + " ");
            }
            System.out.println();
        }
    }
}
