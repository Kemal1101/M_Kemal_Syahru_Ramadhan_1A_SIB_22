import java.util.Scanner;
public class Percobaan3 {
    static double hitungLaba (double saldo, int tahun){
        if (tahun == 0){
            return (saldo);
        }else {
            return (1.11 * hitungLaba(saldo, tahun -1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah saldo awal: ");
        double saldoawal = sc.nextDouble();
        System.out.print("Lama investasi (tahun): ");
        int tahun = sc.nextInt();

        System.out.print("Jumlah saldo setelah " + " tahun : " + hitungLaba(saldoawal, tahun));
    }
}
