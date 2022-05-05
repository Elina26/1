import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double a, b, x;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пределы табулирования (в градусах): ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();

        System.out.println("Введите шаг табулирования: (в градусах): ");
        x = scanner.nextDouble();

        double rad;
        if (a<=b) {
            rad = a;
            for (int i=0; i<((b-a)/x+x);i++) {
                System.out.format("\nСинус (%.1f) = %.4f%n", rad, Math.sin(rad));
                rad+=x;
            }
        }
        else {
            rad = a;
            for (int i=0; i<((a-b)/x+x);i++) {
                System.out.format("\nСинус (%.1f) = %.4f%n", rad, Math.sin(rad));
                rad-=x;
            }
        }
    }
}