import java.util.Scanner;
public class GreatestOfThree {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. :");
            x=sc.nextInt();
        System.out.println("enter no. :");
            y=sc.nextInt();
        System.out.println("enter no. :");
            z=sc.nextInt();
            if(x>y&&x>z)
                System.out.println(x+"  is greatest no.");
            if (y>x&&y>z)
                System.out.println(y+"  is greatest no. ");
            if(z>x&&z>y)
                System.out.println(z+"  is greatest no.");
    }
}
