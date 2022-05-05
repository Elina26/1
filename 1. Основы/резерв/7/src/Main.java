import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("x = ");
        double x;
        x = scanner.nextDouble();

        System.out.println("\nточность = ");
        double precision;
        precision = scanner.nextDouble();

        double result = 1;
        double component = 1;
        for (int i=0; Math.abs(component)>=precision; i++)
        {
            component*=(x/(i+1));
            result+=component;
        }

        System.out.println("\ne^" +x+ " с точностью " +precision+ " = " +result);
    }
}