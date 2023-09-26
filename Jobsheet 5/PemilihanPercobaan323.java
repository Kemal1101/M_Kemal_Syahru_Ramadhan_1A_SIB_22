import java.util.Scanner;
public class PemilihanPercobaan323{
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;
        
        System.out.println("KALKULATOR");
        System.out.print("Masukkan Angka Pertama: ");
        angka1 = input23.nextDouble();
        System.out.print("Masukkan Operator: tambah(+), kurang (-), kali (*), bagi (/) : ");
        operator = input23.next().charAt(0);
        System.out.print("Masukkan Angka Kedua: ");
        angka2 = input23.nextDouble();
       

        switch (operator){

            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                break; 

            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + " = " + hasil);
                break;
                
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + " = " + hasil);
                break;

            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + " = " + hasil);
                break;

            default:
                System.out.println("ga ada bang");
                break;
            }
            //close
            input23.close();
    }
}