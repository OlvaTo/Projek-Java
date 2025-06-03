import java.util.Scanner;

public class Test {
    
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    int Angka;
    int angka;
    int Kali;
    int Tambah;
    float Bagi;
    int Kurang;


    System.out.print("Masukan angka pertama: ");
    Angka = input.nextInt();

    System.out.print("Masukan angka kedua: ");
    angka = input.nextInt();

    Kali = Angka * angka;
    Tambah = Angka + angka;
    Bagi = Angka / angka;
    Kurang = Angka - angka;

    System.out.println("");
    System.out.println("Hasil");
    System.out.println("Hasil Kali :" + Kali);
    System.out.println("Hasil Bagi :" + Bagi);
    System.out.println("Hasil Tambah :" + Tambah);
    System.out.println("Hasil Kurang : "  + Kurang);


    
    

    }
}
