import java.util.Scanner;
public class Individu3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan Nilai N: ");
        int n = sc.nextInt();
        while (n < 3) {
            System.out.println("Nilai N minimal 3. Silahkan coba lagi");
            System.out.print("Masukkan Nilai N: ");
            n = sc.nextInt();
        }

        for (int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                if (i == 1 || i == n || j == 1 || j == n){
                    System.out.print(n);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
