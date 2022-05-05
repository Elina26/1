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

        System.out.println("\ne^(" +x+ ") = " +exp(precision,x));
    }

    //метод считает экспоненту с заданной степенью (x) и точностью (precision)
    //возвращает значение экспоненты с заданной точностью
    public static double exp(double precision, double x) {
        double c=1;
        double res=1; int i=1;
        while (!(Math.abs(c)<precision)){
            c=Math.pow(x,i)/factorial(i);
            if (!(Math.abs(c)<precision)){
                res+=c;
                i++;
            }
        }
        return res;
    }

    public static int factorial(int i)
    {
        if (i==0) {return 1;}
        else {return i*factorial(i-1);}
    }
}