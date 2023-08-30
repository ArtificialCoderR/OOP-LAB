import java.util.Scanner;
public class max {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three numbers: \n");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        System.out.println("THe three numbers are "+a+" "+b+" and "+c+"\n");
        int max_num=Max(a,b,c);
        System.out.println("The Largest Number is : "+max_num+"\n");
        int max_nested_num=max_nested(a,b,c);
        System.out.println("The Largest Number Using nested if is : "+max_nested_num);
    }
    public static int Max(int x,int y,int z){
        if(x>y&&x>z)
            return x;
        else if(y>x&&y>z)
            return y;
        else
            return z;
    }
    public static int max_nested(int x,int y,int z){
        if(x>y) {
            if (x > z)
                return x;
        }
        if (y>x) {
            if (y > z)
                return y;
        }
        return z;
    }
    }

