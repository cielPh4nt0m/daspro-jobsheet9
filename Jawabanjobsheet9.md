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





	
    



   

   





