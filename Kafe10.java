import java.util.Scanner;   //import scanner

public class Kafe10 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);     //deklarasi scanner
        boolean keanggotaan;                        //variabel dan tipe data
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100f;


        System.out.print("Masukan keanggotaan (true/false): ");     //kode input
        keanggotaan = input.nextBoolean();
        System.out.print("Masukan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();

        double totalHarga = (jmlKopi * hargaKopi)+(jmlTeh * hargaTeh)+(jmlRoti * hargaRoti);     //kode operasi penentu harga bayar
        double nominalBayar = totalHarga - (diskon * totalHarga);
        byte totalByte = (byte)totalHarga;                              //konversi 
        int nominalInt = (int)nominalBayar;

        System.out.println("Keanggotaan pelanggan "+ keanggotaan);
        System.out.println("Item pembelian " + jmlKopi + " kopi," + jmlTeh + " teh," + jmlRoti + "roti"); //menampilkan program
        System.out.println("Nominal bayar Rp " + nominalInt);
        System.out.println("menampilkan totalHarga " + totalByte);
    }
    
}