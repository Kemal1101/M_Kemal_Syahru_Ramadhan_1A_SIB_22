import java.util.Scanner;
public class WhileKelipatan22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kelipatan, jumlah = 0, k = 0;
        
        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = sc.nextInt();

        int i = 1 ;
        while (i <= 50){
            
            if (i % kelipatan == 0){
                jumlah += i;
                k++;
            }
            i++;
        }float rataRata = jumlah/k;
         System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, k);
         System.out.printf("total bilangan kelipatan %d dari 1 sampai 50 adalah %d \n", kelipatan, jumlah);
         System.out.printf("rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.1f \n",kelipatan, rataRata);


        }
    }
