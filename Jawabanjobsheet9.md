## JOBSHEET 9 ARRAY 1

### Nama : Fadila Mayamasita

### NIM : 254107020012

### Kelas : 1C_TI

## Percobaan 1 : Mengisi Elemen Array

1. Jika isi masing-masinng elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000 . Apa yang terjadi ? Mengapa bisa demikian ?

   Jawaban :

   Yang terjadi adalah error dan terjadi kesalahan, karena Array bil pada kode di atas dideklarasikan sebagai array bertipe int, yang artinya setiap elemen dalam array hanya dapat menampung nilai dengan tipe int.

2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array.

   Jawaban :

<img width="457" height="354" alt="Screenshot 2025-11-04 142252" src="https://github.com/user-attachments/assets/1571d091-b2e8-4694-8377-0f92ecfb7226" />

Hasilnya tetap sama 

<img width="64" height="157" alt="Screenshot 2025-11-04 142344" src="https://github.com/user-attachments/assets/c1ecd4f1-d64e-41ed-9cb8-36e774d16df4" />

3. Ubah statement pada langkah no.4 menjadi seperti berikut :

   <img width="481" height="116" alt="image" src="https://github.com/user-attachments/assets/34130082-d9c5-463c-9edd-0743ea0f50f2" />

 Apa keluaran dari program? Jelaskan maksud dari statement tersebut. 

   Jawaban :

   Ini adalah perulangan for yang akan berjalan sebnyakan 4x dimulai dari 1=0 sampai 1=3 karena syaratnya i<4, statement tersebut berfungsi menampilkan semua element array bil dari idndeks 0 hingga 3 
   ```
    import java.util.Scanner;
       public class ArrayBilangan13 {
       public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] bil = new int [4];
        bil [0] = 5;
        bil [1] = 13;
        bil [2] = -7;
        bil [3] = 17;

      for (int i = 0; i < 4; i++) {
        System.out.println(bil[i]);
      }
    }
}

hasilnya :
5
13
-7
17

```
4.	Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran dari program? Mengapa demikian?

Jawaban : 

Jika kondisi di ubah menjadi i<=4 maka program akan menghasilkan (ArrayIndexOutOfBoundsException).

Alasannya : Array bil cuma punya dari indeks 0 - 3, tetapi ketika i=4 program mencoba mekakses bil [4] yang tidak ada.

## Percobaan 2 :Studi Kasus Nilai Mahasiswa di SIAKAD - Meminta Inputan Pengguna untuk Mengisi Elemen Array Waktu 

1.	Ubah statement pada langkah nomor 5 menjadi seperti berikut ini:

    <img width="808" height="116" alt="image" src="https://github.com/user-attachments/assets/26c10c7a-dbf0-478e-844a-f61d2e2d0d49" />

 Jalankan program. Apakah terjadi perubahan? Mengapa demikian? 

 Jawaban : 

 tidak terjadi perubahan, karena mencetak nilaiAkhir sebagai sebuah array, bukan elemen spesifik dari array. Sehingga, yang dicetak bukan nilai yang diinput, melainkan alamat memori atau representasi default dari array, seperti [I@1db9742.

2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ?

   Jawaban :

   i < nilaiAkhir.length adalah kondisi pada loop yang dimana menentukan pengulangan harus berhenti dan memastilan pegulangan berjalan dari indeks 0 sampai indeks akhir.

3.  Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai > 70):

<img width="783" height="150" alt="image" src="https://github.com/user-attachments/assets/14f6a158-5b10-4570-b441-80be8ef8b8ac" />

Jawaban : 

Membuat tempat penyimpanan nilai

Program menyiapkan array untuk 10 mahasiswa agar setiap nilai bisa disimpan.

Meminta input nilai

Program meminta pengguna memasukkan nilai akhir tiap mahasiswa satu per satu.

Menentukan kelulusan

Program memeriksa setiap nilai:

Jika nilai > 70, mahasiswa dianggap lulus.

Jika nilai ≤ 70, mahasiswa dianggap gagal.

Menampilkan hasil

Program menulis ke layar apakah mahasiswa lulus atau gagal sesuai nilainya.

Singkatnya:
Program membaca nilai → memeriksa lulus/gagal → menampilkan hasil untuk tiap mahasiswa.

4.	Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan nilai, yaitu dengan menampilkan status mana mahasiswa yang lulus dan tidak lulus, seperti ilustrasi output berikut:

<img width="420" height="537" alt="image" src="https://github.com/user-attachments/assets/019f7efb-2600-40bc-9686-01894e47dec3" />

Jawaban : 
```
import java.util.Scanner;

   public class ArrayNilai13 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int [] nilaiAkhir = new int [10];

      for (int i = 0; i <nilaiAkhir.length; i++) {
         System.out.print("Masukkan nilai Akhir ke-"+i+" : ");
         nilaiAkhir[i] = sc.nextInt();
          
      }
      
      for (int i = 0; i < nilaiAkhir.length; i++) {
         if (nilaiAkhir[i] > 70){
             System.out.println("Mahasiswa ke-"+i+" lulus!");
         } else {
            System.out.println("Mahasiswa ke-"+i+" tidak lulus!");
         }
         
          
      }
    }
   }
```
Hasilnya : 

<img width="882" height="591" alt="Screenshot 2025-11-08 144846" src="https://github.com/user-attachments/assets/03be9edf-0823-42bd-9403-ac034983097f" />

##  Percobaan 3: Studi Kasus Nilai Mahasiswa di SIAKAD - Melakukan Operasi Aritmatika terhadap Elemen Array

1. Modifikasi kode program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) agar program dapat menampilkan banyaknya mahasiswa yang lulus, yaitu mahasiswa yang memiliki lebih besar dari 70 (>70).

Jawaban
```
import java.util.Scanner;

 public class ArrayRataNilai13 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int [] nilaiMhs= new int[10];
     double total = 0;
     double rata2;
     int jumlahLulus = 0;

     for (int i = 0; i < nilaiMhs.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
        nilaiMhs[i] =  sc.nextInt();       
     }
     for (int i = 0; i < nilaiMhs.length; i++) {
         total += nilaiMhs[i];
         if (nilaiMhs[i] > 70) {
            jumlahLulus++;
         }
     }

     rata2 = total/nilaiMhs.length;
     System.out.println("Rata-rata nilai = "+rata2);
     System.out.println("Banyaknya mahasiswa yang lulus (>70) = " + jumlahLulus);
    }
 }
```
Hasilnya : 

<img width="645" height="417" alt="Screenshot 2025-11-08 153520" src="https://github.com/user-attachments/assets/3748f524-5cd2-4f9d-a244-e868ac72ce14" />

Modifikasi program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) sehingga program menerima jumlah elemen berdasarkan input dari pengguna dan mengeluarkan output seperti berikut ini:

<img width="476" height="223" alt="image" src="https://github.com/user attachments/assets/a6abc14f-a283-4a84-a579-b9f715237cd0" />

Jawaban : 
```
import java.util.Scanner;

public class ArrayRataNilai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[5]; 
        int totalLulus = 0;
        int jumlahLulus = 0;
        int totalTidakLulus = 0;
        int jumlahTidakLulus = 0;

       
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

       
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }

        
        if (jumlahLulus > 0) {
            double rataLulus = (double) totalLulus / jumlahLulus;
            System.out.println("Rata-rata nilai mahasiswa yang lulus (>70) = " + rataLulus);
        } else {
            System.out.println("Tidak ada mahasiswa yang lulus.");
        }

        if (jumlahTidakLulus > 0) {
            double rataTidakLulus = (double) totalTidakLulus / jumlahTidakLulus;
            System.out.println("Rata-rata nilai mahasiswa yang tidak lulus (<=70) = " + rataTidakLulus);
        } else {
            System.out.println("Semua mahasiswa lulus, tidak ada yang tidak lulus.");
        }
    }
}
```

Hasilnya : 

<img width="546" height="214" alt="Screenshot 2025-11-08 154814" src="https://github.com/user-attachments/assets/1e40203d-d163-400b-9ff4-79a55d93d75b" />

## Percobaan 4: Searching

1.  Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4 di atas. 

   Jawaban : break digunakan untuk menghentikan perulangan for segera setelah nilai yang di cari yaitu key ditemukan, kejadian ini membuat program menjadi efisien karena tidak memeriksa array yang tersisa dan memastikan indeks pertama dari  nilai yang ditemukan yang disimpan 

2. Modifikasi kode program pada percobaan 4 di atas sehingga program dapat menerima input berupa banyaknya elemen array nilai, isi array, dan sebuah nilai (key) yang ingin dicari. Lalu cetak ke layar indeks posisi elemen dari nilai (key) yang dicari.

Jawaban : 

```
import java.util.Scanner;

public class SearchNilai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int n = sc.nextInt();
        int[] arrNilai = new int[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        
        int posisi = -1; 
        for (int i = 0; i < arrNilai.length; i++) {
            if (arrNilai[i] == key) {
                posisi = i;
                break;
            }
        }

        System.out.println();
        if (posisi != -1) {          
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (posisi+1));
        } 
    }
}
```
3. Modifikasi program pada percobaan 4 di atas, sehingga program akan memberikan pesan "Nilai yang dicari tidak ditemukan" jika nilai yang dicari (key) tidak ada di dalam array.

 Jawaban : 
 ```
import java.util.Scanner;

public class SearchNilai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int n = sc.nextInt();

        int[] arrNilai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        int posisi = -1;
        for (int i = 0; i < n; i++) {
            if (arrNilai[i] == key) {
                posisi = i;
                break;
            }
        }

        System.out.println();
        if (posisi != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (posisi+1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
}
```

## TUGAS :

1.  Anda diminta untuk membuat program yang dapat menyimpan dan mengelola nilai mahasiswa. Nilai berupa bilangan bulat. Program harus menyediakan fitur untuk: memasukkan banyaknya nilai mahasiswa yang akan diinput, memasukkan setiap nilai mahasiswa, menghitung nilai rata-rata, menampilkan nilai tertinggi daN nilai terendah, serta  menampilkan semua nilai yang telah dimasukkan.

Jawaban : 
```
import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        int[] nilai = new int[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        int total = 0;
        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            total += nilai[i];
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
        }

        double rataRata = (double) total / jumlahMahasiswa;

        System.out.println("\n=== Hasil Nilai Mahasiswa ===");
        System.out.print("Semua nilai: ");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print(nilai[i] + " ");
        }
        System.out.println("\nNilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.printf("Nilai rata-rata: %.2f\n", rataRata);

        input.close();
    }
}
```
Hasilnya : 

<img width="325" height="394" alt="image" src="https://github.com/user-attachments/assets/d39482c5-9a0d-4c4c-b82a-d3cb0d488e25" />

2. Buat program yang dapat mengelola pemesanan makanan dan minuman di sebuah kafe.Program akan memungkinkan pengguna untuk memasukkan pesanan, menghitung total biaya pesanan, dan menampilkan daftar pesanan yang telah dibuat.
   
Input:  

o jumlah pesanan (input dari pengguna). 

o nama makanan/minuman dan harga untuk masing-masing pesanan (input dari pengguna) 

Proses: 

o simpan data pesanan dalam array satu dimensi untuk nama pesanan; dan array satu dimensi terpisah untuk harga. 


o hitung total biaya dari semua pesanan yang dimasukkan. 

o tampilkan daftar pesanan yang telah dimasukkan bersama dengan total biaya.

Output:

o daftar pesanan dan total biaya dari semua pesanan.

Jawaban :
















	
    



   

   





