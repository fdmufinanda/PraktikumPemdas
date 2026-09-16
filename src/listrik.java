import java.util.Scanner;

public class listrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        String kelurahan;
        int posisiAwal;
        int posisiAkhir;
        int biaya;
        int ppj;
        int pemakaian;
        int tarif;
        int PPJ;
        int total;

        System.out.println("Masukkan nama anda: ");
        nama = input.next();

        System.out.println("Masukkan kelurahan anda: ");
        kelurahan = input.next();
        
        System.out.println("Masukkan posisi awal Kwh Meter: ");
        posisiAwal = input.nextInt();

        System.out.println("Masukkan posisi akhir Kwh Meter: ");
        posisiAkhir = input.nextInt();

        System.out.println("Masukkan biaya beban saat ini: ");
        biaya = input.nextInt();

        System.out.println("Masukkan ppj dalam bentuk persen: ");
        ppj = input.nextInt();

        System.out.println("================PLN Java===========");
        System.out.println("Nama: " + nama);
        System.out.println("Kelurahan: " + kelurahan);
        
        pemakaian = posisiAkhir - posisiAwal;
        System.out.println("Pemakaian listrik bulan ini: " + pemakaian + "Kwh Meter");

        tarif = pemakaian * biaya;
        System.out.println("Tarif listrik: Rp " + tarif + ",-");

        PPJ = tarif / ppj;
        System.out.println("PPJ 10% : Rp " + PPJ + ",-");

        total = tarif + PPJ;
        System.out.println("Total Bayar: Rp " + total + ",-");

        System.out.println("===================================");





    }
}