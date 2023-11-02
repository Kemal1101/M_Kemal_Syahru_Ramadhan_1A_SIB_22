import java.util.Scanner;
public class LinearSearch22 {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
        int jumlahElemen;
        int key, hasil = 0;

        System.out.print("Masukkan Jumlah Elemen: ");
        jumlahElemen = sc.nextInt();
        int ArrayInt [] = new int [jumlahElemen];

        for(int i = 0 ; i < jumlahElemen ; i++){
            System.out.print("Masukkan Elemen Array ke- " + (i) + " : ");
            ArrayInt [i] = sc.nextInt();
        }
        System.out.print("Masukkan Key Yang Ingin Dicari = ");
        key = sc.nextInt();

         boolean ditemukan = false;
        for(int i = 0 ; i < jumlahElemen ; i++){
            if (key == ArrayInt [i] ){
                System.out.print("Key ada dalam array pada posisi indeks ke- " + i);
                ditemukan = true;
                break;
            }
        }
        if(ditemukan == false){
            System.out.println("Key Tidak Ditemukan");
        }
    }
}
