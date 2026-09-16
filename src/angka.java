import java.util.Scanner;

public class angka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double operatorPertama;
        double operatorKedua;
        double hasilPenjumlahan;
        double hasilPengurangan;
        double hasilPerkalian;
        double hasilPembagian;

        System.out.println("Masukkan operator pertama: ");
        operatorPertama = input.nextInt();

        System.out.println("Masukkan operator kedua: ");
        operatorKedua = input.nextInt();

        hasilPenjumlahan = operatorPertama + operatorKedua;
        hasilPengurangan = operatorPertama - operatorKedua;
        hasilPerkalian = operatorPertama * operatorKedua;
        hasilPembagian = operatorPertama / operatorKedua;

        System.out.println("hasil penjumlahan: " + hasilPenjumlahan);
        System.out.println("hasil pengurangan: " + hasilPengurangan);
        System.out.println("hasil perkalian: " + hasilPerkalian);
        System.out.println("hasil pembagian: " + hasilPembagian);
    
    }
}
