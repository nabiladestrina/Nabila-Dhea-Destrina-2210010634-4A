package pbo;

//class
public class Pesawat {
    //atribut dan encapsulation
    private String maskapai;
    private String nomorPenerbangan;

     // Constructor untuk inisialisasi pesawat
    public Pesawat(String maskapai, String nomorPenerbangan) {
        this.maskapai = maskapai;
        this.nomorPenerbangan = nomorPenerbangan;
    }

    Pesawat(String garuda_Indonesia, String gA123, String banjarmasin, String surabaya) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Getter untuk maskapai
    public String getMaskapai() {
        return maskapai;
    }

    // Setter untuk maskapai
    public void setMaskapai(String maskapai) {
        this.maskapai = maskapai;
    }

    // Getter untuk nomor penerbangan
    public String getNomorPenerbangan() {
        return nomorPenerbangan;
    }

    // Setter untuk nomor penerbangan
    public void setNomorPenerbangan(String nomorPenerbangan) {
        this.nomorPenerbangan = nomorPenerbangan;
    }

    @Override
    public String toString() {
        return maskapai + " - Nomor Penerbangan: " + nomorPenerbangan;
    }
}