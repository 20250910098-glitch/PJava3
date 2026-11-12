package mod_3a;
import java.util.Scanner;
public class MOD_3D {
    public static void main (String args []){
        Scanner input = new Scanner (System.in);
        String mahasiswa[][];
        int jumlah;
        System.out.println("DATA NILAI MAHASISWA\nSISTEM "
                + "INFORMASI\nFKOM - UNIKU");
        System.out.println("JUumlah Orang : ");
        jumlah = Integer.parseInt(input.nextLine());
        mahasiswa = new String[jumlah][6];
        for (int i=0; i<jumlah; i++){
            System.out.println(("Data Mahasiswa ke -") + i +1);
            System.out.println("NIM : ");
            mahasiswa[i][0] = input.nextLine();
            System.out.println("NAMA : ");
            mahasiswa[i][1] = input.nextLine();
            System.out.println("NILAI : ");
            mahasiswa[i][2] = input.nextLine();
        }
        System.out.print("\nNo.\tNIM\tNAMA\tNilai\n");
        for (int i = 0; i<jumlah; i++){
            System.out.println((i+1)+"\t" +mahasiswa[i][0] 
            +"\t" + mahasiswa[i][1] +"\t" + mahasiswa[i][2] +"\t");
        }
    }
    
}
