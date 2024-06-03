import java.sql.SQLOutput;

public class Main {
  public static void main(String[] args) {
    System.out.println("\nHello");
    int ID = 412156; // final int ID = 412156; // here we have fixed that this int value won't be
                     // changed
    double cgpa = 3.7;// float cgpa = 3.7f
    String Name = "Zarif";
    boolean flag = true;
    char c = 'Z';
    // String ConCat

    String Name2 = "Hi";
    System.out.println("My Name is  " + Name + " " + Name2);
    String lengthCount = Name + Name2;
    System.out.println(Name.toUpperCase());
    System.out.println(Name.toLowerCase());
    System.out.println(Name.length());
    System.out.println(lengthCount.length());
    System.out.println(Math.max(100, 200));
    System.out.println(Math.random());
    System.out.println(Math.abs(-62.9));

    // Array

    int[] arr = { 1, 2, 3, 4, 5 };
    String[] str2 = { "Hello", " ", "there" };
    System.out.println(str2.length);
    // for(int i = 0;i < 5;i++)
    // {
    // System.out.println(arr[i]);
    // }
    // for each loop
    for (String s /* declared a new variable */ : str2 /* to print which variable */ ) {
      System.out.print(s);
      // System.out.println(s.toUpperCase());
    }
    System.out.println();
    String strNew = "Today's weather is very hot";
    System.out.println(strNew.indexOf("weather"));
  }
}

/*
 * Naming Convention
 * Variable -- camelcase(Like:- ageName,myName)
 * Method(Functions) -- camelcase(Like:- ageName,myName)
 * Class -- PascalCase(Like:- MyClass)
 * Package -- SnakeCase(Like:- my_package_name)
 * Constant Value -- SnakeCase(Like:- MIN_VALUE)
 */

/*
 * sHORTcUT
 * 
 * psvm - public static void main
 * sout - System.out.println
 * variable.to -- to convert the string variable to upper Or Lower Case
 * Math.max -- to calculate the maximum number
 * Math.abs -- to calculate the absolute value
 * Math.random -- to guess a random number
 * variable.indexOf -- at what indexed the string have been occured
 */
