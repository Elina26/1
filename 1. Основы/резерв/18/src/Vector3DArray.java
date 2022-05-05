public class Vector3DArray {
    private int size;
    private Vector3D[] array;

    public void Vector3DArray(int size) {
        this.size = size;
        this.array = new Vector3D[this.size];

        for (int i = 0; i < this.size; i++) {
            this.array[i] = new Vector3D();
        }
    }

    public int length_of_Array() {
        return array.length;
    }

    public void replacement(Vector3D v, int i) {
        this.array[i].set_x(v.get_x());
        this.array[i].set_y(v.get_y());
        this.array[i].set_z(v.get_z());
    }

    public double biggest_length_of_vector() {
        double l = this.array[0].length();
        for (int i = 0; i < this.size; i++) {
            if (this.array[i].length()>=l) {
                l = this.array[i].length();
            }
        }
        return l;
    }

    public int search_vector(Vector3D v) {
        int c = 0; int index=0;
        for (int i = 0; i < this.size; i++) {
            if ((this.array[i].get_x()==v.get_x()) && (this.array[i].get_y()==v.get_y()) && (this.array[i].get_z()==v.get_z())) {
                c++;
                index = i;
                break;
            }
        }
        if (c>0) {return index;}
        else {return -1;}
    }

    public Vector3D sum_of_all_vectors() {
        Vector3D res = new Vector3D();
        Vector3DProcessor proc = new Vector3DProcessor();
        for (int i = 0; i < this.size; i++) {
            res = proc.addition(res, this.array[i]);
        }
        return res;
    }

    public Vector3D linear_combination_of_vectors(double[] coefficient) {
        Vector3D res; double r=0;
        if (coefficient.length==array.length) {
            res = new Vector3D();

            for (int i=0; i<this.size; i++) {
                r+=array[i].get_x()*coefficient[i];
            }
            res.set_x(r);

            r = 0;
            for (int i=0; i<this.size; i++) {
                r+=array[i].get_y()*coefficient[i];
            }
            res.set_y(r);

            r = 0;
            for (int i=0; i<this.size; i++) {
                r+=array[i].get_z()*coefficient[i];
            }
            res.set_z(r);
        }
        else {res = new Vector3D();}
        return res;
    }

    public Point3D[] shift_by_vector(Point3D p) {
        Point3D[] array_of_points = new Point3D[this.size];

        System.out.println("\np = ");
        p.print_point();

        for (int i = 0; i < this.size; i++) {
            array_of_points[i] = new Point3D();

            array_of_points[i].set_x(p.get_x()+array[i].get_x());
            array_of_points[i].set_y(p.get_y()+array[i].get_y());
            array_of_points[i].set_z(p.get_z()+array[i].get_z());
        }
        return array_of_points;
    }

    public void print_Array() {
        for (int i = 0; i < this.size; i++) {
            this.array[i].print_vector();
        }
    }

    public void print_Array_of_points(Point3D[] array_of_points) {
        for (int i = 0; i < this.size; i++) {
            array_of_points[i].print_point();
        }
    }
}