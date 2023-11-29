import java.util.Scanner;
public class Tugas1 {
    static int deretDecendingRekursif (int n){
        if (n == 0){
            System.out.print(n);
            return (0);
        }
        else {
            System.out.print(n);
            if (n != 0){
                System.out.print(" ");
            }
            return deretDecendingRekursif(n - 1);
        }
    }
    static void deretDecendingIterasi (int n){
        for (int i = n ; i <= 0 ; i--){
            System.out.print(i);
            if (i != 0){
                System.out.println(" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        deretDecendingRekursif(n);
        System.out.println();
        deretDecendingRekursif(n);
        
    }
}
