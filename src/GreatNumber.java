import java.util.Scanner;

public class GreatNumber {
    public static void main(String[] args) {
        int num;
        int total=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        num = sc.nextInt();
        for (int i=num-1;i>=1;i--){
        if(num%i==0){
           total+=i;
        }
    }
        if (total==num){
            System.out.println("Your number is great number\n" +
                    "Great job");
        }else {
            System.out.println("Please try again..");
        }
    }
}
