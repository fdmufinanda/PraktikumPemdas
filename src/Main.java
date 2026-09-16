import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double IPK;
        int semester;
        int maxSKS;
        boolean pilihan;

        System.out.print("Masukkan IPK anda: ");
        IPK = input.nextDouble();

        System.out.print("Semester berapa anda sekarang: ");
        semester = input.nextInt();

        if (semester == 1) {
            maxSKS = 0;
            System.out.println("Semester 1 tidak boleh mengambil mata kuliah pilihan");
        } else {
            if (IPK >= 3.00) {
                maxSKS = 24;
            } else if (IPK >= 2.50) {
                maxSKS = 21;
            } else if (IPK >= 2.00) {
                maxSKS = 18;
            } else {
                maxSKS = 15;
            }
        }

        System.out.println("Maksimal SKS anda = " + maxSKS);

        input.close();
    }
}
