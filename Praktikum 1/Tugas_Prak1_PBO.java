import java.util.Scanner;

public class Tugas_Prak1_PBO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga, jumlah, total = 0;
        int potongan;

        System.out.print ("Masukkan Harga Barang : Rp ");
        harga = input.nextInt();
        System.out.print ("Jumlah Barang : ");
        jumlah = input.nextInt();
        total = harga*jumlah;
        System.out.println("Total Bayar : Rp "+ total);
        potongan = (total - ((total*15)/100));

        if(total >= 200000){
        System.out.println("Total Bayar (Diskon 15%) : Rp "+ potongan);
        }else if(total <= 200000 ){
        
        System.out.println("Mohon maaf saat ini belum ada diskon");
       }
    }
}