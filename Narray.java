import java.util.Scanner;

public class Narray {
    public static void main(String [] args)
    {
        int n;
        System.out.println("Enter the value of N: ");
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        int [] arr = new int [n];
        for( int i = 0;i<n;i++){
            arr[i]=i+1;
        }
        for( int elements:arr) {
            System.out.print(elements+" ");
        }
        }
}
