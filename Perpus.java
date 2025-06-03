import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Perpus {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    
        String[] Judul = new String[10];
        String[] Pengarang = new String[10];
        String[] Penerbit = new String[10];
        String [] Kategori = new String[10];
        int[] Jumlah  = new int[10];
        String[] Rak = new String[10];
        String[] ISBN = new String[10];
        String[] Kode = new String[10];
        int[] Nilai = new int[10];
        String jenis;
        int harga;
        

        

        int i = 0;



        System.out.println("");
        System.out.println("===========================");
        System.out.print("JUDUL BUKU: ");
        Judul[i] = input.nextLine();
        System.out.print("KATEGORI: ");
        Kategori[i] = input.nextLine();
        System.out.print("PENGARANG: ");
        Pengarang[i] = input.nextLine();
        System.out.print("PENERBIT: ");
        Penerbit[i]  = input.nextLine();
        System.out.print("ISBN[YA/TIDAK]: ");
        ISBN[i] = input.nextLine();         
        System.out.print("JML BUKU: ");
        Jumlah[i]  = input.nextInt();
        System.out.print("TEMPAT BUKU: ");
        Rak[i]  = input.next();
        System.out.println("===========================");
        System.out.println("");

     
    
      Kode[i] = Judul[i].substring(0,1)  +  Judul[i].substring(Judul[i].length()-1,Judul[i].length()) + "-" + Pengarang[i].substring(0,1) + Pengarang[i].substring(Pengarang[i].length()-1,Pengarang[i].length()) + "-" + Penerbit[i].substring(0,1) + Penerbit[i].substring(Penerbit[i].length()-1, Penerbit[i].length()) + ISBN ;
      


        if (ISBN[i].equalsIgnoreCase("YA")) {
            ISBN[i] = "YA";

        } else if (ISBN[i].equalsIgnoreCase("TIDAK")) {
        ISBN[i] = "None";
        
        }

        if (Kategori[i].equalsIgnoreCase("000")) {
            jenis = "informatika,Komputer,informasi umum";
            harga = 90000;          
        } else if (Kategori[i].equalsIgnoreCase("200")) {
            jenis = "Agama-agama di dunia,islam,kristen,hindu,buddha";
            harga = 75000;          
        }  else if (Kategori[i].equalsIgnoreCase("800")) {
            jenis = "Sastra";
            harga = 70000;
        } else 
        System.out.println("Kategori Tak Ada");
        input.close();


        if (Rak[i].equalsIgnoreCase("Rak 1")) {
            Kode[i] = "R1";  

        } else if (Rak[i].equalsIgnoreCase("Rak 2")) {
            Kode[i] = "R2";    

        }  else if (Rak[i].equalsIgnoreCase("Rak 3")) {
            Kode[i] = "R3";    

        }

       
      for (i = 0; i >= 10; i++)

   
      System.out.println("");
      System.out.println("DATA PERPUSTAKAAN");
      System.out.println("");
      System.out.println("No\tJudul Buku\tPengarang\tPenerbit\tISBN\tRak Buku\tKode Buku\tJumlah\tNilai Buku");
      System.out.println("=================================================================================");
      System.out.println( i + 1 + "\t" + Judul[i] + "\t\t" + Pengarang[i] + "\t\t" + Penerbit[i] + "\t" + ISBN[i] + "\t" + Rak[i] + "\t" + Kode[i] + "\t" + Jumlah[i] + "\t" + Nilai[i] );

        


      }
        
    }

