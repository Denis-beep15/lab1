package thirdblock;

public class Vector3DArray {
    private Vector3D[] array;

    public Vector3DArray() {
        array = new Vector3D[1];
        array[0] = new Vector3D();
    }

    public Vector3DArray(final int size) {
        if (size <= 0) {
        }
        array = new Vector3D[size];
        for (Vector3D vector1 : array) {
            vector1 = new Vector3D();
        }
    }

    public int vector1Length() {
        return array.length;
    }

    public void replacement(int i, Vector3D vector1) {
        array[i] = new Vector3D(vector1.getX(), vector1.getY(), vector1.getZ());
    }

    public double maxL() {
        double max = 0;
        double max1 = 0;
        for (Vector3D vector3D : array) {
            max1 = vector3D.length();
            if (max < max1) {
                max = max1;
            }
        }
        return max;
    }

    public int search(Vector3D vector1) {
        int search = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == vector1) {
                search = i;
            }
        }
        return search;
    }

    public Vector3D sum() {
        double x = 0;
        double y = 0;
        double z = 0;
        for (Vector3D vector1 : array) {
            x += vector1.getX();
            y += vector1.getY();
            z += vector1.getZ();
        }
        return new Vector3D(x, y, z);
    }

    public Vector3D linKom(double[] coeff) {
        double x = 0;
        double y = 0;
        double z = 0;
        for (int i = 0; i <= array.length; i++) {
            x += coeff[i] * array[i].getX();
            y += coeff[i] * array[i].getY();
            z += coeff[i] * array[i].getZ();
        }
        return new Vector3D(x, y, z);
    }

    public Point3D[] arrShift(Point3D shift) {
        double x = 0;
        double y = 0;
        double z = 0;
        Point3D[] arrShift = new Point3D[array.length];
        for (int i = 0; i <= array.length; i++) {
            x = shift.getX() + array[i].getX();
            y = shift.getY() + array[i].getY();
            z = shift.getZ() + array[i].getZ();
            arrShift[i] = new Point3D(x, y, z);
        }
        return arrShift;
    }
}
