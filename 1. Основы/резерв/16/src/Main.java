import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vector3D v = new Vector3D();
        System.out.println("\nНулевой вектор v = ");
        v.print_vector();

        System.out.println("\nВведите координаты точки A = (x,y,z)");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        Point3D A = new Point3D(x,y,z);

        System.out.println("\nВведите координаты точки B = (x,y,z)");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        z = scanner.nextDouble();
        Point3D B = new Point3D(x,y,z);

        System.out.println("\nA = ");
        A.print_point();
        System.out.println("\nB = ");
        B.print_point();

        Vector3D AB = new Vector3D(A,B);



        System.out.println("\nВведите координаты вектора u = (x,y,z)");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        z = scanner.nextDouble();
        Vector3D u = new Vector3D(x,y,z);
        System.out.println("\nВектор u = ");
        u.print_vector();
        System.out.println("\nВектор AB = ");
        AB.print_vector();

        double length = u.length();
        System.out.println("\nДлина u = " + length);

        boolean eq = u.equals(v);
        if (eq) System.out.println("\nВектор u равен вектору AB.");
        else System.out.println("\nВектор u не равен вектору AB.");
    }
}