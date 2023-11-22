import java.util.Scanner;
public class Ucapan_23 {
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NAMA orang yang ingin anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        System.out.println(namaOrang);
        return namaOrang;
    }
    public static void main(String[] args) {
        String Nama = PenerimaUcapan();
        System.out.println("Thank you " + Nama + "\nMay the forces be with you.");
    }
}
