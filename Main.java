public class Main {
    public static void main(String[] args) {

        Pembayaran pembayaran1 = new Tunai(50000);
        Pembayaran pembayaran2 = new Transfer(75000);

        System.out.println("=== Transaksi 1 ===");
        pembayaran1.bayar();

        System.out.println();

        System.out.println("=== Transaksi 2 ===");
        pembayaran2.bayar();
    }
}
