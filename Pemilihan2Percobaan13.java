import java.util.Scanner;

public class Pemilihan2Percobaan13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        int tahun;

        System.out.print("Masukkan Tahun : ");
        tahun = input13.nextInt();

        if ((tahun % 400) == 0) {
            System.out.println("Tahun Kabisat");
        } else {
            if ((tahun % 100) == 0) {
                System.out.println("Bukan Tahun Kabisat");
            } else {
                if ((tahun % 4) == 0) {
                    System.out.println("Tahun Kabisat");
                } else {
                    System.out.println("Bukan Tahun Kabisat");
                }
            }
        }
    }
}