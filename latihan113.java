import java.util.Scanner;

public class latihan113 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
        System.out.print("Bilangan 1 = ");
        int bil1 = input.nextInt();

        System.out.print("Bilangan 2 = ");
        int bil2 = input.nextInt();

        System.out.print("Bilangan 3 = ");
        int bil3 = input.nextInt();

        int terbesar;  

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                terbesar = bil1;
            } else {
                terbesar = bil3;
            }
        } else {
            if (bil2 > bil3) {
                terbesar = bil2;
            } else {
                terbesar = bil3;
            }
        }

        System.out.println("Bilangan terbesar: " + terbesar);
    }
}
