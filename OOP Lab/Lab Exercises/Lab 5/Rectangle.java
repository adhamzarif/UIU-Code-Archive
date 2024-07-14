package Lab6.Problem1;

class Rectangle extends Shape {
    Rectangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    @Override
    void printArea() {
        int area = dim1 * dim2;
        System.out.println("The area of the rectangle is: " + area);
    }
}
