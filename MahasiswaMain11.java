public class MahasiswaMain11 {
    public static void main(String[] args) {
        Mahasiswa11 mhs1 = new Mahasiswa11 ();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = " SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhs1.nilaiKinerja());

        Mahasiswa11 mhs2 = new Mahasiswa11(" Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhs2.nilaiKinerja());

        Mahasiswa11 mhs = new Mahasiswa11("Jesyca Alice", "254107060081", 3.90, "SIB 1A");
        mhs.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhs.nilaiKinerja());

    }
}
