import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int no = 1, totalPendapatan = 0;
        String ulang = "Y";

        System.out.println("Daftar Buah:\nAg: Anggur\nJr: Jeruk\nMg: Mangga");
        System.out.println("-------------------------------------------------");

        while (ulang.equalsIgnoreCase("Y")) {
            System.out.print("\nKode Buah : ");
            String kode = in.next();
            System.out.print("Jml Beli  : ");
            int jmlBeli = in.nextInt();

            String namaBuah = "";
            int harga = 0;

            switch (kode.toLowerCase()) {
                case "ag":
                    namaBuah = "Anggur";
                    harga = 15000;
                    break;
                case "jr":
                    namaBuah = "Jeruk";
                    harga = 10000;
                    break;
                case "mg":
                    namaBuah = "Mangga";
                    harga = 12000;
                    break;
                default:
                    System.out.println("Kode buah tidak ditemukan!");
                    continue;
            }

            int bayar = harga * jmlBeli;
            totalPendapatan += bayar;

            System.out.println("\nNo  Kode Buah  Nama Buah  Harga/Kg  Jml Beli  Bayar");
            System.out.println("----------------------------------------------------");
            System.out.printf("%-3d %-11s %-10s %-9d %-9d %d\n", no, kode.toUpperCase(), namaBuah, harga, jmlBeli, bayar);
            System.out.println("----------------------------------------------------");
            
            // Total pendapatan ditampilkan di sini, sebelum pertanyaan ulang
            System.out.println("Total pendapatan: " + totalPendapatan);

            no++;
            System.out.print("\nAda data lagi [Y/T]? ");
            ulang = in.next();
        }

        System.out.println("\nTerima kasih sudah berbelanja.");
    }
}