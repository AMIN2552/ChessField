import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int a1, a2, b1, b2;

    public static void main(String[] args) {
        a1 = sc.nextInt();
        a2 = sc.nextInt();
        b1 = sc.nextInt();
        b2 = sc.nextInt();

        if (a1 == a2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}