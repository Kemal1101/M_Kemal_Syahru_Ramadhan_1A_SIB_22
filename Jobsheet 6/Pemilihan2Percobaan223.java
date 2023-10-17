import java.util.Scanner;
public class Pemilihan2Percobaan223 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);

        float sudut1,sudut2,sudut3,totalsudut;

        System.out.println("Menentukan tipe segitiga");
        System.out.print("Masukkan derajat sudut segitiga pertama: ");
        sudut1 = input23.nextFloat();
        System.out.print("Masukkan derajat sudut segitiga kedua: ");
        sudut2 = input23.nextFloat();
        System.out.print("Masukkan derajat sudut segitiga ketiga: ");
        sudut3 = input23.nextFloat();
        totalsudut = sudut1 + sudut2 + sudut3;

    if (totalsudut == 180){
        if ((sudut1 == sudut2) || (sudut1 == sudut3) || (sudut2 == sudut3)){
            System.out.println("Segitiga tersebut adalah segitiga sama kaki");
        }else if ((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60)){
            System.out.println("Segitiga tersebut adalah segitiga sama sisi");
        } else if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)){
            System.out.println("Segitiga tersebut adalah segitiga siku siku");
        }else {
            System.out.println("Segitiga tersebut adalah segitiga sembarang");
        }
    }else {
        System.out.println("Bangun tersebut merupakan bukan segitiga");
    }
input23.close();
}
}