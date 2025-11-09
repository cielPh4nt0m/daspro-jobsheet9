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
