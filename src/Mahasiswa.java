import java.util.Scanner;

public class Mahasiswa {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int nilaiX,nilaiY,hasil;
        nilaiX=0;
        nilaiY=0;
        hasil=0;

        System.out.println("Masukkan x: ");
        nilaiX = inp.nextInt();

        System.out.println("Masukkan y: ");
        nilaiY = inp.nextInt();

        hasil = nilaiX + nilaiY;
        System.out.println("Hasil penjumlahan = "+hasil);



    }
}
