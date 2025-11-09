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
