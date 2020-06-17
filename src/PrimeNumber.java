import java.util.Scanner;

public class PrimeNumber //created class to find out the number user have input is prime number or not
{
    public static void main(String[] args)//main method
    {
        int a,b=0,flag=0;//local variable
        Scanner scanner = new Scanner(System.in);//object created and will be used for user's input
        System.out.println("Enter any number : ");////print statement asking user enter any number
        int num = scanner.nextInt();//storing user's input
        b=num/2;
        if(num==0||num==1)//using if else if statement
        {
            System.out.println(num+ "is not prime number");
        }
        else
            {
            for(a=2;a<b;a++)//using for loop statement
            {
                if(num%a==0)
                {
                    System.out.println(num+ " is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println(num+ " is prime number");
            }
        }
    }
}
