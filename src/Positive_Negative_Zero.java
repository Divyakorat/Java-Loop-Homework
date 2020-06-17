import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Scanner;

public class Positive_Negative_Zero //created class to find out positive negative zero and total of them
{
    public static void main (String[]args)//main method
    {
        Scanner scanner = new Scanner(System.in);//object created and will be used for user's input

        int number,
            positive = 0,
            negative=0,
            zero = 0;
        char choice;
        do {//using do while statement
            System.out.println("Enter the number : ");//printing statement asking user to enter the number
             number = scanner.nextInt();//storing user's input
            if (number > 0)//using if else if statement(if number is greater then 0)
            {
                positive++;//number is positive
            } else if (number < 0)//else if number is less then 0
            {
                negative++;//number is negative
            }
            else {
                zero++;//zero number
            }
            System.out.println("Do you want to continue(y/n)? ");//printing statement asking user to continue yes or no
              choice = scanner.next().charAt(0);//storing user's answer

        }while(choice == 'y' || choice == 'y');//when user enter y or n
        System.out.println("positive number = " + positive);//total of positive number have user input
        System.out.println("negative number =" + negative);//total of negative number have user input
        System.out.println("zero=" + zero );//total of zero have user input
    }
}
