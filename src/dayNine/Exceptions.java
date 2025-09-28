package dayNine;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) throws IOException {
//        String [] names = {"Java","Python","C++"};
//        for (int i = 0; i < 4; i++)
//        {
//            System.out.println(names[i]);
//            // ArrayIndexOutOfBoundsException
//        }
        //readFileWithTryCatch();
 //        createFile();
       // createFileRethrow();
        CustomException();
    }

    //An exception is an event that occurs during program execution that disrupts the normal flow of instructions.
       /*
                Object
                   ↑
                Throwable
                 /    \
            Error      Exception
                       /       \
                 Checked       RuntimeException
                Exceptions         (Unchecked)
       */

    /*
    Type	    Examples	                            Handling Required?
    Errors	  OutOfMemoryError, StackOverflowError	No (typically fatal)
    CheckedExceptions	IOException, SQLException	Yes (compile-time check)
    UncheckedExceptions	NullPointerException, ArrayIndexOutOfBoundsException	No (runtime)
     */

    public static void readFile() throws IOException
    {
        FileInputStream file = new FileInputStream("grades.txt");
        System.out.println(file.read());
    }

    public static void readFileWithTryCatch() throws FileNotFoundException {
        FileInputStream file = new FileInputStream("grades.txt");
        try{
            System.out.println(file.read());
        }
        catch(IOException e)
        {
            e.getMessage();
        }
    }

    //Unchecked Exceptions (Runtime)
    public static void divideNumbers(int a, int b)
    {
        if(a==b)
        {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        else
        {
            System.out.println(a/b);
        }
    }

    public static void createFile(){
        File file = new File("resources/grades.txt");
        try{
            file.createNewFile();
        } catch (IOException e){
            System.out.println("Path not found");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Hello after exception");
    }

    public static void createFileRethrow() throws IOException {
        File file = new File("resources/grades.txt");
        file.createNewFile();
    }

    public static void CustomException()
    {
        File file = new File("resources/grades.txt");
       try(Scanner scanner = new Scanner(file)){
           while(scanner.hasNext())
           {
               double grade = scanner.nextDouble();
               System.out.println(grade);
           }
       }
       catch (FileNotFoundException | InputMismatchException e)
       {
           e.printStackTrace();
       }
       finally {
              System.out.println("Execution completed");
       }
    }

}
