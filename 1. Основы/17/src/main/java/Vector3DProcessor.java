public class Vector3DProcessor {

    /*Метод складывает 2 вектора.
     * Входные данные: вектора v и u типа Vector3D - слагаемые.
     * Выходные данные: вектор res - сумма v и u.*/
    public Vector3D addition(Vector3D v, Vector3D u) {
        Vector3D res = new Vector3D();
        res.set_x(v.get_x() + u.get_x());
        res.set_y(v.get_y() + u.get_y());
        res.set_z(v.get_z() + u.get_z());
        return res;
    }


    /*Метод считает разницу между 2-мя векторами.
     * Входные данные: вектора v и u типа Vector3D, v - уменьшаемое, u - вычитаемое.
     * Выходные данные: вектор res - разность v и u.*/
    public Vector3D subtraction(Vector3D v, Vector3D u) {
        Vector3D res = new Vector3D();
        res.set_x(v.get_x() - u.get_x());
        res.set_y(v.get_y() - u.get_y());
        res.set_z(v.get_z() - u.get_z());
        return res;
    }


    /*Метод считает скалярное произведение.
     * Входные данные: вектора v и u типа Vector3D.
     * Выходные данные: метод возвращает скалярное произведение v на u типа double.*/
    public double scalar_product(Vector3D v, Vector3D u) {
        return v.get_x()*u.get_x() + v.get_y()*u.get_y() + v.get_z()*u.get_z();
    }


    /*Метод считает векторное произведение.
     * Входные данные: вектора v и u типа Vector3D.
     * Выходные данные: вектор res типа Vector3D - векторное произведение v на u.*/
    public Vector3D cross_product(Vector3D v, Vector3D u) {
        Vector3D res = new Vector3D();
        res.set_x(v.get_y()*u.get_z() - v.get_z()*u.get_y());
        res.set_y(-(v.get_x()*u.get_z() - v.get_z()*u.get_x()));
        res.set_z(v.get_x()*u.get_y() - v.get_y()*u.get_x());
        return res;
    }


    /*Метод проверяет 2 вектора на коллинеарность.
     * Входные данные: вектора v и u типа Vector3D.
     * Выходные данные: 0 - вектора коллинеарны.
     *                  1 - вектора не коллинеарны.
     *                  2 - один или оба вектора нулевые, вопрос о коллинеарности векторов некорректен.*/
    public int collinear(Vector3D v, Vector3D u) {
        if ((v.get_x() == 0) && (v.get_y() == 0) && (v.get_z() == 0)) {
            return 2;
        } else if ((u.get_x() == 0) && (u.get_y() == 0) && (u.get_z() == 0)) {
            return 2;
        } else if ((v.get_x() != 0) && (v.get_y() != 0) && (v.get_z() != 0) && (u.get_x() != 0) && (u.get_y() != 0) && (u.get_z() != 0)) {
            double a = v.get_x() / u.get_x();
            double b = v.get_y() / u.get_y();
            double c = v.get_z() / u.get_z();
            if ((a!=b)||(a!=c)||(b!=c)) { return 1; }
            else { return 0; }

        } else {
            double a, b;
            if (v.get_x()!=0) {
                a = v.get_x();
                b = u.get_x();
            } else if (v.get_y()!=0) {
                a = v.get_y();
                b = u.get_y();
            } else {
                a = v.get_z();
                b = u.get_z();
            }
            double n = b / a;
            if ((n*v.get_x()!=u.get_x())||(n*v.get_y()!=u.get_y())||(n*v.get_z()!=u.get_z())) { return 1; }
            else { return 0; }
        }
    }
}