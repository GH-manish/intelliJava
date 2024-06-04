import java.util.Scanner;

public class ArmstrongNoGivenRange {
    public static void main(String[] args) {
        int x, y, r, z = 0, i1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st range : ");
        x = sc.nextInt();
        System.out.println("enter the 2nd range : ");
        y = sc.nextInt();
        for (int i = x; i <= y; i++) {
            i1 = i;
            while (i1 > 0) {
                r = i1 % 10;
                z = z + r * r * r;
                i1 = i1 / 10;
            }
            System.out.println(z);
        }
    }
}
