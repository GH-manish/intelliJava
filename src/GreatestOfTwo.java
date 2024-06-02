import java.util.Scanner;
public class GreatestOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,g,y;
        System.out.println("enter 1st no.");
        x=sc.nextInt();
        System.out.println("enter 2nd no.");
        y=sc.nextInt();
        g=x>y?x:y;
        System.out.println("greatest no. is :"+g);


    }
}
