import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double a, b, c;
        double D, x1, x2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите a, b и c:");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextInt();

        D = b * b - 4 * a * c;
        if (a == 0) {
            x1 = -c/b;
            System.out.println("x = " + x1);
        }
        else {
            if (D > 0) {
                x1 = (-b - Math.sqrt(D)) / (2 * a);
                x2 = (-b + Math.sqrt(D)) / (2 * a);
                System.out.println("x1 = " + x1 + ", x2 = " + x2);
            }
            else if (D == 0) {
                x1 = -b / (2 * a);
                System.out.println("x = " + x1);
            }
            else {
                System.out.println("Корней нет");
            }
        }

    }
}