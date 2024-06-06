import java.util.Scanner;

public class ArmstrongNumber
{
    public static void main(String[] args) {
        System.out.println("enter any no. to check armstrong :");
        int n,x,r,y=0;
        Scanner sc= new Scanner(System.in);
                n =sc.nextInt();
                x=n;
                while(x>0)
                {
                    r=x%10;
                    y=y+r*r*r;
                    x=x/10;
                }
                if(y==n)
                    System.out.println("given no. is armstrong");
                else
                    System.out.println("not armstrong");
    }
}
