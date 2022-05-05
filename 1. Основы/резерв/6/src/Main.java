import java.util.Scanner;
public class Main {public static void main(String[] args) {

    double a1, b1, c1;
    double a2, b2, c2;
    double x = 0, y = 0, p;

    System.out.println("Уравнения вида:\nA1x + B1y = C1;\nA2x + B2y = C2.");
    System.out.println("Введите поочередно A1, B1, C1, A2, B2, C2.");

    Scanner scanner = new Scanner(System.in);
    a1 = scanner.nextDouble();
    b1 = scanner.nextDouble();
    c1 = scanner.nextDouble();
    a2 = scanner.nextDouble();
    b2 = scanner.nextDouble();
    c2 = scanner.nextDouble();

    if ((a1==0) && (b1!=0) && (a2!=0) && (b2!=0)) {//a1=0
        y = c1/b1;
        x = (c2-b2*y)/a2;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    else if ((a1!=0) && (b1==0) && (a2!=0) && (b2!=0)) {//b1=0
        x = c1/a1;
        y = (c2-a2*x)/b2;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    else if ((a1!=0) && (b1!=0) && (a2==0) && (b2!=0)) {//a2=0
        y = c2/b2;
        x = (c1-b1*y)/a1;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    else if ((a1!=0) && (b1!=0) && (a2!=0) && (b2==0)) {//b2=0
        x = c2/a2;
        y = (c1-a1*x)/b1;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    else if ((a1==0) && (b1!=0) && (a2!=0) && (b2==0)) {//a1=b2=0
        y = c1/b1;
        x = c2/a2;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    else if ((a1!=0) && (b1==0) && (a2==0) && (b2!=0)) {//b1=a2=0
        y = c2/b2;
        x = c1/a1;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    else if ((a1!=0) && (b1!=0) && (a2!=0) && (b2!=0)) {
        double a22 = a2;
        p = a1*(-a22/a1);
        System.out.println("p = " + p);
        a2 += p;
        System.out.println("a2 = " + a2);
        p = b1*(-a22/a1);
        System.out.println("p = " + p);
        b2 += p;
        System.out.println("b2 = " + b2);
        p = c1*(-a22/a1);
        System.out.println("p = " + p);
        c2 += p;
        System.out.println("c2 = " + c2);
        y = c2/b2;
        x = (c1-b1*y)/a1;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
    else System.out.println("Невозможно решить.");
}
}