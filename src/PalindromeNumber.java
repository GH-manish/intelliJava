import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n,n1,y=0,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any no. to check palindrome = ");
                n= sc.nextInt();
                n1=n;
                while (n1>0)
                {
                  r=n1%10;
                  n1=n1/10;
                  y=y*10+r;
                }
                if (n==y)
                {
                    System.out.println("entered no. is palindrome ");
                }
                else
                    System.out.println("entered no is not palindrome");
    }
}
