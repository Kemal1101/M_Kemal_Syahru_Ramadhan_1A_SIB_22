import java.util.Scanner;
public class Pemilihan2Percobaan323 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner (System.in);

        String kategori;
        int penghasilan, gajibersih;
        double pajak;

        System.out.print("Masukkan Kategori: ");
        kategori = input23.nextLine();

        if(kategori.equalsIgnoreCase("pekerja")){
            System.out.print("Masukkan Penghasilan: ");
            penghasilan = input23.nextInt();
            if(penghasilan <= 2000000){
                pajak = 0.1;
            }else if (penghasilan <= 3000000){
                pajak = 0.15;
            }else {
                pajak = 0.2;
            } 
            gajibersih = (int)(penghasilan - (penghasilan * pajak));
            System.out.println("gaji bersih adalah: " + gajibersih);
        }else if (kategori.equalsIgnoreCase("pebisnis")){
            System.out.print("Masukkan Penghasilan: ");
            penghasilan = input23.nextInt();
            if (penghasilan <= 2500000){
                pajak = 0.15;
            }else if (penghasilan <= 3500000){
                pajak = 0.2;
            }else{
                pajak = 0.25;
            } gajibersih = (int)(penghasilan - (penghasilan * pajak));
            System.out.println("gaji bersih adalah: " + gajibersih);
        }else {
            System.out.println("kategori salah");
        }
        input23.close();

    }
}
