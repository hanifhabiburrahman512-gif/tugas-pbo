
import java.util.Scanner;

public class Nomor2 {
    
    
    public static void hitungGanjilGenap(int batasAwal, int batasAkhir) {
        int countGanjil = 0;
        int countGenap = 0;
        
        System.out.println("Range: " + batasAwal + " sampai " + batasAkhir);
        System.out.print("Bilangan Ganjil: ");
        
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                countGanjil++;
            }
        }
        
        System.out.print("\nBilangan Genap: ");
        
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                countGenap++;
            }
        }
        
        System.out.println("\n\nJumlah bilangan ganjil: " + countGanjil);
        System.out.println("Jumlah bilangan genap: " + countGenap);
    }
    
  
    public static int getCountGanjil(int batasAwal, int batasAkhir) {
        int count = 0;
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }
    
    
    public static int getCountGenap(int batasAwal, int batasAkhir) {
        int count = 0;
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Program Menghitung Bilangan Ganjil dan Genap ===");
        System.out.print("Masukkan batas awal: ");
        int batasAwal = scanner.nextInt();
        
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = scanner.nextInt();
        
        System.out.println();
        
        if (batasAwal > batasAkhir) {
            System.out.println("Batas awal harus <= batas akhir");
        } else {
            hitungGanjilGenap(batasAwal, batasAkhir);
        }
        
        scanner.close();
    }
}
