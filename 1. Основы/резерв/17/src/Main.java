import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nВведите координаты вектора v = (x,y,z)");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        Vector3D v = new Vector3D(x,y,z);

        System.out.println("\nВведите координаты вектора u = (x,y,z)");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        z = scanner.nextDouble();
        Vector3D u = new Vector3D(x,y,z);

        System.out.println("\nВектор v = ");
        v.print_vector();
        System.out.println("\nВектор u = ");
        u.print_vector();

        Vector3D add = new Vector3D();
        Vector3D sub = new Vector3D();
        double scalar; int coll;
        Vector3D cross = new Vector3D();

        Vector3DProcessor proc = new Vector3DProcessor();
        add = proc.addition(v,u);
        sub = proc.subtraction(v,u);
        scalar = proc.scalar_product(v,u);
        cross = proc.cross_product(v,u);
        coll = proc.collinear(v,u);

        System.out.println("\nv + u = ");
        add.print_vector();
        System.out.println("\nv - u = ");
        sub.print_vector();
        System.out.println("\nСкалярное произведение (v,u) = " + scalar);
        System.out.println("\nВекторное произведение [v,u] = ");
        cross.print_vector();
        if (coll==0) {System.out.println("\nv и u коллинеарны.");}
        else if (coll==1) {System.out.println("\nv и u не коллинеарны.");}
        else {System.out.println("\nОдин из векторов равен нулю, поэтому вопрос о коллинеарности векторов некорректен.");}
    }
}
