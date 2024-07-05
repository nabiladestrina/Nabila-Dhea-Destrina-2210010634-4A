package pbo;

public class PenerbanganDomestik extends Pesawat {
    private String kotaAsal;
    private String kotaTujuan;

    // Constructor untuk inisialisasi penerbangan domestik
    public PenerbanganDomestik(String maskapai, String nomorPenerbangan, String kotaAsal, String kotaTujuan) {
        super(maskapai, nomorPenerbangan);
        this.kotaAsal = kotaAsal;
        this.kotaTujuan = kotaTujuan;
    }

    // Getter untuk kota asal
    public String getKotaAsal() {
        return kotaAsal;
    }

    // Setter untuk kota asal
    public void setKotaAsal(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    // Getter untuk kota tujuan
    public String getKotaTujuan() {
        return kotaTujuan;
    }

    // Setter untuk kota tujuan
    public void setKotaTujuan(String kotaTujuan) {
        this.kotaTujuan = kotaTujuan;
    }

    @Override
    public String toString() {
        return super.toString() + " - Dari: " + kotaAsal + " ke " + kotaTujuan;
    }
}