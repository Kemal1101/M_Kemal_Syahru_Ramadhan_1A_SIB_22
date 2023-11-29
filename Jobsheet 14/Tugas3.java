import java.util.Scanner;
public class Tugas3 {
    static int cekPrimaRekursif (int i, int j){
        if (i == 1 || j == 1){
            System.out.println("Bilangan Prima");
            return (0);
        }else if (i % j != 0 && j != 1){
            return cekPrimaRekursif( i , j - 1);
        }else if (i % j == 0 && j != 1) {
            System.out.println("Bukan Bilangan Prima");
        } 
        return (0);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String confirm;
        do {
            System.out.print("Input angka: ");
            int angka = sc.nextInt();
            int i = angka;
            int j = i - 1;
            cekPrimaRekursif(i, j);
            System.out.print("Ulang? : ");
            sc.nextLine();
            confirm = sc.nextLine();
        }while (confirm.equalsIgnoreCase("y"));
    }
}