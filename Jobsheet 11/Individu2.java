import java.util.Scanner;
public class Individu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai N: ");
        int n = sc.nextInt();

        while (n < 5){
            System.out.println("Nilai N minimal 5 silahkan coba lagi");
            System.out.print("Masukkan Nilai N: ");
            n = sc.nextInt();
        }

        for (int i = 0 ; i < n ; i++){
            for (int j = n ; j > i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
