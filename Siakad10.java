import java.util.Scanner;                                        //import scanner

public class Siakad10 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);                     //deklarasi scanner

        String nama, nim;                                        //variabel beserta tipe data           
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
    
        System.out.print("Masukan nama: ");                   //kode untuk input data mahasiswa
        nama = sc.nextLine();
        System.out.print("Masukan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukan kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukan nomor absen: ");
        absen = sc.nextByte();
        
        System.out.print("Masukan nilai kuis: ");            //kode input nilai mahasiswa
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukan nilai UAS: ");
        nilaiUAS = sc.nextDouble();

        //kode untuk menghitung nilai akhir(rerata semua nilai)

        nilaiAkhir = nilaiKuis*0.2 + nilaiTugas*0.15 + nilaiUTS*0.3 + nilaiUAS*0.35;             

        //System.out.println("Nama:"+nama+" NIM: "+nim);                       //menampilkan program sesuai contoh
        //System.out.println("Kelas: "+kelas+" Absen: "+absen);
        //System.out.println("Nilai Akhir: "+nilaiAkhir);
    
        System.out.print("Mahasiswa dengan Nama "+nama+" (NIM "+nim+") ");     //menampilkan program sesuai verifikasi percobaan
        System.out.println("Kelas "+kelas+" Absen "+absen);
        System.out.print("Nilai Akhir: "+nilaiAkhir);
    
    }
}