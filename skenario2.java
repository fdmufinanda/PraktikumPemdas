import java.util.Scanner;

public class skenario2 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    String statusMember;
    System.out.println("Masukkan status member anda (GOLD, SILVER, BRONZE, atau REGULER): ");
    statusMember = input.nextLine();

    if (statusMember.equals("GOLD")){
        System.out.println("Anda mendapatkan diskon 20%");

        } else if (statusMember.equals("SILVER")){
            System.out.println("Anda mendapatkan diskon 15%");
        
        } else if (statusMember.equals("BRONZE")){
            System.out.println("Anda mendapatkan diskon 10%");
        
        } else if (statusMember.equals("REGULER")){
            System.out.println("Mohon maaf anda tidak mendapatkan diskon");

    }

        input.close();
    }
}

