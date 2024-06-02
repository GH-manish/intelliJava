import java.util.Scanner;

public class PrimeNo {

    public static void main(String[] args) {
        System.out.println("enter any no. : ");
        Scanner sc=new Scanner(System.in);
        int i,n=sc.nextInt();
        for( i=2;i<n/2;i++)
            if(n%i==0)
                break;
        if (i==n/2)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }

}
