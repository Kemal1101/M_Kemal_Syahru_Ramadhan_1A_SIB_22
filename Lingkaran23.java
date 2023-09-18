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


        System.out.printf("Keliling Lingkaran: %f ",keliling);
        // System.out.println(keliling);

        System.out.printf("Luas Lingkaran: %f ",luas);
        // System.out.print(luas);
        
    }
}