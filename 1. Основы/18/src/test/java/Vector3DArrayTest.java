import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Vector3DArrayTest {

    @org.junit.jupiter.api.Test
    void length_of_Array() {
        int size = 3;
        Vector3DArray array = new Vector3DArray();
        array.Vector3DArray(size);
        int actual = array.length_of_Array();
        int expected = 3;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void biggest_length_of_vector() {
        //инициализация массива векторов (два нулевых вектора)
        int size = 2;
        Vector3DArray array = new Vector3DArray();
        array.Vector3DArray(size);

        //замена вектора [0] на (1,2,3), вектора [1] на (4,5,6)
        Vector3D v = new Vector3D(1,2,3);
        Vector3D u = new Vector3D(4,5,6);
        array.replacement(v,0);
        array.replacement(u,1);

        //метод должен вернуть длину вектора (4,5,6) равную sqrt(77) = 8.774964387392123
        double actual = array.biggest_length_of_vector();
        double expected = 8.774964387392123;
        assertEquals(expected, actual);
    }

    //ищет вектор и находит
    @org.junit.jupiter.api.Test
    void search_vector_test_1() {
        //инициализация массива векторов (два нулевых вектора)
        int size = 2;
        Vector3DArray array = new Vector3DArray();
        array.Vector3DArray(size);

        //замена вектора [0] на (1,2,3), вектора [1] на (4,5,6)
        Vector3D v = new Vector3D(1,2,3);
        Vector3D u = new Vector3D(4,5,6);
        array.replacement(v,0);
        array.replacement(u,1);

        //метод должен вернуть номер i вектора в массиве
        int actual = array.search_vector(v);
        int expected = 0;
        assertEquals(expected, actual);
    }

    //ищет вектор и возвращает -1, т.к. такого вектора в массиве нет
    @org.junit.jupiter.api.Test
    void search_vector_test_2() {
        //инициализация массива векторов (два нулевых вектора)
        int size = 2;
        Vector3DArray array = new Vector3DArray();
        array.Vector3DArray(size);

        //замена вектора [0] на (1,2,3), вектора [1] на (4,5,6)
        Vector3D v = new Vector3D(1,2,3);
        Vector3D u = new Vector3D(4,5,6);
        array.replacement(v,0);

        //метод должен вернуть -1
        int actual = array.search_vector(u);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void sum_of_all_vectors() {
        //инициализация массива векторов (три нулевых вектора)
        int size = 3;
        Vector3DArray array = new Vector3DArray();
        array.Vector3DArray(size);

        //замена вектора [0] на (1,2,3), вектора [1] на (4,5,6), вектора [2] на (-2,6,-20)
        Vector3D v = new Vector3D(1,2,3);
        Vector3D u = new Vector3D(4,5,6);
        Vector3D w = new Vector3D(-2,6,-20);
        array.replacement(v,0);
        array.replacement(u,1);
        array.replacement(w,2);

        //ожидается, что метод sum_of_all_vectors вернет вектор (3,13,-11)
        Vector3D actual = array.sum_of_all_vectors();
        double x_actual=actual.get_x(), y_actual=actual.get_y(), z_actual=actual.get_z();
        double x_expected=3, y_expected=13, z_expected=-11;
        assertEquals(x_expected, x_actual);
        assertEquals(y_expected, y_actual);
        assertEquals(z_expected, z_actual);
    }

    //длина массива векторов = длине массива коэффициентов
    @org.junit.jupiter.api.Test
    void linear_combination_of_vectors_test_1() {
        //инициализация массива векторов (три нулевых вектора)
        int size = 3;
        Vector3DArray array = new Vector3DArray();
        array.Vector3DArray(size);

        //замена вектора [0] на (1,2,3), вектора [1] на (4,5,6), вектора [2] на (-2,6,-20)
        Vector3D v = new Vector3D(1,2,3);
        Vector3D u = new Vector3D(4,5,6);
        Vector3D w = new Vector3D(-2,6,-20);
        array.replacement(v,0);
        array.replacement(u,1);
        array.replacement(w,2);

        //массив коэффициентов
        double[] k = new double[] {2,-5,6};

        //ожидается, что метод linear_combination_of_vectors вернет вектор (-30,15,-144)
        Vector3D actual = array.linear_combination_of_vectors(k);
        double x_actual=actual.get_x(), y_actual=actual.get_y(), z_actual=actual.get_z();
        double x_expected=-30, y_expected=15, z_expected=-144;
        assertEquals(x_expected, x_actual);
        assertEquals(y_expected, y_actual);
        assertEquals(z_expected, z_actual);
    }

    //если длина массива векторов не равна длине массива коэффициентов
    @org.junit.jupiter.api.Test
    void linear_combination_of_vectors_test_2() {
        //инициализация массива векторов (три нулевых вектора)
        int size = 3;
        Vector3DArray array = new Vector3DArray();
        array.Vector3DArray(size);

        //замена вектора [0] на (1,2,3), вектора [1] на (4,5,6), вектора [2] на (-2,6,-20)
        Vector3D v = new Vector3D(1, 2, 3);
        Vector3D u = new Vector3D(4, 5, 6);
        Vector3D w = new Vector3D(-2, 6, -20);
        array.replacement(v, 0);
        array.replacement(u, 1);
        array.replacement(w, 2);

        //массив коэффициентов
        double[] k = new double[]{2, -5, 6,4};

        Vector3D actual = array.linear_combination_of_vectors(k);

        //ожидается, что метод linear_combination_of_vectors вернет нулевой вектор
        double x_actual = actual.get_x(), y_actual = actual.get_y(), z_actual = actual.get_z();
        double x_expected = 0, y_expected = 0, z_expected = 0;
        assertEquals(x_expected, x_actual);
        assertEquals(y_expected, y_actual);
        assertEquals(z_expected, z_actual);
    }

    @org.junit.jupiter.api.Test
    void shift_by_vector() {
        //инициализация массива векторов (два нулевых вектора)
        int size = 2;
        Vector3DArray array = new Vector3DArray();
        array.Vector3DArray(size);

        //замена вектора [0] на (1,2,3) и вектора [1] на (4,5,6)
        Vector3D v = new Vector3D(1,2,3);
        Vector3D u = new Vector3D(4,5,6);
        array.replacement(v,0);
        array.replacement(u,1);

        //точка, которую будем сдвигать
        Point3D p = new Point3D(2,-5,6);
        Point3D[] array_of_points = array.shift_by_vector(p);

        // x/y/z_actual_0 - результат сдвига p на вектор [0]
        // x/y/z_actual_1 - результат сдвига p на вектор [1]
        double x_actual_0=array_of_points[0].get_x(); double x_actual_1=array_of_points[1].get_x();
        double y_actual_0=array_of_points[0].get_y(); double y_actual_1=array_of_points[1].get_y();
        double z_actual_0=array_of_points[0].get_z(); double z_actual_1=array_of_points[1].get_z();

        // x/y/z_actual_0 - ОЖИДАЕМЫЙ результат сдвига p на вектор [0]
        // x/y/z_actual_1 - ОЖИДАЕМЫЙ результат сдвига p на вектор [1]
        double x_expected_0 = 3; double x_expected_1 = 6;
        double y_expected_0 = -3; double y_expected_1 = 0;
        double z_expected_0 = 9; double z_expected_1 = 12;

        assertEquals(x_expected_0, x_actual_0); assertEquals(x_expected_1, x_actual_1);
        assertEquals(y_expected_0, y_actual_0); assertEquals(y_expected_1, y_actual_1);
        assertEquals(z_expected_0, z_actual_0); assertEquals(z_expected_1, z_actual_1);
    }
}