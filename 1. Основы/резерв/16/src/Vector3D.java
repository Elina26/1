public class Vector3D {
    private double x;
    private double y;
    private double z;

    //конструктор по координатам
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //конструктор без параметров
    public Vector3D () {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    /*Конструктор по 2-м точкам.
     * Входные данные: Две точки типа Point3D, A - начало, B - конец вектора.
     * Выходные данные: вектор AB.*/
    public Vector3D(Point3D point_1, Point3D point_2) {
        this.x = point_2.get_x()-point_1.get_x();
        this.y = point_2.get_y()-point_1.get_y();
        this.z = point_2.get_z()-point_1.get_z();
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

    //вывод вектора на консоль
    public void print_vector() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }

    /*Метод считает длину вектора.
    * Выходные данные: возвращает длину вектора типа double.*/
    public double length() {
        return Math.sqrt(get_x()*get_x() + get_y()*get_y() + get_z()*get_z());
    }

    /*Метод проверяет равенство вектора с заданным вектором.
    * Входные данные: вектор типа Vector3D, с которым нужно сравнить исходный вектор.
    * Выходные данные: true - если вектора равны.
    *                  false - если вектора не равны.*/
    public boolean equals(Vector3D v) {
        if ((v.get_x()==get_x()) && (v.get_y()==get_y()) && (v.get_z()==get_z())) { return true; }
        else {return false;}
    }

}