import java.util.Scanner;

public class ReverseNumber //created class to reverse number
{

    public static void main (String[]args)//main method
    {
        int num = 0;
        int rev = 0;
        Scanner scanner = new Scanner(System.in);//object created and will be used for user,s input
        System.out.println("Enter any five digit number : ");//printing statement asking user to enter any five digit number
         num = scanner.nextInt();//storing user's input
        if (num >= 10000 && num < 100000)//if number is less then five or more then five
        {

            while (num != 0) //using while loop statement
            {
                rev = rev * 10;
                rev = rev + num % 10;
                num = num / 10;
            }

            System.out.println("Reverse of input number is :" + rev);//print statement reverse the number
        }
            else
            {
                System.out.println("invalid entry");//print statement if user input more then five number of less then five number it should be invalid entry
            }


    }
}
