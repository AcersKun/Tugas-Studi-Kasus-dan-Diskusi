# Tugas-Studi-Kasus-dan-Diskusi

# Penjelasan kode File Pembayaran.java: 
**abstract class Pembayaran** berarti class ini menjadi rancangan dasar dan tidak dibuat sebagai objek secara langsung.
**protected double jumlah** menyimpan nilai transaksi agar dapat digunakan oleh class turunannya.
**public Pembayaran(double jumlah)** adalah constructor yang menerima nominal pembayaran.
**public abstract void bayar()** adalah abstract method. Class turunannya wajib menyediakan implementasi metode ini.
**tampilkanJumlah()** merupakan metode biasa yang diwariskan oleh class turunannya.

# Tunai.java
**extends Pembayaran** menerapkan inheritance, yaitu pewarisan dari class induk.
**super(jumlah)** memanggil constructor Pembayaran untuk mengisi nominal transaksi.
**@Override** menandakan bahwa metode **bayar()** mengimplementasikan metode abstrak dari induknya.
Metode **bayar()** menampilkan informasi khusus pembayaran tunai.

# Transfer.java
Class **Transfer** juga mewarisi **Pembayaran**, tetapi implementasi **bayar()** berbeda dari class **Tunai**. Inilah bagian yang menunjukkan bahwa dua objek dapat memiliki perilaku berbeda meskipun menggunakan metode dengan nama yang sama.

# Main.java
Kedua variabel bertipe **Pembayaran**, tetapi objek yang ditampung berbeda. Ketika **bayar()** dipanggil, Java menjalankan implementasi yang sesuai dengan objek sebenarnya. Mekanisme ini disebut polymorphism.
