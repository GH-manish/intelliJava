import java.util.Scanner;
public class SumOfDigitOfNumber {
    public static void main(String[] args) {
        int n;
        System.out.println("enter any no. :");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int temp=0;
        while (n>0) {
            temp = temp + n % 10;
            n /= 10;
        }
        System.out.println("sum :"+temp);
    }
}
