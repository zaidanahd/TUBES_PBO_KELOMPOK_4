import java.util.Scanner;

public class LoginRentalKendaraan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Data akun rental kendaraan
        String[][] akun = {
                {"admin123", "admin000", "ADMIN"},
                {"staff123", "staff000", "STAFF"},
                {"owner123", "owner000", "OWNER"}
        };

        int percobaan = 0;
        boolean loginBerhasil = false;

        System.out.println("================================================");
        System.out.println("      SELAMAT DATANG DI RENTAL KENDARAAN");
        System.out.println("================================================");

        while (percobaan < 3 && !loginBerhasil) {

            System.out.print("Username : > ");
            String username = input.nextLine();

            System.out.print("Password : > ");
            String password = input.nextLine();

            // Mengecek username dan password
            for (int i = 0; i < akun.length; i++) {

                if (username.equals(akun[i][0]) &&
                    password.equals(akun[i][1])) {

                    System.out.println("\n[SUKSES] Login berhasil sebagai "
                            + akun[i][2] + ".");
                    System.out.println("Tekan ENTER untuk masuk ke Dashboard...");
                    input.nextLine();

                    loginBerhasil = true;

                    // ================= DASHBOARD =================

                    // DASHBOARD ADMIN
                    if (akun[i][2].equals("ADMIN")) {

                        int pilihan;

                        do {
                            System.out.println("\n========================================");
                            System.out.println("           DASHBOARD - ADMIN");
                            System.out.println("========================================");
                            System.out.println("Selamat Datang, " + username + "!");
                            System.out.println("Silahkan pilih menu:");
                            System.out.println("1. Tambah Kendaraan Baru");
                            System.out.println("2. Lihat Semua Kendaraan");
                            System.out.println("3. Hapus Kendaraan");
                            System.out.println("0. Logout");

                            System.out.print("\nPilihan Anda > ");
                            pilihan = input.nextInt();
                            input.nextLine();

                            switch (pilihan) {

                                case 1:
                                    System.out.println("Menu Tambah Kendaraan Baru");
                                    break;

                                case 2:
                                    System.out.println("Menu Lihat Semua Kendaraan");
                                    break;

                                case 3:
                                    System.out.println("Menu Hapus Kendaraan");
                                    break;

                                case 0:
                                    System.out.println("Logout berhasil!");
                                    break;

                                default:
                                    System.out.println("Pilihan tidak valid!");
                            }

                        } while (pilihan != 0);
                    }

                    // DASHBOARD STAFF
                    else if (akun[i][2].equals("STAFF")) {

                        int pilihan;

                        do {
                            System.out.println("\n========================================");
                            System.out.println("           DASHBOARD - STAFF");
                            System.out.println("========================================");
                            System.out.println("Selamat Datang, " + username + "!");
                            System.out.println("Silahkan pilih menu:");
                            System.out.println("1. Daftar Pelanggan Baru");
                            System.out.println("2. Cari Data Pelanggan");
                            System.out.println("3. Cek Kendaraan Tersedia");
                            System.out.println("4. Proses Peminjaman (Sewa)");
                            System.out.println("5. Proses Pengembalian");
                            System.out.println("0. Logout");

                            System.out.print("\nPilihan Anda > ");
                            pilihan = input.nextInt();
                            input.nextLine();

                            switch (pilihan) {

                                case 1:
                                    System.out.println("Menu Daftar Pelanggan Baru");
                                    break;

                                case 2:
                                    System.out.println("Menu Cari Data Pelanggan");
                                    break;

                                case 3:
                                    System.out.println("Menu Cek Kendaraan Tersedia");
                                    break;

                                case 4:
                                    System.out.println("Menu Proses Peminjaman");
                                    break;

                                case 5:
                                    System.out.println("Menu Proses Pengembalian");
                                    break;

                                case 0:
                                    System.out.println("Logout berhasil!");
                                    break;

                                default:
                                    System.out.println("Pilihan tidak valid!");
                            }

                        } while (pilihan != 0);
                    }

                    // DASHBOARD OWNER
                    else if (akun[i][2].equals("OWNER")) {

                        int pilihan;

                        do {
                            System.out.println("\n========================================");
                            System.out.println("           DASHBOARD - OWNER");
                            System.out.println("========================================");
                            System.out.println("Selamat Datang, " + username + "!");
                            System.out.println("Silahkan pilih menu:");
                            System.out.println("1. Lihat Laporan Pendapatan & Riwayat");
                            System.out.println("0. Logout");

                            System.out.print("\nPilihan Anda > ");
                            pilihan = input.nextInt();
                            input.nextLine();

                            switch (pilihan) {

                                case 1:
                                    System.out.println("Menu Laporan Pendapatan");
                                    break;

                                case 0:
                                    System.out.println("Logout berhasil!");
                                    break;

                                default:
                                    System.out.println("Pilihan tidak valid!");
                            }

                        } while (pilihan != 0);
                    }

                    break;
                }
            }

            // Jika login gagal
            if (!loginBerhasil) {
                percobaan++;

                if (percobaan < 3) {
                    System.out.println("\n[ERROR] Login Gagal!");
                    System.out.println("Username atau Password salah.");
                    System.out.println("Sisa percobaan : " + (3 - percobaan));
                    System.out.println();
                } else {
                    System.out.println("\n[ERROR] Anda gagal login 3 kali.");
                    System.out.println("Akses ditolak!");
                }
            }
        }

        input.close();
    }
}