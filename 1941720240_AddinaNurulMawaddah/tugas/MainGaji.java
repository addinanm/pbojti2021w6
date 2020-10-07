package tugas;

public class MainGaji {
    public static void main(String[] args) {
        Pegawai pgw = new Pegawai("13213", "Addina", "Kediri");
        Dosen dsn = new Dosen("1213", "Nurul", "Malang");
        dsn.setJumlahSks(4);
        System.out.println("======================================");
        DaftarGaji dg = new DaftarGaji(2);
        dg.addPegawai(pgw);
        dg.addPegawai(dsn);
        dg.printSemuaGaji();
        System.out.println("======================================");

    }
}
