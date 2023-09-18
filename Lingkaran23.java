import java.util.Scanner;
public class Lingkaran23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r;
        double keliling, luas, phi;

        System.out.print("Masukkan jari-jari lingkaran: ");
        r = sc.nextInt ();

        phi = 3.14;
        keliling = 2 * phi * r;
        luas = phi * r * r;


        System.out.print("Keliling Lingkaran: ");
        System.out.println(keliling);

        System.out.print("Luas Lingkaran: ");
        System.out.println(luas);
        
    }
}