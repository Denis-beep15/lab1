package thirdblock;

public class Vector3DProcessor {
    public Vector3D Sum(Vector3D vector1, Vector3D vector2) {
        return new Vector3D(vector1.getX() + vector2.getX(), vector1.getY() + vector2.getY(), vector1.getZ() + vector2.getZ());
    }

    public Vector3D Difference(Vector3D vector1, Vector3D vector2) {
        return new Vector3D(vector1.getX() - vector2.getX(), vector1.getY() - vector2.getY(), vector1.getZ() - vector2.getZ());
    }

    public static double Scalar(Vector3D vector1, Vector3D vector2) {
        return (vector1.getX() * vector2.getX() + vector1.getY() * vector2.getY() + vector1.getZ() * vector2.getZ());
    }

    public Vector3D Vector(Vector3D vector1, Vector3D vector2) {
        return new Vector3D(vector1.getY() * vector2.getZ() - vector1.getZ() * vector2.getY(), vector1.getZ() * vector2.getX() - vector1.getX() * vector2.getZ(), vector1.getX() * vector2.getY() - vector1.getY() * vector2.getX());
    }
}
