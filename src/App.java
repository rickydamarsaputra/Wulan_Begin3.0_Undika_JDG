import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Perhitungan BMI =====");
        System.out.print("Masukkan Nama: ");
        String nama = scanner.next();
        System.out.print("Masukkan Berat Badan (Kg): ");
        Double beratBadan = scanner.nextDouble();
        System.out.print("Masukkan Tinggi Badan (cm): ");
        Double tinggibadan = scanner.nextDouble();

        double angkaBMI = beratBadan / ((Math.pow(tinggibadan / 100, 2)));
        System.out.print("Angka BMI: " + angkaBMI);

        System.out.println("===== Hasil Perhitungan BMI =====");
        System.out.println("Pasien dengan nama: " + nama);

        String message = null;

        if (angkaBMI < 18.5) {
            message = "Berat Badang Anda Kurang";
        } else if (angkaBMI <= 22.9) {
            message = "Berat Badan Anda Normal";
        } else if (angkaBMI <= 29.9) {
            message = "Anda Memiliki Gejala Obesitas";
        } else if (angkaBMI >= 30) {
            message = "Anda Sekarang Sedang Mengidap Obesitas";
        } else {
            message = "Coba masukkan data yang benar";
        }

        System.out.println("Total BMI: " + angkaBMI);
        System.out.println("Memiliki status: " + message);
    }
}