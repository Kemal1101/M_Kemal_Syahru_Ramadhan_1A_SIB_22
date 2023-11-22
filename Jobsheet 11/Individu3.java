import java.util.Scanner;
public class Individu3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String konfirmasi;

        do{
            //untuk memasukkan nilai n
            System.out.print("Masukkan Nilai N: ");
            int n = sc.nextInt();
            //untuk melakukan perulangan ketika input nilai n kurang dari 3
            while (n < 3) {
                System.out.println("Nilai N minimal 3. Silahkan coba lagi");
                System.out.print("Masukkan Nilai N: ");
                n = sc.nextInt();
            }   
            //untuk perulangan per baris ketika nilai i kurang dari sama dengan n nilai i dan nilai i bertambah
            for (int i = 1 ; i <= n ; i++){
                //untuk perulangan ketika j kurang dari sama dengan n pada baris ke i dan nilai j akan bertambah
                for(int j = 1 ; j <= n ; j++){
                    if (i == 1 || i == n || j == 1 || j == n){
                        System.out.print(n + " ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            sc.nextLine();
            System.out.print("Apakah anda mau input angka lagi?: ");
            konfirmasi = sc.nextLine();
        }while (konfirmasi.equalsIgnoreCase("iya"));

    }
}
