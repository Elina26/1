import static org.junit.jupiter.api.Assertions.*;

class Vector3DTest {

    @org.junit.jupiter.api.Test
    void length() {
        //v = (1,2,3)
        Vector3D v = new Vector3D(1,2,3);

        //длина v равна sqrt(14) = 3.7416573867739413;
        double actual = v.length();
        double expected = 3.7416573867739413;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testEquals_1() {
        //v = (1,2,3), u = (1,2,3)
        Vector3D v = new Vector3D(1,2,3);
        Vector3D u = new Vector3D(1,2,3);

        //метод equals должен вернуть true, т.к. v = u
        boolean actual = v.equals(u);
        assertTrue(actual);
    }

    @org.junit.jupiter.api.Test
    void testEquals_2() {
        //v = (1,2,3), u = (0,0,0)
        Vector3D v = new Vector3D(1,2,3);
        Vector3D u = new Vector3D(0,0,0);

        //метод equals должен вернуть false, т.к. v != u
        boolean actual = v.equals(u);
        assertFalse(actual);
    }
}