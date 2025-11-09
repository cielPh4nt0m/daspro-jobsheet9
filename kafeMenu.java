import java.util.Scanner;

public class kafeMenu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };

        System.out.println("=== Daftar Menu Kafe ===");
        for (String item : menu) {
            System.out.println("- " + item);
        }

        System.out.print("\nMasukkan nama makanan/minuman yang ingin dicari: ");
        String cari = in.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println(cari + " tersedia di menu kafe.");
        } else {
            System.out.println(cari + " tidak ditemukan di menu kafe.");
        }

        if (ditemukan) {
            System.out.print("\nMasukkan jumlah pesanan: ");
            int n = in.nextInt();
            in.nextLine(); // bersihkan buffer

            String[] nama = new String[n];
            double[] harga = new double[n];
            double total = 0;

            for (int i = 0; i < n; i++) {
                System.out.println("\nPesanan ke-" + (i + 1));
                System.out.print("Nama makanan/minuman: ");
                nama[i] = in.nextLine();
                System.out.print("Harga: ");
                harga[i] = in.nextDouble();
                in.nextLine();
                total += harga[i];
            }

            System.out.println("\n=== Daftar Pesanan Anda ===");
            for (int i = 0; i < n; i++) {
                System.out.println((i + 1) + ". " + nama[i] + " - Rp " + harga[i]);
            }
            System.out.println("Total Biaya: Rp " + total);
        }

        in.close();
    }
}
