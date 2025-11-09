import java.util.Scanner;

    public class KafeOrder {
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int n = in.nextInt();
        in.nextLine(); 

        String[] nama = new String[n];
        double[] harga = new double[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Pesanan ke-" + (i + 1));
            System.out.print("Nama makanan/minuman: ");
            nama[i] = in.nextLine();
            System.out.print("Harga: ");
            harga[i] = in.nextDouble();
            in.nextLine();
            total += harga[i];
        }

        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + nama[i] + " - Rp " + harga[i]);
        }

        System.out.println("Total Biaya: Rp " + total);

        in.close();
    }
}
