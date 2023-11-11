import java.util.Scanner;
public class Individu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //untuk memasukkan nilai n
        System.out.print("Masukkan Nilai N: ");
        int n = sc.nextInt();

        //untuk melakukan perulangan input nilai n jika nilai n kurang dari 5
        while (n < 5){
            System.out.println("Nilai N minimal 5 silahkan coba lagi");
            System.out.print("Masukkan Nilai N: ");
            n = sc.nextInt();
        }

        //untuk melakukan perulangan print bintang sesuai input an dan nilai j akan berkurang terus 
        //hingga nilai j sama dengan n
        for (int i = 0 ; i < n ; i++){
            for (int j = n ; j > i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
