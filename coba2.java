import java.util.Scanner;

public class coba2 {
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     
     int panjang,lebar;
    
     
     System.out.print("masukan panjang");
     panjang=input.nextInt();
     System.out.print("masukan lebar");
     lebar=input.nextInt();

      int luas = (panjang + lebar); 
      System.out.print(luas);
    
     
    }
    
}

