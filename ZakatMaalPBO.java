import java.util.Scanner;

public class ZakatMaalPBO {

    public static void main(String[] args) {
        // Membuat scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);
        String pilihan;

        // Perulangan untuk mengulangi proses input dan perhitungan zakat
        do {
            // Meminta pengguna memasukkan jumlah harta dalam bentuk desimal
            System.out.print("Masukkan jumlah harta (uang) yang dimiliki: ");
            double harta = scanner.nextDouble();

            // Mengecek apakah jumlah harta memenuhi nisab (misal, nisab 85 gram emas, setara Rp85.000.000)
            double nisab = 85000000;  // Nisab zakat maal berdasarkan harga emas (sesuaikan dengan kondisi)
            if (harta >= nisab) {
                // Menghitung zakat maal (2.5% dari total harta)
                double zakat = harta * 0.025;
                // Menampilkan jumlah zakat yang harus dibayarkan
                System.out.printf("Jumlah zakat yang harus dibayarkan: Rp %.2f%n", zakat);
            } else {
                // Jika harta kurang dari nisab, tidak wajib zakat
                System.out.println("Jumlah harta belum mencapai nisab, tidak wajib zakat.");
            }

            // Meminta pengguna apakah ingin menghitung lagi
            System.out.print("Apakah Anda ingin menghitung lagi? (y/n): ");
            pilihan = scanner.next();

        } while (pilihan.equalsIgnoreCase("y"));

        // Menutup scanner
        scanner.close();
        System.out.println("Program selesai.");
    }
}
