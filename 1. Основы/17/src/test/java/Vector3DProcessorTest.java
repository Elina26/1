import static org.junit.jupiter.api.Assertions.*;

class Vector3DProcessorTest {

    @org.junit.jupiter.api.Test
    void addition() {
        //v = (1,2,3), u = (4,5,6)
        Vector3D v = new Vector3D(1,2,3);
        Vector3D u = new Vector3D(5,3,9);

        Vector3DProcessor vp = new Vector3DProcessor();
        Vector3D actual = vp.addition(v,u);

        //должно быть v - u = (6,5,12)
        double x_actual=actual.get_x(), y_actual=actual.get_y(), z_actual=actual.get_z();
        double x_expected=6, y_expected=5, z_expected=12;
        assertEquals(x_expected, x_actual);
        assertEquals(y_expected, y_actual);
        assertEquals(z_expected, z_actual);
    }

    @org.junit.jupiter.api.Test
    void subtraction() {
        //v = (1,2,3), u = (4,5,6)
        Vector3D v = new Vector3D(1,2,3);
        Vector3D u = new Vector3D(5,3,9);

        Vector3DProcessor vp = new Vector3DProcessor();

        //должно быть v - u = (-4,-1,6)
        Vector3D actual = vp.subtraction(v,u);
        double x_actual=actual.get_x(), y_actual=actual.get_y(), z_actual=actual.get_z();
        double x_expected=-4, y_expected=-1, z_expected=-6;
        assertEquals(x_expected, x_actual);
        assertEquals(y_expected, y_actual);
        assertEquals(z_expected, z_actual);
    }

    @org.junit.jupiter.api.Test
    void scalar_product() {
        //v = (1,2,3), u = (5,3,9)
        Vector3D v = new Vector3D(1,2,3);
        Vector3D u = new Vector3D(5,3,9);

        Vector3DProcessor vp = new Vector3DProcessor();

        //скалярное произведение (v,u) = 38
        double actual = vp.scalar_product(v,u);
        double expected = 38;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void cross_product() {
        //v = (1,2,3), u = (5,3,9)
        Vector3D v = new Vector3D(1,2,3);
        Vector3D u = new Vector3D(5,3,9);

        Vector3DProcessor vp = new Vector3DProcessor();

        //векторное произведение [v,u] = (9,6,-7)
        Vector3D actual = vp.cross_product(v,u);
        double x_actual=actual.get_x(), y_actual=actual.get_y(), z_actual=actual.get_z();
        double x_expected=9, y_expected=6, z_expected=-7;
        assertEquals(x_expected, x_actual);
        assertEquals(y_expected, y_actual);
        assertEquals(z_expected, z_actual);
    }

    @org.junit.jupiter.api.Test
    void collinear_test_1() {
        //v = (1,2,3), u = (5,3,9)
        Vector3D v = new Vector3D(1,2,3);
        Vector3D u = new Vector3D(5,3,9);

        Vector3DProcessor vp = new Vector3DProcessor();

        //метод collinear должен вернуть 1, т.к. v и u не коллинеарны
        int actual = vp.collinear(v,u);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void collinear_test_2() {
        //v = (1,2,3), u = (2,4,6)
        Vector3D v = new Vector3D(1,2,3);
        Vector3D u = new Vector3D(2,4,6);

        Vector3DProcessor vp = new Vector3DProcessor();

        //метод collinear должен вернуть 0, т.к. v и u коллинеарны
        int actual = vp.collinear(v,u);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void collinear_test_3() {
        //v = (0,0,0), u = (2,4,6)
        Vector3D v = new Vector3D(0,0,0);
        Vector3D u = new Vector3D(2,4,6);

        Vector3DProcessor vp = new Vector3DProcessor();

        //метод collinear должен вернуть 2, т.к. v - нулевой вектор => вопрос о коллинеарности некорректен
        int actual = vp.collinear(v,u);
        int expected = 2;
        assertEquals(expected, actual);
    }
}