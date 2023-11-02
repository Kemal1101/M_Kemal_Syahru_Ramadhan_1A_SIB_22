import java.util.Scanner;
public class BioskopWithScanner22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, barisSudah = -1, kolomSudah = -1;
        String nama, next, menu;
        String penonton[][] = new String[4][2];

        do{
        System.out.print("Menu: \n1. Input Data Penonton \n2. Tampilkan Daftar Penoton \n3. Exit\nMasukkan Nomor Menu: ");
        menu = sc.next();
            if(menu.equalsIgnoreCase("1")){
                do {
                    System.out.println("INPUT DATA PENONTON");
                    sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan Baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan Kolom: ");
                    kolom = sc.nextInt();
                    
                    while (barisSudah == baris && kolomSudah == kolom){
                        System.out.println("Kursi tersebut sudah terisi.\nSilahkan pilih kursi lain");
                        System.out.print("Masukkan Baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan Kolom: ");
                        kolom = sc.nextInt();

                    }

                    penonton [baris - 1][kolom - 1] = nama;
                    barisSudah = baris;
                    kolomSudah = kolom;
                    

                    System.out.print("Input Penonton lainnya? (y/n): ");
                    next = sc.next();
                    if (next.equalsIgnoreCase("n")){
                        break;
                    }
                 }while (next.equalsIgnoreCase("y"));
            }else if (menu.equalsIgnoreCase("2")){
                System.out.println("DAFTAR PENONTON");
                for (int i = 0 ; i < penonton.length ; i++){
                    for (int j = 0 ; j < 2 ; j++){ 
                        if (penonton [i][j] == null){
                            penonton[i][j] = "****";
                        }   
                    }
                    System.out.println("Penonton dalam baris ke-" + (i+1) + " : " + String.join(", ", penonton[i]));    
                }

            }
        }while (!(menu.equalsIgnoreCase("3")));
        
    }
    
}
