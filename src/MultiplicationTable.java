

import java.util.Scanner;

public class MultiplicationTable //created class to find out multiplication of table
{
    public static void main(String[] args)//main method
    {
        Scanner scanner = new Scanner(System.in);//object created and will be used for user's input
        System.out.println("Enter starting number :");//printing statement asking user to enter starting number
        int first = scanner.nextInt();//storing user's input
        System.out.println("Enter last number");//printing statement asking user to enter last  number
        int last = scanner.nextInt();//storing user's input
        int i;

        do {//using do while and for in for statement to do multiplication table
            for ( i = first; last >= i; i++)
            {
                System.out.println("");
                for (int j = 1;  10>=j; j++)
                {
                    System.out.print( " "+ i*j+" ");
                }
            }

        }while (i<=last);


    }

}
