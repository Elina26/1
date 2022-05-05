public class Point3D {
    private double x;
    private double y;
    private double z;

    //конструктор по координатам
    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //конструктор без параметров
    public Point3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    //Getters
    public double get_x() {
        return x;
    }
    public double get_y() {
        return y;
    }
    public double get_z() {
        return z;
    }

    //Setters
    public void set_x(double x) {
        this.x = x;
    }
    public void set_y(double y) {
        this.y = y;
    }
    public void set_z(double z) {
        this.z = z;
    }

    //вывод точки на консоль
    public void print_point() {
        System.out.println("(" + get_x() + ", " + get_y() + ", " + get_z() + ")");
    }
}