import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        System.out.println("enter any no to reverse the that no. :");
        int x,r,y=0;
        Scanner sc=new Scanner(System.in);
        x= sc.nextInt();
        while(x>0)
        {
            r = x % 10;
            y = y * 10 + r;
            x = x / 10;
        }
        System.out.println("REV====="+y);
    }
}
