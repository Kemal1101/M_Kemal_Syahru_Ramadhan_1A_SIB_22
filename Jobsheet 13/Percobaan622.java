import java.util.Scanner;
public class Percobaan622 {
    static int hitungLuas (int pjg, int lbr){
        int Luas = pjg*lbr;
        return Luas;
    }
    static int hitungVolume (int tinggi, int pjg, int lbr){
        int volume = hitungLuas(pjg, lbr)*tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p,l,t;
        System.out.print("Masukan panjang: ");
        p = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        l = sc.nextInt();
        System.out.println("Luas Persegi Panjang adalah: " + hitungLuas(p, l));
        System.out.print("Masukkan tinggi: ");
        t = sc.nextInt();
        System.out.println("Volume balok adalah: " + hitungVolume(t, p, l));
    }
}
