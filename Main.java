import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menggunakan ArrayList untuk menyimpan objek BangunDatar
        ArrayList<BangunDatar> bangunDatarList = new ArrayList<>();

        int pilihan;
        do {
            System.out.println("Pilih bangun datar yang akan dihitung luasnya:");
            System.out.println("1. Segitiga");
            System.out.println("2. Lingkaran");
            System.out.println("3. Persegi");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan alas segitiga: ");
                    double alas = scanner.nextDouble();
                    System.out.print("Masukkan tinggi segitiga: ");
                    double tinggi = scanner.nextDouble();

                    Segitiga segitiga = new Segitiga(alas, tinggi);
                    bangunDatarList.add(segitiga);
                    break;
                case 2:
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double jariJari = scanner.nextDouble();

                    Lingkaran lingkaran = new Lingkaran(jariJari);
                    bangunDatarList.add(lingkaran);
                    break;
                case 3:
                    System.out.print("Masukkan panjang sisi persegi: ");
                    double sisi = scanner.nextDouble();

                    Persegi persegi = new Persegi(sisi);
                    bangunDatarList.add(persegi);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }

            System.out.println();
        } while (pilihan != 0);

        // Mencetak informasi luas bangun datar
        for (BangunDatar bangunDatar : bangunDatarList) {
            bangunDatar.printInfo();
            System.out.println();
        }
    }
}