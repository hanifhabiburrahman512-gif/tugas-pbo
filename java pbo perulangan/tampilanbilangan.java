import java.util.Scanner;

public class tampilanbilangan{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("masukan nilai n (n >=1):");
        n = input.nextInt();

        if (n>=1) {
            for(int i=1; i<=n; i++){
                System.out.println(i);
            }
        }else{
            System.out.println("nilai n harus >=1");
        }
        input.close();
    }

} 