import java.util.Scanner;

class Positive
{
    public static void main(String[] args) {
        int num;
        Scanner s=new Scanner(System.in);
        System.out.print("enter any no. : ");
         num=s.nextInt();
        if(num==0)
            System.out.println("entered number is zero");
        else if(num<0)
            System.out.println("entered no. is negative");
        else
            System.out.println("entered no. is positive");
    }
}