import java.util.Scanner;

public class Palindrome//created class to find out the nunber is palindore number or not
{
    public static void main (String[]args)//main method
    {
        int a,sum = 0,temp;//local variable
        Scanner scanner = new Scanner(System.in);//created object and will be used to store  user's input
        System.out.println("Enter any number : ");//printing statement asking user to enter any number
        int num = scanner.nextInt();//storing user's input
        temp = num;
        while (num > 0)//using while statement
        {
            a =num%10;
            sum = (sum*10)+a;
            num=num/10;
        }
        if (temp==sum)//using if else statement
            System.out.println("The number you have enter is : Palindrome number");//printing statement number is palindrome number
        else
            System.out.println("The number you have enter is : Not palindrome number");//[rinting statement number is not palindrome
    }

}
