import java.util.Scanner;
public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to be checked: \n");
        int num = sc.nextInt();
        int state = prime(num);
        if (state == 0) {
            System.out.println(num + " is a prime numbers\n");
        }
        if (state == 1)
            System.out.println(num + " is not a prime number\n");
        else if(state==2)
            System.out.println("The Entered number is neither prime nor even\n");
        System.out.println("Enter how many prime numbers to be generated: \n");
        int n= sc.nextInt();
        int k,j=0;
        int i=0;
        while (i<=n){
            k=prime(j);
            if(k==0) {
                System.out.println(j);
                i++;
            }
            j++;

        }

        }


    public static int prime(int x) {
        int flag = 0, i;
        if (x==0||x==1)
            return flag=2;
        else{
        for (i = 2; i < x; i++) {
            if (x % i == 0) {
                flag+=1;
                break;
            }
        }

        }
        return flag;
    }
}