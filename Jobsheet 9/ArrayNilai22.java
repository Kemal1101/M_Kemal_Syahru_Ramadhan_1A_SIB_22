import java.util.Scanner;
public class ArrayNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilaiAkhir [] = new int [10];

        int j = 1;
        for (int i = 0 ; i < nilaiAkhir.length ; i++){
            System.out.print("Masukkan Nilai Akhir ke-" + j + " : " );
            nilaiAkhir[i] = sc.nextInt();
            j++;
        }
        int k = 1;
        for (int i = 0 ; i < nilaiAkhir.length; i++){
            
            if (nilaiAkhir[i] > 70){
                System.out.println("Mahasiswa ke-" + k + " LULUS !");
                k++;
            }else if (nilaiAkhir[i] <= 70){
                System.out.println("Mahasiswa ke-" + k + " TIDAK LULUS !");
                k++;
            }
            

        }
    }
}
