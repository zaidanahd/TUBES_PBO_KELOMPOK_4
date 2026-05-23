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