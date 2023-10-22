import java.util.Scanner;
public class Kemal_UTS{
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner (System.in);

    int potensiAkademik, bahasaInggris, wawancara, jumlahMahasiswa,siswaKe = 0, i = 1, jumlahLolosatauTdk = 0, ratarata = 0, angkaJurusanDipilih = 0;
    float nilaiAkhir;
    String jurusan;
    
    System.out.print("Masukkan Jumlah Calon Mahasiwa: ");
    jumlahMahasiswa = sc.nextInt();
    
    String namaMahasiswa [] = new String[jumlahMahasiswa];
    String lolosatauTidak [] = new String[jumlahMahasiswa]; 
    String jurusanDiPilih [] = new String[jumlahMahasiswa];
    Float NilaiAkhir [] = new Float[jumlahMahasiswa];
    
    while (i <= jumlahMahasiswa){
    System.out.print("MASUKKAN NAMA MAHASISWA: ");
    namaMahasiswa [siswaKe] = sc.next();
    siswaKe++;
    System.out.print("Masukkan Nilai Potensi Akademik (0-100): ");
    potensiAkademik = sc.nextInt();
    System.out.print("Masukkan Nilai Tes Bahasa Inggris (0-100): ");
    bahasaInggris = sc.nextInt();
    System.out.print("Masukkan Nilai Wawancara (0-100): ");
    wawancara = sc.nextInt();
    nilaiAkhir = (potensiAkademik * 0.5F) + (bahasaInggris * 0.3F) + (wawancara * 0.2F);
     
    NilaiAkhir [ratarata] = nilaiAkhir;
    ratarata++;

    System.out.print("1. Sistem Informasi\n2. Ilmu Komputer\n3. Bisnis Manajemen\n4. Teknik Informatika\nMasukkan Angka dari Jurusan yang Anda Daftar: ");
    jurusan = sc.next();
    if (jurusan.equalsIgnoreCase("1")){
        jurusanDiPilih [angkaJurusanDipilih] = "Sistem Informasi";
        angkaJurusanDipilih++;
        if(bahasaInggris >= 70 && wawancara > 80){
             lolosatauTidak [jumlahLolosatauTdk] = "MAHASISWA LOLOS";
            jumlahLolosatauTdk++;
        }else{
             lolosatauTidak [jumlahLolosatauTdk] = "MAHASISWA TIDAK LOLOS";
           jumlahLolosatauTdk++;
        }
    }else if (jurusan.equalsIgnoreCase("2")){
        jurusanDiPilih [angkaJurusanDipilih] = "Ilmu Komputer";
        angkaJurusanDipilih++;
        if((potensiAkademik > 70 && bahasaInggris > 70 && wawancara > 70) || potensiAkademik == 100 || bahasaInggris == 100 || wawancara == 100){
             lolosatauTidak [jumlahLolosatauTdk] = "MAHASISWA LOLOS";
           jumlahLolosatauTdk++;
        }else {
             lolosatauTidak [jumlahLolosatauTdk] = "MAHASISWA TIDAK LOLOS";
            jumlahLolosatauTdk++;
        }
    }else if (jurusan.equalsIgnoreCase("3")) {
        jurusanDiPilih [angkaJurusanDipilih] = "Bisnis Manajemen";
        angkaJurusanDipilih++;
        if (nilaiAkhir >= 75 && bahasaInggris >= 50){
            lolosatauTidak [jumlahLolosatauTdk] = "MAHASISWA LOLOS";
            jumlahLolosatauTdk++;
        }else{
            lolosatauTidak [jumlahLolosatauTdk] = "MAHASISWA TIDAK LOLOS";
           jumlahLolosatauTdk++;
        }
    }else if (jurusan.equalsIgnoreCase("4")){
        jurusanDiPilih [angkaJurusanDipilih] = "Teknik Informatika";
        angkaJurusanDipilih++;
        if ((potensiAkademik >= 60 && bahasaInggris >= 60 && wawancara >= 60) || (potensiAkademik == 100 && bahasaInggris == 100) ){
             lolosatauTidak [jumlahLolosatauTdk] = "MAHASISWA LOLOS";
           jumlahLolosatauTdk++;
        }else{
             lolosatauTidak [jumlahLolosatauTdk] = "MAHASISWA TIDAK LOLOS";
            jumlahLolosatauTdk++;
        }
    }else{
        System.out.println("Input eror");
    }
    i++;
}
System.out.println("PENGUMUMAN HASIL");
System.out.println("---------------------");
int j = 0, k = 1, l = 0, m = 0, n = 0;
while (j < jumlahMahasiswa){
    System.out.println(k + "." + " " + namaMahasiswa[j]);
    j++; 
    k++;
    while (l < j){
        System.out.println("Jurusan yang Dipilih: " + jurusanDiPilih[l]);
        l++;
    }
    while (m < j){
        System.out.println(lolosatauTidak[m]);
        m++;
    }while (n < j){
        System.out.println("Nilai Akhir Mahasiswa: " + NilaiAkhir [n]);
        n++;
    }
   
    
}


    }   
}