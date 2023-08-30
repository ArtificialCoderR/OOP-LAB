import java.util.*;
public class SearchArray {
    public static int search(int arr[], int num) {
        int i = 0;
        int length = arr.length;
        while (i < length) {
            if (arr[i] == num) {
                return i;
            }
            else{
                i++;
            }
        }
        return -1;
    }
    public static void main(String [] nani){
            System.out.println("Enter the number of elements: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int [] arr = new int [n];
            System.out.println("Enter the elements of the array: ");
            for (int i=0;i<n;i++){
                System.out.println("enter the "+i+" element: ");
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter the number to be searched: ");
            int num = sc.nextInt() ;
            int pos=search(arr,num);
            if (pos==-1) {
                System.out.println("The number was not found in the array or the array is invalid");
            }
                else {
            System.out.println("The number "+num+" was found at index "+pos+" of the inputted array");
        }
    }
    }