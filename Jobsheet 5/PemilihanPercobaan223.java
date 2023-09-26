import java.util.Scanner;
public class PemilihanPercobaan223{
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);

        float uas, uts, kuis, tugas, nilaiAkhir;

        System.out.println("NILAI AKHIR MAHASISWA");
        System.out.println("-----------------------");
        System.out.print("Masukkan Nilai UAS    : ");
        uas = input23.nextFloat();
        System.out.print("Masukkan Nilai UTS    : ");
        uts = input23.nextFloat();
        System.out.print("Masukkan Nilai Kuis   : ");
        kuis = input23.nextFloat();
        System.out.print("Masukkan Nilai Tugas  : ");
        tugas = input23.nextFloat();

        nilaiAkhir = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        System.out.println("------------------------------------");
        System.out.println("Nilai Akhir Mahasiswa Adalah: " + nilaiAkhir);
         System.out.println("------------------------------------");
       
        if (nilaiAkhir < 65) {
            System.out.println("------------------------------------");
            System.out.println("Mahasiswa akan mendapatkan remidi");
            System.out.println("------------------------------------");
        }else {
           System.out.println("------------------------------------");
            System.out.println("Mahasiswa tidak mendapatkan remidi");
            System.out.println("------------------------------------");
    }
    if (80<nilaiAkhir && nilaiAkhir<=100) {
        System.out.println("------------------");
        System.out.println("Nilai Akhir = A");
        System.out.println("------------------");
    }else if (73<nilaiAkhir && nilaiAkhir <=80) {
        System.out.println("------------------");
        System.out.println("Nilai Akhir = B");
        System.out.println("------------------");
    }else if (65<nilaiAkhir && nilaiAkhir<=73) {
        System.out.println("------------------");
        System.out.println("Nilai Akhir = B+");
        System.out.println("------------------");
    }else if (60<nilaiAkhir && nilaiAkhir<=65) {
        System.out.println("------------------");
        System.out.println("Nilai Akhir = C+");
        System.out.println("------------------");
    }else if (50<nilaiAkhir && nilaiAkhir<=60){
        System.out.println("------------------");
        System.out.println("Nilai Akhir = C");
        System.out.println("------------------");
    }else if (39<nilaiAkhir && nilaiAkhir<=50){
        System.out.println("------------------");
        System.out.println("Nilai Akhir = D");
        System.out.println("------------------");
    }else if (nilaiAkhir<=39){
        System.out.println("------------------");
        System.out.println("Nilai Akhir = E");
        System.out.println("------------------");
    }else {System.out.println("COBA LAGI");}

    input23.close();

}   
}