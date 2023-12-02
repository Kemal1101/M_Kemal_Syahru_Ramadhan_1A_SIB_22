public class Tugas4 {
    static int fibonacci(int i) {
        if (i <= 1) {
            return i;
        }else if (i == 1 || i == 2){
            return 1;
        } 
        else {
            return fibonacci(i - 1) + fibonacci(i - 2);
        }
    }


    public static void main(String[] args) {
        int i = 12;
        for (int j = 1; j <= i; j++) {
            System.out.println("--------------");
            System.out.println("Bulan ke-" + j);
            int pasanganProduktif, pasanganBlmProduktif;
            System.out.println("--------------");
            if (j > 1){
                pasanganProduktif = fibonacci(j-2);
                pasanganBlmProduktif = fibonacci(j-1);
            }else {
                pasanganBlmProduktif = 1;
                pasanganProduktif = 0;
            }
            System.out.println("Jumlah Pasangan Produktif: " + pasanganProduktif);
            System.out.println("Jumlah Pasangan Belum Produktif: " + pasanganBlmProduktif);
            System.out.println("Jumlah Pasangan: " + fibonacci(j));
        }
    }
}
