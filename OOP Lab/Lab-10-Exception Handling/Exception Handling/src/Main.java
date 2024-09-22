//class SampleException extends Exception{
//    public SampleException(String errorMessage) {
//        super(errorMessage);
//    }
//}
//
//class Calculation{
//    int Div(int a, int b){
//        try {
//
//            System.out.println("Line1");
////            int div = a/b;
//            int[] arr = new int[2];
//            System.out.println(arr[2]);
//            return 1;
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//            return -1;
//        }
//    }
//
//    void testCustomException() throws SampleException{
//        throw new SampleException("There is an error!! ");
//    }
//
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Calculation c = new Calculation();
//        System.out.println(c.Div(10,0));
//        try {
//            c.testCustomException();
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//    }
//}



class SampleException extends Exception{
    public SampleException(String errorMessage) {
        super(errorMessage);
    }
}

class Calculation{
    int Div(int a, int b){
        try {

            System.out.println("Line1");
//            int div = a/b;
            int[] arr = new int[2];
            System.out.println(arr[2]);
            return 1;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return -1;
        }
    }

    int testCustomException(int a) throws SampleException {
        if (a == 10) {
            throw new SampleException("There is an error!! ");
        } else {
            return a * 10;
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Calculation c = new Calculation();
        System.out.println(c.Div(10,0));
        try {
            System.out.println( c.testCustomException(2));;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

