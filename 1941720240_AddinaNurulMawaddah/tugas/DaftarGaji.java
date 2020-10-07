package tugas;

public class DaftarGaji{
    public Pegawai[] listPegawai;
    public int dataPegawai =0;

    public DaftarGaji(int jumlah) {
        this.listPegawai = new Pegawai[jumlah];
    }
    
    public void addPegawai(Pegawai pegawai){
        this.listPegawai[dataPegawai]=pegawai;
        dataPegawai++;
    }
    public void printSemuaGaji(){
        for (int i = 0; i < this.dataPegawai; i++) {
            System.out.print(" Nama "+listPegawai[i].getNama());
            System.out.println("Jumlah gaji "+listPegawai[i].getGaji());
        }
    }
}
