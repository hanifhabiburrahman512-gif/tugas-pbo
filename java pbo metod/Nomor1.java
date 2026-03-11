
import java.util.Scanner;

public class Nomor1 {
    
    public static int hitungJumlah(int N) {
        int jumlah = 0;
        for (int i = 1; i <= N; i++) {
            jumlah += i;
        }
        return jumlah;
    }
    
    
    public static int hitungJumlahFormula(int N) {
        return N * (N + 1) / 2;
    }
    
  
    public static void tampilkanProses(int N) {
        System.out.print("Untuk N=" + N + ": ");
        int jumlah = 0;
        for (int i = 1; i <= N; i++) {
            if (i > 1) System.out.print("+");
            System.out.print(i);
            jumlah += i;
        }
        System.out.println(" = " + jumlah);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Program Penjumlahan Deret 1+2+3+...+N ===");
        System.out.print("Masukkan nilai N: ");
        int N = scanner.nextInt();
        
        if (N < 1) {
            System.out.println("Nilai N harus >= 1");
        } else {
            System.out.println();
            tampilkanProses(N);
            System.out.println("Hasil: " + hitungJumlah(N));
        }
        
        scanner.close();
    }
}
