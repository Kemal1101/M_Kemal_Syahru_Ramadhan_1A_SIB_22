import java.util.Scanner;
public class PemilihanPercobaan123{
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        
        int angka;
        
        System.out.print("Masukkan Angka: ");
        angka = input23.nextInt();

        String hasil = angka % 2 == 0 ? "Bilangan tersebut adalah Bilangan Genap" : "Bilangan tersebut adalah Bilangan Ganjil";
        System.out.println(hasil);
        

        input23.close();
        //close
    }
}

