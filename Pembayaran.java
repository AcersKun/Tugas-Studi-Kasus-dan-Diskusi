public abstract class Pembayaran {
    protected double jumlah;

    public Pembayaran(double jumlah) {
        this.jumlah = jumlah;
    }

    public abstract void bayar();

    public void tampilkanJumlah() {
        System.out.println("Jumlah pembayaran: Rp" + jumlah);
    }
}
