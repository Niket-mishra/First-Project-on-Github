import java.util.Scanner;

public class PowerOfAtoB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int a = sc.nextInt();
        System.out.println("Enter Its Power :");
        int b = sc.nextInt();

        System.out.println(a + "^" + b + "=" + power(a, b));
    }

    public static int power(int a, int b) {
        if (b != 0)
            return (a * power(a, b - 1));

         else
                return 1;
    }
}
