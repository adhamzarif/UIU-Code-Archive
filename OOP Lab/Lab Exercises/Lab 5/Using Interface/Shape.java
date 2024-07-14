package Lab6.Problem1;

abstract class Shape implements ShapeInterface {
    int dim1;
    int dim2;

    Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
}
