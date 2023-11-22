import java.util.Scanner;
public class UcapanTerimaKasih_22{
    public static String PenerimaUcapan (){
        Scanner sc = new Scanner (System.in);
        System.out.print("Tuliskan NAMA orang yang ingin Anda berikan ucapan: ");
        String namaOrang = sc.nextLine();
        return namaOrang;
    }
    public static void UcapanTerimaKasih () {
        String nama = PenerimaUcapan();
        String upnTmbhn = ucapanTambahan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" +
        "You inspired in me a love for learning and made me feel like i could ask you anything.\n"
        + upnTmbhn);
    }
    public static String ucapanTambahan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan ucapan tambahan: ");
        String upnTmbhn = sc.nextLine();
        return upnTmbhn;
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}