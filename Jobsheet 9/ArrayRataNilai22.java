import java.util.Scanner;
public class ArrayRataNilai22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        double total = 0, totalTdkLulus = 0;
        double rata2, rata2TdkLolos;
        int jmlMahasiswaLolos = 0, jmlMahasiswaTdkLolos = 0, jmlMahasiswa;

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        jmlMahasiswa = sc.nextInt();

        int nilaiMhs [] = new int[jmlMahasiswa];

        for (int i = 0 ; i < nilaiMhs.length ; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs [i] = sc.nextInt();
        }
        for (int i = 0 ; i < nilaiMhs.length ; i++){
            if (nilaiMhs[i] > 70){
                System.out.println("Mahasiswa ke-" + (i+1) + " LOLOS !");
                total += nilaiMhs[i];
                jmlMahasiswaLolos++;
            }else {
                System.out.println("Mahasiswa ke-" + (i+1) + " TIDAK LOLOS !");
                totalTdkLulus += nilaiMhs[i];
                jmlMahasiswaTdkLolos++; 
            }
        }
        rata2 = total / jmlMahasiswaLolos;
        System.out.println("Rata Rata Mahasiswa LOLOS = " + rata2);
        rata2TdkLolos = totalTdkLulus / jmlMahasiswaTdkLolos;
        System.out.println("Rata Rata Nilai Mahasiswa TIDAK LOLOS = " + rata2TdkLolos);
    }
}