import java.util.Scanner;

public class Dowhile {
    
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
String[] Mahasiswa = new String[10];
int [] NIM = new int[10];
String[] Reg = new String[10];

int i = 1;

System.out.print("Input Nama Mahasiswa : ");
Mahasiswa[i] = input.next();

System.out.print("Masukan NIM : ");
NIM[i] = input.nextInt(); 

System.out.print("Masukan Reg : ");
Reg [i] = input.next();


 for (i = 1; i >= 10; i++)

System.out.println("");
System.out.println("======================================");
System.out.println("No\tNama\t Nim\t Shift Reg");
System.out.println("======================================");
System.out.println(i +"\t" + Mahasiswa[i] + "\t" + NIM[i] + "\t" + Reg[i]);
System.out.println("======================================");


}
}
