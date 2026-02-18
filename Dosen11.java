public class Dosen11 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen11 () {
    }
        public Dosen11(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahian) {
            this.idDosen = idDosen;
            this.nama = nama;
            this.statusAktif = statusAktif;
            this.tahunBergabung = tahunBergabung;
            this.bidangKeahlian = bidangKeahian;
        }

void tampilkanInformasi() {
    System.out.println("idDosen: " + idDosen);
    System.out.println("Nama: " + nama);
    System.out.println("Status aktif: " + statusAktif);
    System.out.println("Tahun Bergabung: " + tahunBergabung);
    System.out.println("Bidang Keahlian: " + bidangKeahlian);
}
void setStatus (boolean status) {
    statusAktif = status;
}
void hitungMasaKerja(int tahunskrng) {
    int masaKerja = tahunskrng - tahunBergabung;
    System.out.println("Masa Kerja: " + masaKerja + "Tahun");
}
void ubahKeahlian(String bidang) {
    bidangKeahlian = bidang;
}
    
}
