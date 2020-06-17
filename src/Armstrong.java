import java.util.Scanner;

public class Armstrong//created class to find out the number is armstrong or not
{
    public static void main(String[] args) //main method
    {
        int a =0,b,temp;//creating variable
        Scanner scanner =new Scanner(System.in);//object created and will be used to store user's input
        System.out.println("Enter any number");//print statement asking user to Enter any number
        int num = scanner.nextInt();//storing user's input
        temp = num;
        while (num>0)//using while statement to check the number is armstrong or not
        {
            b=num%10;
            num=num/10;
            a=a+(b*b*b);
        }
        if(temp==a)//using if else statement
            System.out.println("The number you have entered is : Armstrong number");//printing statement number is armstrong number
        else
            System.out.println("The number you have entered is : not Armstrong number");//printing statement number is not armstrong number


    }

}
