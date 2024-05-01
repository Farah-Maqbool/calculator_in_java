import java.util.Scanner;

public class AtmCheck {
    public static void main(String[] args) {

        Scanner user=new Scanner(System.in);
        System.out.println("WELCOME TO AL-HABIB BANK");
        int UserPass=159357;
        int count=0;
        for (int i=0 ; i<3 ; i++){
            System.out.print("Enter your PIN: ");
            int Password=user.nextInt();
            if (Password==UserPass){
                System.out.println("01: Check Balance");
                System.out.println("02: Withdraw Balance");
                System.out.println("03: Transfer Balance");
                break;
            } else{
                count=count+1;
                System.out.println("Invalid PIN");
            }
        }
        if (count==3){
            System.out.println("Card Block!!!");
        }
    }
}

