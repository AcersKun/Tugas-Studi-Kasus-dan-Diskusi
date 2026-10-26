import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEM PEMBAYARAN ===");
        System.out.println("Pilih metode pembayaran:");
        System.out.println("1. Tunai");
        System.out.println("2. Transfer Bank");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = scanner.nextInt();

        System.out.print("Masukkan jumlah pembayaran: Rp");
        double jumlah = scanner.nextDouble();

        Pembayaran pembayaran = null;

        if (pilihan == 1) {
            pembayaran = new Tunai(jumlah);
        } else if (pilihan == 2) {
            pembayaran = new Transfer(jumlah);
        } else {
            System.out.println("Pilihan tidak valid!");
            scanner.close();
            return;
        }

        System.out.println("\n=== DETAIL TRANSAKSI ===");
        pembayaran.bayar();

        scanner.close();
    }
}