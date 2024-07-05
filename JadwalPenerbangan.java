/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.util.ArrayList;
import java.util.List;

public class JadwalPenerbangan {
    private final List<Pesawat> daftarPenerbangan;

    // Constructor
    public JadwalPenerbangan() {
        this.daftarPenerbangan = new ArrayList<>();
    }

    // Method untuk menambah penerbangan ke dalam jadwal
    public void tambahPenerbangan(Pesawat penerbangan) {
        daftarPenerbangan.add(penerbangan);
    }

    // Method untuk menampilkan jadwal penerbangan
    public void tampilkanJadwal() {
        if (daftarPenerbangan.isEmpty()) {
            System.out.println("Tidak ada penerbangan.");
        } else {
            System.out.println("Jadwal Penerbangan:");
            for (Pesawat penerbangan : daftarPenerbangan) {
                System.out.println(penerbangan);
            }
        }
    }

    // Getter untuk daftar penerbangan
    public List<Pesawat> getDaftarPenerbangan() {
        return daftarPenerbangan;
    }
}

