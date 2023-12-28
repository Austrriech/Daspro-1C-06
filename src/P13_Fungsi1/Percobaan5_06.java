package P13_Fungsi1;

public class Percobaan5_06 {
    public static void main(String[] args) {
        Tampil("Daspro 2019", 100, 200);
        Tampil("Teknologi Informasi", 1, 2, 3, 4, 5);
        Tampil("Polinema");

        TampilkanData("Angka:", 1, 2, 3);
        TampilkanData("Huruf:", 'A', 'B', 'C');
    }

    static void Tampil(String str, int... a) {
        System.out.println("String: " + str);
        System.out.println("Jumlah argumen/parameter: " + a.length);

        for (int i : a) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    static <T> void TampilkanData(String label, T... data) {
        System.out.print(label + " ");
        for (T item : data) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}