import java.util.Scanner;
public class WhileGaji22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int  jumlahKaryawan, JumlahJamLembur;
    double gajiLembur = 0, totalGajiLembur = 0;
    String jabatan;

    System.out.print("Masukkan jumlah karyawan: ");
    jumlahKaryawan = sc.nextInt();
    int i = 0;
    while (i < jumlahKaryawan ){
        System.out.println("Masukkan jabatan karyawan - Direktur, Manajer, Karyawan");
        System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ": " );
        jabatan = sc.next();
        while(!(jabatan.equalsIgnoreCase("direktur") || jabatan.equalsIgnoreCase("manajer") || (jabatan.equalsIgnoreCase("karyawan")))){
            System.out.print("Jabatan Invalid. Coba lagi: ");
            jabatan = sc.next();
        }
        System.out.print("Masukkan jumlah jam lembur: ");
        JumlahJamLembur = sc.nextInt();
        i++;

        if (jabatan.equalsIgnoreCase("direktur")){
            continue;
        }else if (jabatan.equalsIgnoreCase("manajer")){
            gajiLembur = JumlahJamLembur * 100000;
        }else if (jabatan.equalsIgnoreCase("karyawan")){
            gajiLembur = JumlahJamLembur * 75000;
        }
        totalGajiLembur += gajiLembur;
        }
         System.out.println("Total gaji lembur: " + totalGajiLembur);
}
}