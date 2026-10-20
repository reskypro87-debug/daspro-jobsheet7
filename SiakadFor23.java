import java.util.Scanner;

public class SiakadFor23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahMahasiswa = 10;
        double nilai, tertinggi = 0, terendah = 100;

        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.println("Data Mahasiswa ke-" + i + ":");
            System.out.print("Nilai: ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            System.out.println("Data Mahasiswa ke-" + i + ":");
            System.out.println("Nilai: " + nilai);
            System.out.println("Nilai Tertinggi: " + tertinggi);
            System.out.println("Nilai Terendah: " + terendah);
            System.out.println("-------------------------");
        }

        sc.close();
    }
}