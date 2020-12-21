package thirdblock;

import java.util.Objects;

public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D() {
    }

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D(Point3D point1, Point3D point2) {
        this.x = point1.getX() - point2.getX();
        this.y = point1.getY() - point2.getY();
        this.z = point1.getZ() - point2.getZ();
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double length() {
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }

    public boolean vectorEqual(Vector3D vector) {
        return (Double.compare(x, vector.getX()) == 0 && Double.compare(y, vector.getY()) == 0 && Double.compare(z, vector.getZ()) == 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3D vector3D = (Vector3D) o;
        return Double.compare(vector3D.x, x) == 0 && Double.compare(vector3D.y, y) == 0 && Double.compare(vector3D.z, z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
