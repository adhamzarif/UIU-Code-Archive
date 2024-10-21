package Question5.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getSum() {
        return x + y;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(1, 2));
        points.add(new Point(3, 4));
        points.add(new Point(5, 6));

        Collections.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                if (p1.getSum() > p2.getSum()) {
                    return -1;
                } else if (p1.getSum() < p2.getSum()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        for (Point p : points) {
            System.out.println("Point: (" + p.x + ", " + p.y + ")");
        }
    }
}

