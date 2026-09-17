import java.util.Scanner;

public class skenario1 {
    public static void main(String[] args){
    Scanner inputUser = new Scanner(System.in);

    int nilai;
    System.out.println("Masukkan Nilai:");
    nilai = inputUser.nextInt();

    if (nilai>= 85 && nilai<=100){
        System.out.println("A");
    
        } else if (nilai>= 70 && nilai<=84){
            System.out.println("B");

        } else if (nilai>= 55 && nilai <=69){
            System.out.println("C");

        } else if (nilai>= 40 && nilai <=54){
            System.out.println("D");

        } else if (nilai < 40){
            System.out.println("E");
        }

        inputUser.close();
    }
}

