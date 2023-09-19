import java.util.Scanner;
public class HargaBayar23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga, jumlah, jmlHalaman;
        String merkBuku;
        
        double dis , total, bayar, jmlDiskon;

        System.out.print("Masukkan Harga Barang yang Dibeli: ");
        harga = sc.nextInt();
        System.out.print("Masukkan Jumlah Barang yang Dibeli: ");
        jumlah = sc.nextInt();

        sc.nextLine();
        System.out.print("Merk Buku Tersebut Adalah: ");
        merkBuku = sc.nextLine();
        
        System.out.print("Jumlah Halaman Buku Tersebut Adalah: ");
        jmlHalaman = sc.nextInt();
        System.out.print("Masukkan Nilai Diskon yang Anda Dapatkan (desimal): ");
        dis = sc.nextDouble();
        System.out.println("-------------------------------");

        total = harga * jumlah;
        jmlDiskon = total * dis;
        bayar = total - jmlDiskon;

        System.out.println("Merk Buku Yang Anda Beli Adalah: " + merkBuku);
        System.out.println("Total Halaman Adalah: " + jmlHalaman);
        System.out.println("Harga Sebelum Diskon adalah: " + total);
        System.out.println("Jumlah Diskon yang Anda Dapatakan adalah: " + jmlDiskon );
        System.out.println("Harga yang Harus Dibayar adalah: " + bayar);
    }
}
