import java.util.Scanner;
public class Individu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //untuk input nilai n
        System.out.print("Masukkan Nilai N: ");
        int n = sc.nextInt();
        //untuk melakukan perulangan ketika n kurang dari 3
    
       for (int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= (n-i) ; j++){
                System.out.print(" ");
            }
            for (int k = 1 ; k <= i ; k++ ){
                System.out.print(k);
            }
            System.out.println();
       }
    }
}
