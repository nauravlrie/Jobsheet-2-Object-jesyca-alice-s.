public class DosenMain11 {
    public static void main(String[] args) {
        Dosen11 ds1 = new Dosen11();
        ds1.idDosen = "55555";
        ds1.nama = "Rohadi Eko S";
        ds1.statusAktif = true;
        ds1.tahunBergabung = 2010;
        ds1.bidangKeahlian = "Sosiologi";

        ds1.tampilkanInformasi();
        ds1.setStatus(true);
        ds1.hitungMasaKerja(2025);
        ds1.ubahKeahlian("Psikologi");

        Dosen11 ds2 = new Dosen11("44444", "Naningsih", true, 2020, "Bisnis");
        ds2.tampilkanInformasi();

    }
    
}
