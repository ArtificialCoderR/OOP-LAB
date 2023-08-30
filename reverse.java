import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to be reversed: \n");
        int num= sc.nextInt();
        int rev_num=rev(num);
        System.out.println("The reversed number is: \n"+rev_num);
        if (rev_num==num)
            System.out.println(num+" is a palindrome");
    }
    public static int rev(int x){
        int remainder,sum=0;
        while(x!=0){
            remainder=x%10;
            sum=sum*10+remainder;
            x/=10;
        }
        return sum;
    }
}