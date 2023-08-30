import java.util.Scanner;

public class PrimeArray {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int [] arr= new int [n];
        for(int i=0;i<n;i++){
            System.out.println("Enter element "+(i+1));
            arr[i]= sc.nextInt();
        }
        int j=0;
        int [] primer=new int [n];
        for(int i=0;i<n;i++){
            int flag = IsPrime.prime(arr[i]);
            if(flag==0){
                System.out.println(arr[i]+" ");
            }

        }

    }
}