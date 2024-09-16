package Problem1;

public class Point3D extends Point2D {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    // Not overriding findEuclidean from Point2D, but providing a new version for 3D points
    public double findEuclidean(Point3D point) {
        int dx = this.getX() - point.getX();
        int dy = this.getY() - point.getY();
        int dz = this.z - point.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}


