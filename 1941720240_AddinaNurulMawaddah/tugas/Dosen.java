package tugas;

public class Dosen extends Pegawai{
    public int jumlahSks;
    public int TARIF_SKS = 100000;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }
    
    public void setJumlahSks(int jumlahSks) {
        this.jumlahSks = jumlahSks;
    }
    @Override
    public int getGaji(){
        int gaji = TARIF_SKS *jumlahSks;
        int totalGaji = gaji + super.getGaji();
        return totalGaji;
    }
    
}
