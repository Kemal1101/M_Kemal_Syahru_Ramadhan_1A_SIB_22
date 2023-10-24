import java.util.Scanner;
public class Nilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlElemen;

        System.out.print("Masukkan Jumlah Elemen: ");
        jmlElemen = sc.nextInt();
        int nilai [] = new int[jmlElemen];

        int totalnilai = 0;
        for (int i = 0 ; i < jmlElemen ; i++){
            System.out.print("Masukkan Nilai Elemen ke- " + (i+1) + " : ");
            nilai [i] = sc.nextInt();
            totalnilai += nilai[i];
        }
        int nilaiTertinggi = nilai [0];
        for (int i = 0 ; i < jmlElemen ; i++){
            if(nilaiTertinggi < nilai[i]){
                nilaiTertinggi = nilai[i];
            }
        }System.out.println("Nilai tertinggi adalah: " + nilaiTertinggi);
        
        int nilaiTerendah = nilai [0];
        for (int i = 0 ; i < jmlElemen ; i++){
            if(nilaiTerendah > nilai[i]){
                nilaiTerendah = nilai[i];
            }
        }System.out.println("Nilai terendah adalah: " + nilaiTerendah);

        double ratarata;
        ratarata = (totalnilai/jmlElemen);
        System.out.println("Rata rata semua elemen: " + ratarata);
        System.out.println(totalnilai);


    }
}
