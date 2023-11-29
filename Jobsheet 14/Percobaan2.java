import java.util.Scanner;
public class Percobaan2 {
    static int hitungPangkat(int x, int y){
        if (y==0){
            return (1);
        }else {
            return (x * hitungPangkat(x, y-1));
        }
    }
    static void hitungPangkat2(int x, int y){
        int hasil = 1;
        for(int i = 1 ; i <= y ; i ++){
            System.out.print(x);
            if (i != y ){
                System.out.print(" * ");
            }else if (i == y){
                System.out.print(" * 1 = ");
            }
            hasil *= x;
        }
        System.out.println(hasil);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("pangkat: ");
        int pangkat = sc.nextInt();
        System.out.println("Hasil: " + hitungPangkat(bilangan, pangkat)); 
        hitungPangkat2(bilangan, pangkat);
    }
}
