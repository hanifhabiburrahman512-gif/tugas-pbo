import java.util.Scanner;

public class LamaKerja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jam Masuk (1-12): ");
        int jamMasuk = input.nextInt();

        System.out.print("Masukkan Jam Keluar (1-12): ");
        int jamKeluar = input.nextInt();

        int lamaKerja;

        if (jamKeluar >= jamMasuk) {
            lamaKerja = jamKeluar - jamMasuk;
        } else {
            lamaKerja = (12 - jamMasuk) + jamKeluar;
        }

        System.out.println("Lama Bekerja " + lamaKerja + " Jam");

        input.close();
    }
}