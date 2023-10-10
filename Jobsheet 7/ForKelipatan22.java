import java.util.Scanner;
public class ForKelipatan22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kelipatan, jumlah = 0, counter = 0;
        
        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = sc.nextInt();

        
        for (int i = 1 ; i <= 50 ; i++){
            if (i % kelipatan == 0){
                jumlah += i;
                counter++;
            }
        }float rataRata = jumlah/counter;
         System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
         System.out.printf("total bilangan kelipatan %d dari 1 sampai 50 adalah %d \n", kelipatan, jumlah);
         System.out.printf("rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f \n",kelipatan, rataRata);
}
}