import java.util.Scanner;

public class Main {

    static int calculator(int num1,int num2,char opt){

        if (opt=='+'){
            return num1+num2;
        } else if (opt=='-'){
            return num1-num2;
        } else if (opt=='x'){
            return num1*num2;
        } else if (opt=='/'){
            return num1/num2;
        } else {
            return 0;
        }
    }

    public static void main(String[] args){
        Scanner user=new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int num1=user.nextInt();
        System.out.println("Enter Number 2: ");
        int num2=user.nextInt();
        System.out.println("Enter Operator (+,-,x,/): ");
        char opt= user.next().charAt(0);
        System.out.println("Result"+"="+calculator(num1,num2,opt));
    }

}