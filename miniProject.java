import java.util.Scanner;

public class miniProject {
    public static void main(String[]args){
        //Random Number Generate
        int RandomNumber = (int) (Math.random()*100);
        System.out.println(RandomNumber);
        Scanner user=new Scanner(System.in);
        //Do while loop
        int userNum;
        float percentage;
        do {
            System.out.print("Enter a number: ");
            userNum=user.nextInt();
            if (userNum>RandomNumber){
                percentage=((float)RandomNumber/userNum)*100;
            } else if (RandomNumber>userNum) {
                percentage=((float)userNum/RandomNumber)*100;
            }else {
                percentage=((float)userNum/RandomNumber)*100;
            }
            System.out.print("Here is result: ");
            if (percentage<=20){
                System.out.println("Too High");
            } else if (percentage>10 && percentage<=50) {
                System.out.println("High");
            } else if (percentage>50 && percentage<=80) {
                System.out.println("Close");
            } else if (percentage>80 && percentage<=99) {
                System.out.println("Too Close");
            } else {
                System.out.println("Congratulation!!!!!!! You guess the number");
                break;
            }


        }while (userNum!=-1);
    }

}
