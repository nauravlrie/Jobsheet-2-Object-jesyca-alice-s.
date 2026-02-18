public class MataKuliahMain11 {
    public static void main(String[] args) {
        Matakuliah11 mk1 = new Matakuliah11();
        mk1.kodeMk = "KWN";
        mk1.nama = "Kewarganegaraan";
        mk1.sks = 4;
        mk1.jumlahJam = 2;

        mk1.tampilkanInformasi();
        mk1.ubahSks(3);
        mk1.tambahJam(1);
        mk1.kurangiJam(2);
        mk1.tampilkanInformasi();

        Matakuliah11 mk2 = new Matakuliah11("PSI", "Pengantar Sistem Informasi", 3, 4);
        mk2.kurangiJam(1);
        mk2.tampilkanInformasi();

    }
}
