import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("enter any no. :");
        Scanner sc=new Scanner(System.in);
        int y=0,r,x=sc.nextInt();
       int x1=x;
    while(x1>0)
    {
        r=x%10;
        y=y+r*r*r;
        x1=x/10;
    }
        if (x==y)
        {
            System.out.println(" amstrong no.");
        }
        else
            System.out.println("not armstrong");
    }
}
