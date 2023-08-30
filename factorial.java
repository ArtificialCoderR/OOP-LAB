import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to be factored:  \n");
        int num = sc.nextInt();
        int result = factor(num);
        System.out.println(num + "! = " + result + "\n");
        int NcR, n, r;
        System.out.println("Enter n value: ]\n");
        n = sc.nextInt();
        System.out.println("Enter r value: ]\n");
        r = sc.nextInt();
        NcR = factor(n) / (factor(r) * (factor(n - r)));
        System.out.println(n + "C" + r + " = " + NcR);
    }

    public static int factor(int x) {
        if (x == 0)
            return 1;
        else
            return x * factor(x - 1);

    }
}