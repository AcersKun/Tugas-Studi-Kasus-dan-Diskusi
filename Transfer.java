public class Transfer extends Pembayaran {

    public Transfer(double jumlah) {
        super(jumlah);
    }

    @Override
    public void bayar() {
        System.out.println(
            "Pembayaran melalui transfer bank berhasil."
        );
        tampilkanJumlah();
    }
}
