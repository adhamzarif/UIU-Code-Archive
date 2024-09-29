package Problem2;

class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }
}
class Product {
    void productCheck(int weight) throws MyException{
        if(weight <= 100){
            throw new MyException("Product is invalid");
        }
        else
        {
            System.out.println("Weight is: " + weight);
        }
    }
}
public class Main {

    public static void main(String[] args) {
        Product s = new Product();
        try {
            s.productCheck(101);
        }catch (MyException e){
            System.out.printf("Exception: " + e.getMessage());
        }
    }
}
