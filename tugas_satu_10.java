import java.util.Scanner;      //import scanner

public class tugas_satu_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);     //deklarasi scanner

        double totalkWh,hargaKwh = 1500.0;                         //variabel 
        
        System.out.print("Konsumsi listrik dalam kWh: ");      //kode untuk input
        totalkWh = input.nextDouble();

        boolean batas = totalkWh > 500;                 //cek status batas

        double totalTagihan = totalkWh*hargaKwh;                 //kode operasi penentu tagihan
    
        //int konversi = (int) totalTagihan;
        
        System.out.print("apakah melebihi 500 kWh: " + batas);              //menampilkan program
        System.out.println("tagihan listrik anda: Rp." + totalTagihan);    
        



        
    }
}
