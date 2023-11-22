import java.util.Scanner;

public class Individu4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2D array untuk menyimpan data atlit
        String cabor[][] = new String[4][5];
        String inputCabor, namaAtlit, konfirmasi, konfirmasi2;

        // Input nama atlit di setiap cabor
        do {
            System.out.print("Cabang Olahraga yang akan di data\n1. Badminton\n2. Tenis meja\n3. Basket\n4. Bola Voli\nMasukkan angka dari daftar CABOR: ");
            inputCabor = sc.nextLine();

            // Input nama atlit untuk badminton
            if (inputCabor.equalsIgnoreCase("1")) {
                for (int i = 0; i < cabor[0].length; i++) {
                    System.out.print("Masukkan NAMA ATLIT ke-" + (i + 1) + " CABOR Badminton: ");
                    namaAtlit = sc.nextLine();
                    cabor[0][i] = namaAtlit;

                    // untuk konfirmasi apakah ingin menambah nama atlit
                    System.out.print("'y' untuk iya 't' untuk tidak\nApakah anda ingin memasukkan NAMA ATLIT LAGI (maksimal 5): ");
                    konfirmasi2 = sc.nextLine();
                    if (konfirmasi2.equalsIgnoreCase("t")) {
                        break;
                    }
                }
            } else if (inputCabor.equalsIgnoreCase("2")) {
                // Input nama atlit untuk tenis meja
                for (int i = 0; i < cabor[1].length; i++) {
                    System.out.print("Masukkan NAMA ATLIT ke-" + (i + 1) + " CABOR Tenis Meja: ");
                    namaAtlit = sc.nextLine();
                    cabor[1][i] = namaAtlit;

                    // untuk konfirmasi apakah ingin menambah nama atlit
                    System.out.print("'y' untuk iya 't' untuk tidak\nApakah anda ingin memasukkan NAMA ATLIT LAGI (maksimal 5): ");
                    konfirmasi2 = sc.nextLine();
                    if (konfirmasi2.equalsIgnoreCase("t")) {
                        break;
                    }
                }
            } else if (inputCabor.equalsIgnoreCase("3")) {
                // Input nama atlit untuk basket
                for (int i = 0; i < cabor[2].length; i++) {
                    System.out.print("Masukkan NAMA ATLIT ke-" + (i + 1) + " CABOR Basket: ");
                    namaAtlit = sc.nextLine();
                    cabor[2][i] = namaAtlit;

                    // untuk konfirmasi apakah ingin menambah nama atlit
                    System.out.print("'y' untuk iya 't' untuk tidak\nApakah anda ingin memasukkan NAMA ATLIT LAGI (maksimal 5): ");
                    konfirmasi2 = sc.nextLine();
                    if (konfirmasi2.equalsIgnoreCase("t")) {
                        break;
                    }
                }
            } else if (inputCabor.equalsIgnoreCase("4")) {
                // Input nama atlit untuk bola voli
                for (int i = 0; i < cabor[3].length; i++) {
                    System.out.print("Masukkan NAMA ATLIT ke-" + (i + 1) + " CABOR Bola Voli: ");
                    namaAtlit = sc.nextLine();
                    cabor[3][i] = namaAtlit;

                    // untuk konfirmasi apakah ingin menambah nama atlit
                    System.out.print("'y' untuk iya 't' untuk tidak\nApakah anda ingin memasukkan NAMA ATLIT LAGI (maksimal 5): ");
                    konfirmasi2 = sc.nextLine();
                    if (konfirmasi2.equalsIgnoreCase("t")) {
                        break;
                    }
                }
            }

            // untuk konfirmasi apakah ingin menambah nama atlit untuk cabang olahraga lain
            System.out.print("'y' untuk iya dan 't' untuk tidak\nApakah anda ingin input NAMA ATLIT dari CABOR lain?: ");
            konfirmasi = sc.nextLine();
        } while (konfirmasi.equalsIgnoreCase("y"));

        sc.close();

        // Memenuhi slot yang kosong dengan "kosong"
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < cabor[i].length; j++) {
                if (cabor[i][j] == null) {
                    cabor[i][j] = "\"kosong\"";
                }
            }
        }

        // menampilkan nama atlit di setiap cabor
        System.out.println("Nama-Nama Atlit:");
        System.out.println("Cabor Badminton:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + cabor[0][i]);
        }
        System.out.println();
        System.out.println("Cabor Tenis Meja:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + cabor[1][i]);
        }
        System.out.println();
        System.out.println("Cabor Basket:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + cabor[2][i]);
        }
        System.out.println();
        System.out.println("Cabor Bola Voli:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + cabor[3][i]);
        }
    }
}
