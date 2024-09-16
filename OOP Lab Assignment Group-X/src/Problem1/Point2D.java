package Problem1;

public class Point2D {
    private int x;
    private int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double findEuclidean(Point2D point) {
        int dx = this.x - point.getX();
        int dy = this.y - point.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}

