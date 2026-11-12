package mod_3a;
import java.util.Scanner;
public class Tugas_3 {
    public static void main (String args []) {
        Scanner input = new Scanner(System.in);
        String karyawan[][];
        int jumlah;
        
        System.out.println("DATA GAJI KARYAWAN");
        System.out.println("Jumlah Karyawan : ");
        jumlah = Integer.parseInt(input.nextLine());        
        karyawan = new String[jumlah][5];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Karyawan ke -" + (i+1));
            System.out.println("Nama : ");
            karyawan[i][0] = input.nextLine();
            System.out.println("Jabatan : ");
            karyawan[i][1] = input.nextLine();
            System.out.println("Gaji Pokok : ");
            karyawan[i][2] = input.nextLine();
            System.out.println("Tunjangan : ");
            karyawan[i][3] = input.nextLine();
            double total = Double.parseDouble(karyawan[i][2])
                 + Double.parseDouble(karyawan[i][3]);
            karyawan[i][4] = String.valueOf(total);
        }
        
        System.out.println("\nNO.\tNAMA\tJABATAN\tGAPOK\tTUNJANGAN\tTOTAL GAJI");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i+1) + "\t"
            + karyawan[i][0] + "\t"
            + karyawan[i][1] + "\t"
            + karyawan[i][2] + "\t"
            + karyawan[i][3] + "\t");
             System.out.printf("%.0f%n",Double.parseDouble(karyawan[i][4]));           
}
    }
}
