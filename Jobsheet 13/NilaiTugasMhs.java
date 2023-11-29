import java.util.Scanner;

public class NilaiTugasMhs {

    static int[][] inputNilaiMhs(int mhs, int minggu, String nama []) {
        Scanner sc = new Scanner(System.in);
        int nilaiMhs[][] = new int[mhs][minggu]; 
        for(int i = 0 ; i < nilaiMhs.length ; i++){
            System.out.println("-----------------");
            System.out.println(nama [i]);
            System.out.println("-----------------");
            for (int j = 0 ; j < nilaiMhs[i].length ; j++){
                System.out.print("Masukkan nilai minggu ke-" + (j+1) + " : ");
                nilaiMhs[i][j] = sc.nextInt();
            }
        }
        return nilaiMhs;
    }

    static String [] nama (int jmlMhs){
        Scanner sc = new Scanner(System.in);
        String nama [] = new String[jmlMhs];
        for (int i = 0 ; i < nama.length ; i++ ){
            System.out.print("Masukkan Nama Mahasiswa ke-" + (i+1) + " : ");
            nama [i] = sc.nextLine();
        }
        return nama;
    }

    static void Tampilan(int [][] nilaiMhs, int jmlMhs, String nama []){
        for (int i = 0 ; i < nilaiMhs.length ; i++){ 
            System.out.println("-------------------");
            System.out.println(nama [i]);
            System.out.println("-------------------");
            for (int j = 0 ; j < nilaiMhs[i].length ; j++){
                System.out.println("Nilai Minggu ke-" + (j+1) + " : " + nilaiMhs[i][j]);
            }
        }
    }

    static void cariNilaiMhsTertinggi(int [][] nilaiMhs, int jmlMhs, String nama []){
        int mingguKe = -1;
        String Mhske = " ";
        int nilaiTertinggi = nilaiMhs[0][0];
        for (int i = 0 ; i < nilaiMhs.length ; i++){
            for (int j = 0 ; j < nilaiMhs[i].length ; j++){
                if (nilaiTertinggi < nilaiMhs[i][j]){
                    nilaiTertinggi = nilaiMhs[i][j];
                    mingguKe = j + 1;
                    Mhske = nama[i];
                }
            }
        }System.out.println("--------------------------------------------------------");
        System.out.println("Mahasiswa yang meraih nilai tertinggi adalah " + Mhske 
        + "\ndengan perolehan nilai: " + nilaiTertinggi + "\npada minggu ke-" + mingguKe );
        System.out.println("--------------------------------------------------------");
    }
    static int[] cariHariNilaiTertinggi(int[][] nilaiMhs) {
        int nilaiMax = 0;
        int dayMax = -1;
        for(int i = 0 ; i < nilaiMhs[0].length ; i++){
            int sum = 0;
            for (int j = 0 ; j < nilaiMhs.length ; j++){
                sum += nilaiMhs[j][i] ;
                if (nilaiMax < sum){
                    nilaiMax = sum;
                    dayMax = i + 1;
                }
            }
        }
        int semua[] = {dayMax, nilaiMax};
        return semua;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jmlMhs = sc.nextInt();
        System.out.print("Masukkan Jumlah Minggu: ");
        int jmlMinggu = sc.nextInt();
        String namanama [] = nama(jmlMhs);
        int nilaiMhs [][] = inputNilaiMhs(jmlMhs, jmlMinggu, namanama);
 
        Tampilan(nilaiMhs,jmlMhs,namanama);

        int [] hasil = cariHariNilaiTertinggi(nilaiMhs);
        int minggu = hasil[0];
        int totalnilaiTertinggi = hasil [1];
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("Minggu ke-" + minggu + " adalah minggu dengan nilai tertinggi dari keseluruhan mahasiswa dengan total nilai: " + totalnilaiTertinggi);
        System.out.println("--------------------------------------------------------------------------------------------------------------");

        cariNilaiMhsTertinggi(nilaiMhs,jmlMhs, namanama);
    }
    
}
