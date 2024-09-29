package User_Defined_Exception;

class NewException extends Exception
{
    public NewException(String message) {
        super(message);
    }
}
class Student
{
    int ID = 131;
    void getID() throws NewException
    {
        if(ID % 5 == 0)
        {
                throw new NewException("This ID is divisible by 5");
        }
        System.out.println("This is a valid ID!!");
    }
}

public class Main
{
    public static void main(String[] args) {
        try
        {
            Student sc = new Student();
            sc.getID();
        }
        catch(Exception e) // User_Defined_Exception.NewException e
        {
            System.out.println("Exception Found: " + e.getMessage());
        }
    }
}