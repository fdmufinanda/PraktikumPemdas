import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int bilangan;
        System.out.println("Masukkan bilangan");
        bilangan=sc.nextInt();

        if ((bilangan&2)==0)
            {
                System.out.println("Bilangan Genap");
            }
        else
            {
                System.out.println("Bilangan Ganjil");
            }
            System.out.println("Akhir dari kode");
    }
}
