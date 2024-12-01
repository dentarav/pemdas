import java.util.Scanner;

public class pencatatpengeluaran {
	private static String[] jenis = {"Konsumsi", "Perjalanan", "Kesehatan", "Hiburan", "Lain-Lain"};
	private static double[] pengeluaran = new double[jenis.length];
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pilih;

		do {
			System.out.println("====================");
			System.out.println("    CleverSpend     ");
			System.out.println("====================");
			System.out.println("1. Tambah Pengeluaran");
			System.out.println("2. Tampilkan Rincian Pengeluaran");
			System.out.println("3. Hapus Pengeluaran");
			System.out.println("4. Tampilkan Total Pengeluaran");
			System.out.println("5. Keluar");
			System.out.print("Pilih opsi: ");
			pilih = input.nextInt();

			if (pilih == 1) {
				tambahPengeluaran(input);
			} else if (pilih == 2) {
				tampilkanPengeluaran();
			} else if (pilih == 3) {
				hapusPengeluaran(input);
			} else if (pilih == 4) {
				tampilkanTotalPengeluaran();
			} else if (pilih == 5) {
				System.out.println("Terima kasih telah menggunakan CleverSpend!");
			} else {
				System.out.println("Pilihan tidak valid, silakan coba lagi.");
			}

		} while (pilih != 5);

		input.close();
	}

	private static void tambahPengeluaran(Scanner input) {
		System.out.println("\nPilih jenis pengeluaran:");
		for (int i = 0; i < jenis.length; i++) {
			System.out.println((i + 1)  + ". " + jenis[i]);
		}
		System.out.print("Masukkan nomor jenis (1-" + jenis.length + "): ");
		int pilihanjenis = input.nextInt() - 1;

		if (pilihanjenis >= 0 && pilihanjenis < jenis.length) {
			System.out.print("Masukkan jumlah pengeluaran: ");
			double jumlah = input.nextDouble();
			pengeluaran[pilihanjenis] += jumlah;
			System.out.println("Pengeluaran berhasil ditambahkan.");
		} else {
			System.out.println("Pilihan jenis tidak valid.");
		}
	}

	private static void tampilkanPengeluaran() {
		System.out.println("\n=== Rincian Pengeluaran ===");
		double totalPengeluaran = 0;
		for (int i = 0; i < jenis.length; i++) {
			System.out.printf("%s: Rp%.2f%n", jenis[i], pengeluaran[i]);
			totalPengeluaran += pengeluaran[i];
		}
		System.out.printf("Total Pengeluaran: Rp%.2f%n", totalPengeluaran);
	}

	private static void hapusPengeluaran(Scanner input) {
		System.out.println("\n=== Hapus Pengeluaran ===");
		System.out.println("1. Hapus pada jenis tertentu");
		System.out.println("2. Hapus semua pengeluaran");
		System.out.print("Pilih opsi: ");
		int opsi = input.nextInt();

		if (opsi == 1) {
			System.out.println("\nPilih jenis pengeluaran yang ingin dihapus:");
			for (int i = 0; i < jenis.length; i++) {
				System.out.println((i + 1) + ". " + jenis[i]);
			}
			System.out.print("Masukkan nomor jenis (1-" + jenis.length + "): ");
			int pilihanjenis = input.nextInt() - 1;
			if (pilihanjenis >= 0 && pilihanjenis < jenis.length) {
				pengeluaran[pilihanjenis] = 0;
				System.out.println("Pengeluaran untuk jenis " + jenis[pilihanjenis] + " berhasil dihapus.\n");
			} else {
				System.out.println("Pilihan tidak valid.\n");
			}
		} else if (opsi == 2) {
			for (int i = 0; i < pengeluaran.length; i++) {
				pengeluaran[i] = 0;
			}
			System.out.println("Semua pengeluaran berhasil dihapus.\n");
		} else {
			System.out.println("Pilihan tidak valid.\n");
		}
	}

	private static void tampilkanTotalPengeluaran() {
		double total = 0;
		for (double jumlah : pengeluaran) {
			total += jumlah;
		}
		System.out.printf("\nTotal Pengeluaran: Rp%.2f%n", total);
	}
}


