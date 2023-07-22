# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data buku menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa judul dan kode buku, dan memberikan output berupa informasi detail dari kode tersebut seperti tahun terbit, penerbit, jenis buku, dan halaman buku.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Buku`, `BukuDetail`, dan `BukuBeraksi` adalah contoh dari class.

```bash
public class Buku {
    ...
}

public class BukuDetail extends Buku {
    ...
}

public class BukuBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `buku[i] = new BukuDetail(judul, kode);` adalah contoh pembuatan object.

```bash
buku[i] = new BukuDetail(judul, kode);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `judul` dan `kode` adalah contoh atribut.

```bash
String judul;
String kode;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Buku` dan `BukuDetail`.

```bash
public Buku(String judul, String kode) {
    this.judul = judul;
    this.kode = kode;
}

public BukuDetail(String judul, String kode) {
    super(judul, kode);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setJudul` dan `setKode` adalah contoh method mutator.

```bash
public void setJudul(String judul) {
    this.judul = judul;
}

public void setKode(String kode) {
    this.kode = kode;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getJudul`, `getKode`, `getTahunTerbit`, `getPenerbit`, `getJenisBuku`, dan `getHalamanBuku` adalah contoh method accessor.

```bash
public String getJudul() {
    return judul;
}

public String getKode() {
    return kode;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `judul` dan `kode` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String judul;
private String kode;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `BukuDetail` mewarisi `Buku` dengan sintaks `extends`.

```bash
public class BukuDetail extends Buku {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan judul yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Buku` merupakan overloading method `displayInfo` dan `displayInfo` di `BukuDetail` merupakan override dari method `displayInfo` di `Buku`.

```bash
public String displayInfo(String pengarang) {
    return displayInfo() + "\nPengarang: " + pengarang;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getPenerbit` dan seleksi `switch` dalam method `getJenisBuku`.

```bash
public String getPenerbit() {
    if(getKode().substring(2, 4).equals("12")){
        return "PT Gramedia Pustaka Utama";
    } else {
        return "Penerbit lain";
    }

    //return getKode().substring(2, 4).equals("12") ? "PT Gramedia Pustaka Utama" : "Penerbit lain";
}

public String getJenisBuku() {
    switch(getKode().substring(4, 6)) {
        case "34":
            return "Fiksi";
        case "35":
            return "Non Fiksi";
        default:
            return "Jenis Buku lain";
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < buku.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Judul Buku ke-" + (i + 1) + ": ");
String judul = scanner.nextLine();

System.out.println("\nData Buku:");
System.out.println(buku.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `BukuDetail[] buku = new BukuDetail[2];` adalah contoh penggunaan array.

```bash
BukuDetail[] buku = new BukuDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
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

Nama: Cindy Fiora
NPM: 2110010235
