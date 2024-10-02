import java.util.Scanner;

public class latihan213 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        String jenisBuku = input.nextLine().toLowerCase();

        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = input.nextInt();

        double diskon = 0.0;  

        if (jenisBuku.equals("kamus")) {
            diskon = 10.0;  
            if (jumlahBuku > 2) {
                diskon += 2.0;
            }
        } else if (jenisBuku.equals("novel")) {
            diskon = 7.0;  
            if (jumlahBuku > 3) {
                diskon += 2.0;  
            } else if (jumlahBuku <= 3) {
                diskon += 1.0;  
            }
        } else if (jenisBuku.equals("lainnya") && jumlahBuku > 3) {
            diskon = 5.0;  
        }

        System.out.println("Diskon yang diberikan: " + diskon + "%");
    }
}


