import java.util.Scanner;

public class banyakganjilgenap {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        int batasAwal, batasAkhir;
        int jumlahGanjil = 0;
        
        System.out.println("Masukkan batas awal:");
        batasAwal = input.nextInt();

        System.out.println("Masukkan batas akhir:");
        batasAkhir = input.nextInt();

        if (batasAwal > batasAkhir) {
            int temp = batasAwal;
            batasAwal = batasAkhir;
            batasAkhir = temp;
        }

        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {
                jumlahGanjil++;
            }
        }
        
        System.out.println("Jumlah bilangan ganjil = " + jumlahGanjil);
        input.close();
    }
}