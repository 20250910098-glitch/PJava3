package mod_3a;
import java.util.Scanner;
public class POST_Test_3 {
    public static void main (String args[]){
        Scanner input = new Scanner (System.in);
        String mahasiswa[][];
        int jumlah;
        System.out.println("DATA NILAI MAHASISWA\nSISTEM "
                + "INFORMASI\nFKOM - UNIKU");
        System.out.println("Jumlah Siswa : ");
        jumlah = Integer.parseInt(input.nextLine());
        mahasiswa = new String[jumlah][6];
        for (int i=0; i<jumlah; i++){
            System.out.println(("Data Mahasiswa ke -") + (i+1));
            System.out.println("NIM : ");
            mahasiswa[i][0] = input.nextLine();
            System.out.println("NAMA : ");
            mahasiswa[i][1] = input.nextLine();
            System.out.println("NILAI Tugas : ");
            mahasiswa[i][2] = input.nextLine();
            System.out.println("NILAI UTS : ");
            mahasiswa[i][3] = input.nextLine();
            System.out.println("NILAI UAS : ");
            mahasiswa[i][4] = input.nextLine();
            
            double rata= (Double.parseDouble(mahasiswa[i][2])
                        + Double.parseDouble(mahasiswa[i][3])
                        + Double.parseDouble(mahasiswa[i][4]))/3;
            mahasiswa[i][5] = String.valueOf(rata);
                    
        }
        System.out.print("\nNo.\tNIM\tNAMA\tTugas\tUTS\tUAS\tRata-Ratan\n");
        for (int i = 0; i<jumlah; i++){
            System.out.print((i+1)+"\t" +mahasiswa[i][0] 
            +"\t" + mahasiswa[i][1] +"\t" + mahasiswa[i][2] +"\t"+mahasiswa[i][3]+"\t"
            +mahasiswa[i][4] +"\t");
            System.out.printf("%.2f%n", Double.parseDouble(mahasiswa[i][5]));
        }
    }
    
}
