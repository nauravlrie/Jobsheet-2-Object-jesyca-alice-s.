public class Matakuliah11 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    public Matakuliah11() {
    }

        public Matakuliah11(String kodeMk, String nama, int sks, int jumlahJam) {
            this.kodeMk = kodeMk;
            this.nama = nama;
            this.sks = sks;
            this.jumlahJam = jumlahJam;
        }

    void tampilkanInformasi () {
        System.out.println("Kode MK: " + kodeMk);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);

    } void ubahSks (int sksBaru ) {
        sks = sksBaru;
    } void tambahJam (int jam) {
        jumlahJam += jam;
    } void kurangiJam (int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
        } else {System.out.println("Jumlah jam tidak dapat dikurangi");

        }
    }

}
