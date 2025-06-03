import java.util.Scanner;

public class UTS {

    private static final String Gelombang = null;

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);


        String [] Lokasi = new String[10];
        String[] Gelombang = new String[10];
        String[] Kode = new String[10];
        String[] Add = new String[10];
        String[] Nama = new String[10];
        int[] NilaiUn = new int[10];
        int[] Matematika = new int[10];
        int[] TesUmum = new int [10];
        int [] Bing = new int [10];

        int i = 1;

        System.out.println("MENU PILIHAN");
        System.out.println("===========================");
        System.out.println("A. TAMBAH DATA PESERTA");
        System.out.println("B. TAMPIL DATA");
        System.out.println("C. CARI DATA");
        System.out.println("D. KELUAR");
        System.out.println("===========================");
        System.out.print("PILIH MENU [A/D]");
        Add[i] = input.next();
        Add[i].substring(0);

        if (Add[i].equalsIgnoreCase("A")) {
            System.out.println("");
            System.out.print("Kode Peserta : ");
            Kode[i] =  input.next(); 
            System.out.print("Nama Peserta : ");
             Nama[i] = input.next(); 
            System.out.print("Nilai UN : ");
             NilaiUn[i] = input.nextInt();
            System.out.print("Nilai Matematika : ");
             Matematika[i] = input.nextInt();
            System.out.print("Nilai B.Inggris : ");
             Bing[i] = input.nextInt();
            System.out.print("Nilai Tes Umum : ");
             TesUmum[i] = input.nextInt();
              


        } else if (Add[i].equalsIgnoreCase("B")) {
            System.out.println("");
            System.out.println("Data Penerimaan Mahasiswa");
            System.out.println("UNPAM-SCHOOL");
            System.out.println("====================================================================");
            System.out.println("Kode\tNama\tNilai\tPeriode\tLokasi\tNilai Rata2\tKeterangan\tGrade");
            System.out.println("Peserta\tPeserta\tUN\t\tTes\tSiswa\t");
            System.out.println("====================================================================");
       
         } else if (Add[i].equalsIgnoreCase("D"));
        System.out.println("Terimakasih");
        input.close(); 



        String kodeGelombang = Kode[i].substring(0, 2); // G1

         if (kodeGelombang.equalsIgnoreCase("G1")) {
            Gelombang[i] = "Gelombang 1";
         } else if (kodeGelombang.equalsIgnoreCase("G2")) {
            Gelombang[i] = "Gelombang 2";
         }  else if (kodeGelombang.equalsIgnoreCase("G3")) {
            Gelombang[i] = "Gelombang 3";
         } else 
           input.close();


         String kodeLokasi = Kode[i].substring(2, 4); // L2

         if (kodeLokasi.equalsIgnoreCase("L1")) {
            Lokasi[i] = "Unpam Pusat";
         } else if (kodeLokasi.equalsIgnoreCase("L2")) {
            Lokasi[i] = "Kampus Viktor";
         }  else if (kodeLokasi.equalsIgnoreCase("L3")) {
            Lokasi[i] = "Kampus Witana";
         } else 
           input.close();
          
          

         int Nilai = 75;
         String[] Grade = new String[10];
         int [] Rerata = new int[10];
            
         
         
         if (Nilai >= 84 ) {
            Grade[i] = "C";
         } else if (Nilai >= 94 ) {
            Grade[i] = "B";
         } else if (Nilai >= 100) {
            Grade[i] = "A";
         } else 
            Grade[i] = "D";
      

        Rerata[i] = (Matematika[i] + Bing[i] + TesUmum [i]) / 3; 

          System.out.println();
System.out.println("Data Penerimaan Mahasiswa");
System.out.println("UNPAM-SCHOOL");
System.out.println("============================================================================================");
System.out.printf("%-10s %-10s %-8s %-15s %-20s %-15s %-12s %-6s\n",
    "Kode", "Nama", "Nilai UN", "Periode", "Lokasi", "Nilai Rata2", "Keterangan", "Grade");
System.out.println("============================================================================================");
System.out.printf("%-10s %-10s %-8d %-15s %-20s %-15d %-12s %-6s\n",
    Kode[i], Nama[i], NilaiUn[i], Gelombang[i], Lokasi[i], Rerata[i], "-", Grade[i]);

        


       
    
}

}
