
import java.util.Scanner;

public class latihan313 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String merk, kategori;
        int ukuran, harga = 0;

        System.out.print("Masukkan merk sepatu (Converse/Sketcher/Nike): ");
        merk = input.nextLine();

        System.out.print("Masukkan kategori sepatu (Slip on/High top/Woman/Man/Kids/Adult): ");
        kategori = input.nextLine();

        System.out.print("Masukkan ukuran sepatu: ");
        ukuran = input.nextInt();

       
        if (merk.equalsIgnoreCase("Converse")) {
            
            if (kategori.equalsIgnoreCase("Slip on")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 800000;
                    }
                }
            }
            if (kategori.equalsIgnoreCase("High top")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1200000;
                    }
                }
            }
         
            if (harga == 0) {
                System.out.println("Kategori atau ukuran tidak valid untuk Converse.");
            }
        } else if (merk.equalsIgnoreCase("Sketcher")) {
            
            if (kategori.equalsIgnoreCase("Woman")) {
                if (ukuran == 41) {
                    harga = 1000000;
                }
            }
            if (kategori.equalsIgnoreCase("Man")) {
                if (ukuran >= 41) {
                    if (ukuran <= 44) {
                        harga = 1800000;
                    }
                }
            }
            
            if (harga == 0) {
                System.out.println("Kategori atau ukuran tidak valid untuk Sketcher.");
            }
        } else if (merk.equalsIgnoreCase("Nike")) {
        
            if (kategori.equalsIgnoreCase("Kids")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 750000;
                    }
                }
            }
            if (kategori.equalsIgnoreCase("Adult")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1500000;
                    }
                }
            }
            
            if (harga == 0) {
                System.out.println("Kategori atau ukuran tidak valid untuk Nike.");
            }
        } else {
            System.out.println("Merk sepatu tidak valid.");
        }

        
        if (harga > 0) {
            System.out.println("Harga sepatu adalah: Rp " + harga);
        }
    }
}