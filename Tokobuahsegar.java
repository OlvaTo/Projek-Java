import java.util.Scanner;

public class Tokobuahsegar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] kode = new String[3];
        String[] namabuah = new String[3];
        int[] hargaperkg = new int[3];
        int[] jumlah = new int[3];
        int[] bayar = new int[3];
        int[] diskon = new int[3];
        int[] totalbayar = new int[3];
        int[] UkuranBuah = new int[3];
        int[] UkuranHarga = new int[3];
       
        String masukan;
        int i = 0;

 do {
        System.out.println("Daftar Nama Buah:");
        System.out.println("Ag-A : Anggur");
        System.out.println("Jr-B : Jeruk");
        System.out.println("Mg-C : Mangga");  
        System.out.print("Masukkan kode buah yang diinginkan: ");
        kode[i] = input.next();
        kode[i].substring(0, 4);String ukuranKode = kode[i].substring(3).toUpperCase();


        System.out.print("Ingin berapa kg: ");
        jumlah[i] = input.nextInt();          
        
     
    
        if (kode[i].equalsIgnoreCase("Ag-A")) {
            namabuah[i] = "Anggur";
            hargaperkg[i] = 72000;
        } else if (kode[i].equalsIgnoreCase("Jr-B")) {
            namabuah[i] = "Jeruk";
            hargaperkg[i] = 40000;
        } else if (kode[i].equalsIgnoreCase("Mg-C")) {
            namabuah[i] = "Mangga";
            hargaperkg[i] = 30000;
        } else {
            System.out.println("Kode buah tidak ada");
            return;
        }


        if (ukuranKode.equalsIgnoreCase("A")) {
            UkuranBuah[i]= (10 * hargaperkg[i])/100;
        } else if (ukuranKode.equalsIgnoreCase("B")) {
            UkuranBuah[i]= (5 * hargaperkg[i])/100;
        } else if (ukuranKode.equals("C")) {
            UkuranBuah[i] = (2 * hargaperkg[i]) / 100;
        } else {
            System.out.println("Ukuran buah tidak valid.");
    return;
}

        UkuranHarga[i] = UkuranBuah[i] * jumlah[i];


        bayar[i] = hargaperkg[i] * jumlah[i];

           
        if (bayar[i] >= 300000) {
                diskon[i] = (2 * bayar[i]) / 100 ;
            } else if (bayar[1] >= 500000) {;
                diskon[i] = (3 * bayar[i])/ 100;
            } else if (bayar[1] >= 1000000) {;
                diskon[i] = (2 * bayar[i])/ 100;
            } else System.out.println("Tidak Ada Diskon");

            totalbayar[i] = bayar[i] - diskon[i] - UkuranHarga[i];
 
               i++;

        System.out.print("Ada data lagi [Y/T]? ");
        masukan = input.next();
         

        } while (masukan.equalsIgnoreCase("Y") && i < 3);
          
         
        System.err.println();
        System.out.println("TOKO BUAH 'SEGAR'");
        System.out.println();
        System.out.println("No.\tKode Buah\tNama Buah\tUkuranHarga\tHarga/kg\tJml. Beli\tBayar\tDiskon\tT.bayar");
        System.out.println("=============================================================================");
        int j; 
        for (j = 0; j < i; j++) {
        System.out.println(j + 1 + "\t" + kode[j] + "\t\t" + namabuah[j]  + "\t\t" + UkuranBuah[j] + "\t\t" + hargaperkg[j] + "\t\t" +
                           jumlah[j] + "\t\t" + bayar[j] + "\t" + diskon[j] + "\t"+ totalbayar[j]);
        System.out.println("=============================================================================");
        
}
   }


}

