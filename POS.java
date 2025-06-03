import java.util.Scanner;

public class POS {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String[] Snack = new String[10];
        String[] Minuman = new String[10];
        String[] Rokok = new String[10];
        String[] Skincare = new String[10];
        String [] Kategori = new String[10];
        int i = 1;


        System.out.println("");
        System.out.println("Toko 'Alfada'");
        System.out.println("===========================");
        System.out.println("A. Skincare");
        System.out.println("B. Snack");
        System.out.println("C. Minuman");
        System.out.println("D. Rokok");
        System.out.println("===========================");
       

       System.out.print("Input Daftar Yang Diinginkan [A/B/C/D] = ");
       Kategori[i] = input.next();
       Kategori[i].substring(0);


       
       if (Kategori[i].equalsIgnoreCase("A")) {
        System.out.println("");
        System.out.println("A. Skincare");
        System.out.println("===========================");
        System.out.println("1. FaceWash G2K 250ml");
        System.out.println("2. Miccelar Mukalogy 300ml");
        System.out.println("3. Sunscreen Dermi 20g");
        System.out.println("4. Tonner War ah 440ml");
        System.out.println("===========================");
        System.out.print("Ingin Skincare Apa?: ");
        input.next();

       } else if (Kategori[i].equalsIgnoreCase("B")) {
        System.out.println("");
        System.out.println("B. Snack");
        System.out.println("===========================");
        System.out.println("1. Ciki Komo");
        System.out.println("2. Chitata");
        System.out.println("3. Alays");
        System.out.println("4. Ciki balls");
        System.out.println("==========================="); 
        System.out.print("Mau Snack apa?: ");
        input.next();

       } else if (Kategori[i].equalsIgnoreCase("C")) {
        System.out.println("");
        System.out.println("C. Minuman");
        System.out.println("===========================");
        System.out.println("1. Cprit 500ml");
        System.out.println("2. Fante 400ml");
        System.out.println("3. Aqwa 1,5L");
        System.out.println("4. Goldi 250ml");
        System.out.println("==========================="); 
        System.out.print("Mau Minuman apa?: ");
        input.next();

       } else if (Kategori[i].equalsIgnoreCase("D")) {
        System.out.println("");
        System.out.println("D. Rokok");
        System.out.println("===========================");
        System.out.println("1. Samson");
        System.out.println("2. Dion Jambu");
        System.out.println("3. Bagus");
        System.out.println("4. Sempurna");
        System.out.println("===========================");
        System.out.print("Mau Rokok apa?: ");
        input.next();
       
       } else
        System.out.println("PILIHAN TAK ADA!");
        input.close();



    }



    }
