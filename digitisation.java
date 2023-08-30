import java.util.Scanner;
public class digitisation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = sumoff(num);
        System.out.println("The sum of the digits of " + num + " is " + sum);
    }
    public static int sumoff(int x){
        int remainder=0,sum=0;
        while (x!=0){
            remainder=x%10;
            sum+=remainder;
            x/=10;

        }
        return  sum;
    }
}



