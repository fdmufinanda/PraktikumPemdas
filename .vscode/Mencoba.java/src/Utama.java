public class Utama {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int umur = 20;
        double tinggiBadan = 168.5;
        char nilaiHuruf = 'A';
        boolean lulus = true;
        int a = 5000;
        int b = 1000000;
        int hasilJumlah = a + b;
        int hasilBagi = (int)((double)a / b);
        long hasilKali = (long)a * b;
        float alas = 5;
        float tinggi = 10;
        float luasSegitiga =  (float)0.5 * alas * tinggi;

        System.out.println("Umur: " + umur);
        System.out.println("Tinggi Badan: " + tinggiBadan);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("Lulus: " + lulus);
        System.out.println("Hasil Penjumlahan: " + (a + b));
        System.out.println("hasilJumlah: " + hasilJumlah);
        System.out.println("Hasil Pembagian: " + hasilBagi);
        System.out.println("Hasil Perkalian: " + hasilKali);
        System.out.println("Luas Segitiga: " + luasSegitiga);

    }
}
