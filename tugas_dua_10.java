import java.util.Scanner;           //import scanner

public class tugas_dua_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);     //deklarasi scanner

        int jamKerja;           //variabel
        double upahKerja;

        System.out.print("jam kerja karyawan: ");       //kode input
        jamKerja=input.nextInt();
        System.out.print("upah per jam karyawan: Rp.");
        upahKerja=input.nextDouble();

        double gajiKerja = jamKerja*upahKerja;                          //kode operasi hitung
        double bonus = gajiKerja * 0.1,pajak = gajiKerja * 0.05;
        //int konversi = (int)gajiKerja;
        //int konversi2 = (int)bonus;
        //int konversi3 = (int)pajak;

        //System.out.println("bonus karyawan: Rp."+bonus);
        //System.out.println("pajak karyawan: Rp."+pajak);


        System.out.print("total gaji karyawan: Rp." + (gajiKerja+bonus-pajak));      //menampilkan hasil

        
    }


}
