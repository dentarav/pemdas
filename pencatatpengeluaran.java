import java.util.Scanner;

public class pencatatpengeluaran {
    public static String[] jenis = {"Konsumsi", "Perjalanan", "Kesehatan", "Hiburan"};
    public static double[] pengeluaran = new double[jenis.length]; 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("=== Aplikasi Pencatatan Pengeluaran Harian ===");
            System.out.println("1. Tambah Pengeluaran");
            System.out.println("2. Tampilkan Rincian Pengeluaran");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            pilih = input.nextInt();
            if (pilih == 1) {
                tambahPengeluaran(input);
            } else if (pilih == 2) {
                tampilkanPengeluaran();
            } else if (pilih == 3) {
                System.out.println("Terima kasih telah menggunakan aplikasi ini!");
            } else {
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }

        } while (pilih != 3);

        input.close();
