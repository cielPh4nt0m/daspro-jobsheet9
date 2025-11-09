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

