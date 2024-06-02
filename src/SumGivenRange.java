import java.util.Scanner;
public class SumGivenRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the starting range :");
        int x,y,s=0;
        x= sc.nextInt();
        System.out.println("enter the last range :");
        y=sc.nextInt();
        for(int i=x;i<=y;i++)
        {
            s=s+i;
        }
        System.out.println("sum : "+s);
    }
}
