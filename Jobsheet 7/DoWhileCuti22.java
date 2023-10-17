import java.util.Scanner;
public class DoWhileCuti22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int jatahCuti, jumlahHari;
        String konfrimasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();

        do {
           System.out.print("Apakah anda mau mengambil cuti\n\"y\" untuk iya\n\"t\" untuk tidak: ");
           konfrimasi = sc.next();

           if (konfrimasi.equalsIgnoreCase("y")){
            System.out.print("Masukkan jumlah hari cuti yang ingin diambil: ");
            jumlahHari = sc.nextInt();
            while (jatahCuti < jumlahHari){
                System.out.println("Jumlah hari yang anda input lebih besar daripada jatah cuti anda.\nSilahkan coba lagi");
                System.out.print("Masukkan jumlah hari cuti yang ingin diambil: ");
                jumlahHari = sc.nextInt();
            }
             if(jumlahHari <= jatahCuti ){
                jatahCuti -= jumlahHari;
                System.out.println("Sisa jatah cuti: " + jatahCuti);
             }else{
                System.out.println("Sisa jatah cuti anda tidak mencukupi");
                break;
             }
           }else{
            break;
           }
        }while (jatahCuti > 0);
        System.out.println("Sisa Jatah Cuti Anda Adalah: " + jatahCuti);
    }
}
