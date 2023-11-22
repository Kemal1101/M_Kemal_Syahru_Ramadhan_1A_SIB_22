import java.util.Scanner;

public class Kubus22 {
    static int luasPermukaan(int r){
        int L = 6 * (r*r);
        return L;
    }
    static int volumeKubus(int r){
        int V = r*r*r;
        return V;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang rusuk kubus: ");
        int r = sc.nextInt();

        System.out.println("Luas permukaan kubus adalah: " + luasPermukaan(r));
        System.out.println("Volume kubus adalah: " + volumeKubus(r));
        sc.close();
    }
}
