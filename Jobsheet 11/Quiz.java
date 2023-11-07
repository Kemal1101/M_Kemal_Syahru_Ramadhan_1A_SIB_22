import java.util.Scanner;
import java.util.Random;
public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner (System.in);

        char menu = 'y';
        do{
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do{
                System.out.print("Tebak Angka 1-10 : ");
                int answer = sc.nextInt();
                sc.nextLine();
                if (answer < number){
                    System.out.printf("'%d' lebih dari jawaban ",answer);
                    System.out.println();
                }else if (answer > number){
                    System.out.printf("'%d' kurang dari jawaban ",answer);
                    System.out.println();
                }
                success = (answer == number);
            }while (!success);
            System.out.print("Apakah anda ingin mengulang permainan?\ny untuk iya dan t untuk tidak: ");
            menu = sc.nextLine().charAt(0);
        }while (menu == 'y' || menu == 'Y');
    }
}
