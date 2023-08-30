import java.util.Scanner;
public class Arrayreverse {
    public static void reverse(int [] arr, int n) {
        int i, j = n;
        int[] arr2 = new int[n];
        for (i = 0; i < n; i++) {
            arr2[j - 1] = arr[i];
            --j;
        }
        System.out.println("The Array After Being Reversed: ");
        for (i = 0; i < n; i++) {
            System.out.println("" + arr2[i]);
        }
    }

        public static void main (String[]args){
            int i, n;
            System.out.println("Enter the Number Of Elements: \n");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            int[] arr = new int[n];
            for (i = 0; i < n; i++) {
                System.out.println("Enter Element " + (i + 1));
                arr[i] = sc.nextInt();
            }
            reverse(arr,arr.length);

        }

    }
