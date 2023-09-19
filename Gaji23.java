import java.util.Scanner;
public class Gaji23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlMasuk, jmlTidakMasuk, TotGaji;
        int gaji, potGaji;

        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda: ");
        jmlMasuk = sc.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda: ");
        jmlTidakMasuk = sc.nextInt();

        System.out.println("Masukkan Gaji Anda: ");
        gaji = sc.nextInt();
        System.out.println("Masukkan Potongan Gaji: ");
        potGaji = sc.nextInt();
        
        TotGaji = (jmlMasuk * gaji) - (jmlTidakMasuk * potGaji);
        System.out.println("Gaji Yang Anda Terima adalah: " + TotGaji);

        sc.close();

    }
}
