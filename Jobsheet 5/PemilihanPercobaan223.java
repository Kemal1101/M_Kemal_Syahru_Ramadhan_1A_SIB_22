import java.util.Scanner;
public class PemilihanPercobaan223{
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);

        float uas, uts, kuis, tugas, nilaiAkhir;

        System.out.print("Masukkan Nilai UAS: ");
        uas = input23.nextFloat();
        System.out.print("Masukkan Nilai UTS: ");
        uts = input23.nextFloat();
        System.out.print("Masukkan Nilai Kuis: ");
        kuis = input23.nextFloat();
        System.out.print("Masukkan Nilai Tugas: ");
        tugas = input23.nextFloat();

        nilaiAkhir = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        System.out.println("Nilai Akhir Mahasiswa Adalah: " + nilaiAkhir);
       
        if (nilaiAkhir < 65) {
            System.out.println("Mahasiswa akan mendapatkan remidi");
        }else {System.out.println("Mahasiswa tidak mendapatkan remidi");
    }
    if (80<nilaiAkhir && nilaiAkhir<=100) {
        System.out.println("Nilai Akhir = A");
    }else if (73<nilaiAkhir && nilaiAkhir <=80) {
        System.out.println("Nilai Akhir = B");
    }else if (65<nilaiAkhir && nilaiAkhir<=73) {
        System.out.println("Nilai Akhir = B+");
    }else if (60<nilaiAkhir && nilaiAkhir<=65) {
        System.out.println("Nilai Akhir = C+");
    }else if (50<nilaiAkhir && nilaiAkhir<=60){
        System.out.println("Nilai Akhir = C");
    }else if (39<nilaiAkhir && nilaiAkhir<=50){
        System.out.println("Nilai Akhir = D");
    }else if (nilaiAkhir<=39){
        System.out.println("Nilai Akhir = E");
    }else {System.out.println("COBA LAGI");}

    input23.close();

}   
}