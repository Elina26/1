import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double a, b, c, sum, multi, middle;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nвведите числа a, b, c:");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        sum = a+b+c;
        multi = a*b*c;
        middle = (a+b+c)/3;

        System.out.println("\nсумма = " + sum);
        System.out.println("произведение = " + multi);
        System.out.println("среднее арифметическое = " + middle);

        if (a>=b && a>=c) {
            if (b>=c) {System.out.println("\n"+c+" "+b+" "+a);}
            else {System.out.println("\n"+b+" "+c+" "+a);}
        }
        else if (b>=a && b>=c) {
            if (a>=c) {System.out.println("\n"+c+" "+a+" "+b);}
            else {System.out.println("\n"+a+" "+c+" "+b);}
        }
        else if (c>=a && c>=b) {
            if (a>=b) {System.out.println("\n"+b+" "+a+" "+c);}
            else {System.out.println("\n"+a+" "+b+" "+c);}
        }
    }
}