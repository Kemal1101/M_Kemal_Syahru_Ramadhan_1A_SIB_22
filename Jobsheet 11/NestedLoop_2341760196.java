import java.util.Scanner;
public class NestedLoop_2341760196 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Double temps [][] = new Double[5][7];
        int jumlahSuhuKota[] = new int[5]; 

        for (int i = 0 ; i < temps.length ; i++){
            System.out.println("Kota ke-" + (i+1));
            for (int j = 0 ; j < temps[0].length ; j++){
                System.out.print("Suhu Hari ke-" + (j+1) + " : ");
                temps [i][j] = sc.nextDouble();
                jumlahSuhuKota[i] += temps[i][j];

            }
        }
        System.out.println();
        for (int i = 0 ; i < temps.length ; i++){
            System.out.println("Kota ke-" + (i + 1) + " : ");
            for (int j = 0 ; j < temps[0].length ; j++){
                System.out.println("Suhu hari ke-" + (j+1) + " : " + temps[i][j] + " ");
            }
            double rataRata = jumlahSuhuKota[i] / 7;
            System.out.println("Rata-rata suhu pada kota-" + (i+1) + " dalam 7 hari adalah: " + rataRata);
            System.out.println();
        }
    }
}
