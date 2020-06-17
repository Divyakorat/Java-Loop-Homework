import java.util.Scanner;

public class PositiveInteger//created class to find out of positive integer
{
    public static void main(String[] args)//main method
    {
        Scanner scanner=new Scanner(System.in);//object created and will be used for user's input
        System.out.println("Enter the number(Table to be calculated) : ");//print statement asking user to enter the number
        int num=scanner.nextInt();//storng user's input

        for ( int a = 1;a<=10;a++)//using for loop statement
        {

            System.out.println(num+ " X "+a+" = " +num*a);//printing statement to print positive integer
        }
    }
}
