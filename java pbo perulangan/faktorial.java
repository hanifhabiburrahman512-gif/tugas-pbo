import java.util.Scanner;

public class faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        long hasil = 1;

        System.out.print("Masukkan nilai n (n >= 0): ");
        n = input.nextInt();

        if (n >= 0) {

            System.out.print(n + "!=");
            
            if (n == 0) {
                System.out.println("1=1");
            } else {
                for (int i = n; i >= 1; i--) {
                    hasil *= i;
                    System.out.print(i);

                    if (i > 1) {
                        System.out.print("*");
                    }
                }
                System.out.println("=" + hasil);
            }

        } else {
            System.out.println("Nilai n harus >= 0");
        }

        input.close();
    }
}