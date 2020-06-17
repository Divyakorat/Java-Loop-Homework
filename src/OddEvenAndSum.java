import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class OddEvenAndSum //created class to find out odd,even and sum of them
{
    public static void main(String[] args) //main method
    {
        Scanner scanner = new Scanner(System.in);//object created and will be used to input user's input
        System.out.println("Enter any five digit number");//print statement asking user to input
        int number = scanner.nextInt();//storing user's input
        int odd = 0;
        int even = 0;
        int sumeven = 0;
        int sumodd = 0;
        if (number >= 10000 && number < 100000)//if number is less then five or more then five
        {
            while (number >= 1)//using while loop statement
            {

                int a = number % 10;
                int b = number % 2;

                if (b == 0)
                {
                    sumeven = sumeven + a;
                    even++;
                } else {
                    sumodd = sumodd + a;
                    odd++;
                }
                    number = number / 10;
                }
                System.out.println("sum of odd no are : " + sumodd);//printing statement sum of the odd number

                System.out.println("number of odd are :" + odd);//printing statement number of the odd number
                System.out.println("sum of even no are : " + sumeven);//printing statement sum of the even number
                System.out.println("number of even are : " + even);//printing statement number of the even number
            }
            else
                {
                System.out.println("invalid entry");//print statement if user input more then five number of less then five number it should be invalid entry
            }

        }
    }


