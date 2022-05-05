import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("\nТочка О - начало координат.");
        Point3D o = new Point3D();
        System.out.println("\nО = ");
        o.print_point();

        System.out.println("\nВведите координаты точки A = (x,y,z)");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        Point3D A = new Point3D(x, y, z);

        System.out.println("\nВведите координаты точки B = (x,y,z)");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        z = scanner.nextDouble();
        Point3D B = new Point3D(x, y, z);

        System.out.println("\nA = ");
        A.print_point();
        System.out.println("\nB = ");
        B.print_point();

        if ((A.get_x()==B.get_x())||(A.get_y()==B.get_y())||(A.get_z()==B.get_z())) System.out.println("\nA равна B.");
        else System.out.println("\nA не равна B");

        if ((A.get_x()==A.get_x())||(A.get_y()==A.get_y())||(A.get_z()==A.get_z())) System.out.println("\nA равна сама себе.");
        else System.out.println("\nA не равна сама себе(как так то!?");*/

        Point3D a = new Point3D(1,1,1);
        Point3D b = new Point3D(1,1,1);
        if(a==b) {
            System.out.println("==");
        }
        else {
            System.out.println("!=");
        }
        if(a.equals(b)) {
            System.out.println("equals");
        }
        else {
            System.out.println("not equals");
        }
    }
}