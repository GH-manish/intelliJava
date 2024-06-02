import java.util.Scanner;
public class First_nSum
{
    public static void main(String[] args) {
        System.out.print("enter nTh term :");
        int n,s=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            s=s+i;
        }
        System.out.println("sum="+s);
    }
}