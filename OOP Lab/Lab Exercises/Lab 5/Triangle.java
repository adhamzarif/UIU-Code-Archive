package Lab6.Problem1;

class Triangle extends Shape {
    Triangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    @Override
    void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("The area of the triangle is: " + area);
    }
}
