package Problem1;

public class Main {
    public static void main(String[] args) {
        Point2D point1 = new Point2D(13,13);
        Point2D point2 = new Point2D(19,19);
        System.out.println(point1.findEuclidean(point2));

        Point3D point3 = new Point3D(13,13,13);
        Point3D point4 = new Point3D(19,19,19);
        System.out.println(point3.findEuclidean(point4));

        Rectangle rect = new Rectangle(13,13);
        System.out.println(rect.findPerimeter());
        System.out.println(rect.findArea());

        Circle circle = new Circle(13);
        System.out.println(circle.findPerimeter());
        System.out.println(circle.findArea());

        Cuboid cuboid = new Cuboid(13, 13, 13);
        System.out.println(cuboid.getVolume());

        Sphere sphere = new Sphere(13);
        System.out.println(sphere.getVolume());
    }
}
