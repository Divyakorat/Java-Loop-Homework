import java.util.Scanner;

public class SumOfDigit //created class to find sum of each digit
{
    public static void main(String[]args)//main method
    {
        Scanner scanner = new Scanner(System.in);//scanner object created and will be used to get input from user
        System.out.println("Enter five digit numbers :");//print statement asking user to enter number
        int number = scanner.nextInt();//storing user's input
        int a;//created variable
        int b = 0;
        if (number >= 10000 && number < 100000)//if number is less then five or more then five
        {
            while (number >= 1)//using while statement find out sum of the number
            {
                a = number % 10;
                b = a + b;
                number = number / 10;
            }
            System.out.println(b);
            }
        else
            {
            System.out.println("invalid entry");//print statement if user input more then five number of less then five number it should be invalid entry
            }
    }
}
