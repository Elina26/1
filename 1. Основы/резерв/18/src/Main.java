import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1) Размер массива = ");
        int size = scanner.nextInt();

        Vector3DArray array = new Vector3DArray();
        array.Vector3DArray(size);
        System.out.println("\nВаш массив:");
        array.print_Array();

        int length = array.length_of_Array();
        System.out.println("\n2) Длина массива = " + length);

        double x; double y; double z;
        Vector3D v = new Vector3D();
        for (int i=0; i<size; i++) {
            System.out.println("\n3."+ (i+1) +") Введите координаты вектора v = (x,y,z)");
            x = scanner.nextDouble();
            y = scanner.nextDouble();
            z = scanner.nextDouble();
            //Vector3D v = new Vector3D();
            v.set_x(x); v.set_y(y); v.set_z(z);
            System.out.println("\nВектор v = ");
            v.print_vector();
            System.out.println("\nНомер i элемента массива, который нужно заменить на вектор v = ");
            int index_i = scanner.nextInt();
            array.replacement(v,index_i);
            System.out.println("\nВаш массив:");
            array.print_Array();
        }

        System.out.println("\nВаш массив:");
        array.print_Array();

        double biggest_length = array.biggest_length_of_vector();
        System.out.println("\n4) Наибольшая длина вектора в массиве = " + biggest_length);

        System.out.println("\n5) Введите координаты вектора, который хотите найти в массиве.");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        z = scanner.nextDouble();
        Vector3D u = new Vector3D(x,y,z);
        int index = array.search_vector(u);
        if (index!=-1) { System.out.println("\nВектор u находится на месте ["+index+"]"); }
        else { System.out.println("\nВ массиве нет такого вектора."); }

        Vector3D sum = array.sum_of_all_vectors();
        System.out.println("\n6) Сумма всех векторов = ");
        sum.print_vector();

        System.out.println("\n7) Количество коэффициентов в массиве = ");
        int c = scanner.nextInt();
        double[] coefficient = new double[c];
        System.out.println("\nВведите коэффициенты:");
        for (int i = 0; i < coefficient.length; i++){
            coefficient[i] = scanner.nextDouble();
        }
        System.out.println("\nВы ввели:");
        for (int i = 0; i < coefficient.length; i++){
            System.out.println(coefficient[i]);
        }

        Vector3D l_c_v = array.linear_combination_of_vectors(coefficient);
        System.out.println("\nЛинейная комбинация векторов = ");
        l_c_v.print_vector();

        Point3D p = new Point3D();
        System.out.println("\n8) Введите координаты точки p = (x,y,z)");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        z = scanner.nextDouble();
        p.set_x(x); p.set_y(y); p.set_z(z);
        Point3D[] array_of_points = array.shift_by_vector(p);
        System.out.println("\nСдвиг точки p на соот. векторы");
        array.print_Array_of_points(array_of_points);
    }

}