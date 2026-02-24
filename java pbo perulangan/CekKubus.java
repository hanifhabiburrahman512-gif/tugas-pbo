import java.util.Scanner;

public class CekKubus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi pertama: ");
        double sisi1 = input.nextDouble();

        System.out.print("Masukkan sisi kedua: ");
        double sisi2 = input.nextDouble();

        System.out.print("Masukkan sisi ketiga: ");
        double sisi3 = input.nextDouble();

        if (sisi1 == sisi2 && sisi2 == sisi3) {
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Kubus");
        }

        input.close();
    }
}