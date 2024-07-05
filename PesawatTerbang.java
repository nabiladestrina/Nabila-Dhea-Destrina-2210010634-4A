/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PesawatTerbang {
    public static void main(String[] args) {
        List<Pesawat> daftarPesawat = new ArrayList<>();
        daftarPesawat.add(new Pesawat("Garuda Indonesia", "GA123"));
        daftarPesawat.add(new Pesawat("Lion Air", "JT456"));
        daftarPesawat.add(new PenerbanganDomestik("AirAsia", "QZ789", "Jakarta", "Bali"));

        JadwalPenerbangan jadwal = new JadwalPenerbangan();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Daftar Pesawat:");
            for (int i = 0; i < daftarPesawat.size(); i++) {
                System.out.println((i + 1) + ". " + daftarPesawat.get(i));
            }

            System.out.println("Masukkan nomor pesawat untuk menambah ke jadwal (atau ketik '0' untuk selesai):");
            int pilihan;
            try {
                pilihan = Integer.parseInt(scanner.nextLine());
                if (pilihan == 0) {
                    break;
                } else if (pilihan > 0 && pilihan <= daftarPesawat.size()) {
                    jadwal.tambahPenerbangan(daftarPesawat.get(pilihan - 1));
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid, masukkan angka.");
            }
        }

        jadwal.tampilkanJadwal();
    }
}

