import java.util.Scanner;

public class Gaji {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] karyawan = new String[3];
        String[] jabatan = new String[3];
        int[] gaji = new int[3];
        int[] bonus = new int[3];
        int[] targetlulus = new int[3];
        int i = 0;
        int[] totalgaji = new int[3];
        int[] gapok = new int[3];


        System.out.println("");
        System.out.println("List Nama Karyawan");
        System.out.println("=========================================");
        System.out.println( "Lida    : HRD");
        System.out.println( "Rizky   : MANAGER");
        System.out.println( "prabowo : KACUNG" );
        System.out.println("fufufafa : KACUNG" );
        System.out.println("=========================================");
        System.out.print("Input Nama Kamu: ");
        karyawan[i] = input.next();

        if (karyawan[i].equalsIgnoreCase("Lida")) {
            gapok[i] = 4000000; 
            jabatan[i] = "HRD";

        } else if (karyawan[i].equalsIgnoreCase("Rizky")) {
            gapok[i] = 10000000;
            jabatan[i] = "MANAGER";

        } else if (karyawan[i].equalsIgnoreCase("prabowo")) {
             gapok[i] = 10000;
            jabatan[i] = "KACUNG";

        }  else if (karyawan[i].equalsIgnoreCase("fufufafa")) {
             gapok[i] = 10000;
            jabatan[i] = "KACUNG";
        } 

        System.out.print("berapa target kamu yang lulus: ");
        targetlulus[i] = input.nextInt();

       
        bonus[i] = (int) (gaji[i] * targetlulus[i]);

        if (targetlulus[i] >= 3) {
            bonus[i] = 1000000;  
        } else if (bonus[i] >= 5 ) {
           bonus[i] = 1500000;
        } else if (bonus[i] >= 10 ) {
           bonus[i] = 2000000;
        } else
        System.out.println("Ga ada lembur balik kerja kontol!");

        totalgaji[i]= (int) (gapok[i] + bonus[i]);

        System.out.println("PT. KAMU AKU MAU");
        System.out.println("=====================================");
        System.out.println("Nama Karyawan :" + karyawan[i]);
        System.out.println("Jabatan       :" + jabatan[i]);
        System.out.println("Gaji          :" + gapok[i]);
        System.err.println("Target        :" + targetlulus[i]);
        System.err.println("Bonus         :" + bonus[i]);
        System.out.println("=====================================");
        System.err.println("TOTAL GAJI    :" + totalgaji[i]);
        
       

    }
}