import java.util.Scanner;

public class PrimeNumberInGivenRange {
    public static void main(String[] args) {
        int x,y,i,j,count=0;
        System.out.print("enter your starting range  to find prine no. :");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        System.out.print("enter your last range to find prime no. :");
        y=sc.nextInt();
        for (i=x;i<=y;i++)
        {
            for (j=2;j<i;j++)
             {
                if (i%j==0)
                    break;
             }
            if (j==i)
                count++;
        }
        System.out.println("total no. of prime no. is "+count);
    }
}
