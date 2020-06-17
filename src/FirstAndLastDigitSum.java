import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class FirstAndLastDigitSum
{
    public static void main(String[] args)
    {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter any five digit number");//print statement asking user to enter number
        int num = scanner.nextInt();//storing user's input
        int sum=0;
        int firstdigit;
        int lastdigit;
        lastdigit=num%10;//finding last digit of sum
        firstdigit=num;//coping number to firstdigit
        if (num >= 10000 && num < 100000)//if number is less then five or more then five
        {

            while (num >= 10)//finding the last digit by dividing num by 10 until first digit is left
            {
                num = num / 10;
            }
            firstdigit = num;
            sum = firstdigit + lastdigit;//calculating sum
            System.out.println("sum of first and last digit =" + sum);//print statement for sum of first and last digit
        }
             else
            {
                System.out.println("invalid entry");//print statement if user input more then five number of less then five number it should be invalid entry
            }



    }
}
