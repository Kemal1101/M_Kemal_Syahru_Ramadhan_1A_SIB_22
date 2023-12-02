public class nyobaak {
    public static void main(String[] args) {
        int i = 11;
        int a = 0;
        int b = 1;
        int jumlah = 0;
        for (int j = 0 ; j <= i ; j++){
            System.out.print(a + " ");
            jumlah = a + b;
            a = b;
            b = jumlah;
             
        }
    }
}
