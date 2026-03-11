
import java.util.Scanner;

public class Nomor3 {
    public static long hitungFaktorialDenganProses(int n) {
        if (n < 0) {
            System.out.println("Nilai n harus >= 0");
            return 0;
        }
        
        if (n == 0 || n == 1) {
            System.out.println(n + "! = 1");
            return 1;
        }
        
        System.out.print(n + "! = ");
        long hasil = 1;
        
        for (int i = n; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) System.out.print("*");
            hasil *= i;
        }
        
        System.out.println(" = " + hasil);
        return hasil;
    }
    public static long hitungFaktorial(int n) {
        if (n < 0) {
            return 0;
        }
        
        if (n == 0 || n == 1) {
            return 1;
        }
        
        long hasil = 1;
        for (int i = 2; i <= n; i++) {
            hasil *= i;
        }
        
        return hasil;
    }

    public static long hitungFaktorialRekursif(int n) {
        if (n < 0) {
            return 0;
        }
        
        if (n == 0 || n == 1) {
            return 1;
        }
        
        return n * hitungFaktorialRekursif(n - 1);
    }
    public static void hitungFaktorialRekursifDenganProses(int n) {
        if (n < 0) {
            System.out.println("Nilai n harus >= 0");
            return;
        }
        
        System.out.print(n + "! = ");
        long hasil = hitungFaktorialRekursif(n);
        
        // Tampilkan proses
        if (n == 0 || n == 1) {
            System.out.println("1");
        } else {
            System.out.print(n);
            for (int i = n - 1; i >= 1; i--) {
                System.out.print("*" + i);
            }
            System.out.println(" = " + hasil);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Program Menghitung Faktorial ===");
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();
        
        System.out.println();
        
        if (n < 0) {
            System.out.println("Nilai n harus >= 0");
        } else {
            hitungFaktorialDenganProses(n);
        }
        
        scanner.close();
    }
}
