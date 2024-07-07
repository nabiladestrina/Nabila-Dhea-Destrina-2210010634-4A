# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi penerbangan domestik menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa maskapai dan nomor penerbangan, dan memberikan output berupa informasi detail dari nomor penerbangan tersebut seperti kota asal, kota tujuan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Pesawat`, `PenerbanganDomestik`, dan `JadwalPenerbangan`,`PesawatTerbang` adalah contoh dari class.

```bash
public class Pesawat {
    ...
}

public class PenerbanganDomestik extends Pesawat {
    ...
}

public class JadwalPenerbangan {
    ...
}

public class PesawatTerbang {
    ...
}

```

2. **Object** adalah instance dari class. Pada kode ini, `mhs[i] = new MahasiswaDetail(nama, npm);` adalah contoh pembuatan object.

```bash
mhs[i] = new PenerbanganDomestik(maskapai, nomorPenerbangan);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `maskapai`,`nomorPenerbangan`,`kotaasal` dan `kotatujuan` adalah contoh atribut.

```bash
String maskapai;
String nomorPenerbangan;
String kotasal;
String kotatujuan;
```

4. **Constructor** adalah method untuk menginisialisasikan objek. Pada kode ini, constructor ada di dalam class `Pesawat` dan `PenerbanganDomestik`,`JadwalPenerbangan`.

```bash
public Pesawat(String maskapai, String nomorPenerbangan) {
    this.nama = maskapai;
    this.npm = nomorPenerbangan;
}

public PenerbanganDomestik(String kotaasal, String kotatujuan) {
    super(maskapai, nomorPenerbangan);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNpm` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setNpm(String npm) {
    this.npm = npm;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getMaskapai`, `getNomorPenerbangan`, `getKotaAsal`, `getKotaTujuan`, dan `getProdi` adalah contoh method accessor.

```bash
public String getMaskapai() {
    return Maskapai;
}

public String getNomorPenerbangan() {
    return NomorPenerbangan;
}
public String getKotaAsal() {
    return KotaAsal;
}
public String getKotaAsal() {
    return KotaTujuan;
}

```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `maskapai`,`nomorPenerbangan`,`kotaAsal` dan `kotaTujuan` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String maskapai;
private String nomorPenerbangan;
private String kotaAsal;
private String kotaTujuan;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PenerbanganDomistik` mewarisi `Pesawat` dengan sintaks `extends`.

```bash
public class PenerbanganDomistik extends Pesawat {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Pesawat` merupakan overloading method `displayInfo` dan `displayInfo` di `PenerbanganDomistik` merupakan override dari method `displayInfo` di `Pesawat`.

```bash
public String displayInfo(String kelas) {
    return displayInfo() + "\nKelas: " + kelas;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `gettambahPenerbangan` dan seleksi `switch` dalam method `gettampilkanJadwal`.

```bash
public String getFakultas() {
    if(getNpm().substring(2, 4).equals("10")){
        return "Teknologi Informasi";
    } else {
        return "Fakultas lain";
    }

    //return getNpm().substring(2, 4).equals("10") ? "Teknologi Informasi" : "Fakultas lain";
}

public String getProdi() {
    switch(getNpm().substring(4, 6)) {
        case "01":
            return "Teknik Informatika";
        case "02":
            return "Sistem Informasi";
        default:
            return "Prodi lain";
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < mahasiswas.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.println("Daftar Pesawat:");
for (int i = 0; i < daftarPesawat.size(); i++) {
                System.out.println((i + 1) + ". " + daftarPesawat.get(i));
            }

            System.out.println("Masukkan nomor pesawat untuk menambah ke jadwal (atau ketik '0' untuk selesai):");
            int pilihan;
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `List<Pesawat> untuk menyimpan daftar pesawat` adalah contoh penggunaan array.

```bash
List<Pesawat> daftarPesawat = new ArrayList<>();
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
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
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Nabila Dhea Desrina
NPM: 2210010634
