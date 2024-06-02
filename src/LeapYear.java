import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int y;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any year :");
         y=sc.nextInt();
         if(y%4==0)
         {
             if(y%100==0)
                 if(y%400==0)
                     System.out.println("leap year");
                 else
                     System.out.println("not leap year");
         }
         else
             System.out.println("not leap year");
    }
}
