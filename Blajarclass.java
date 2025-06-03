import java.util.Scanner;

class makanan {
    String nama;
    int harga;

    makanan(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    void tampilkanMenu() {
        System.out.println(nama + " : " + harga + "k");
    }
}


class minuman {
    String nama;
    int harga;

    minuman(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    void tampilkanMenu() {
        System.out.println(nama + " : " + harga + "k");
    }
}

public class Blajarclass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        makanan[]daftarmakanan = {
         new makanan("Nasi Goreng", 10),
         new makanan("Ketoprak", 7),
         new makanan("Kwetiaw", 10),
         new makanan("Mie Goreng", 10),
         new makanan("Siomay", 6),

        };

        minuman[]daftarminuman ={
            new minuman("Es Teh", 3),
            new minuman("Es Jeruk", 3),
            new minuman("Teh Tawar", 2),
            new minuman("Juice", 8),
            new minuman("Kopi", 3)

        };

        System.out.println("============================");
        System.out.println("WARUNG 'JAVA'");
        System.out.println("============================");
        System.out.println("MENU MAKANAN");
        for(makanan m : daftarmakanan) {
            m.tampilkanMenu();
        }

        System.out.println("============================");
        System.out.println("MENU MINUMAN");
        for (minuman m : daftarminuman) {
            m.tampilkanMenu();
        }

        }
    }
    

