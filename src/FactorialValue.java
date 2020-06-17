import java.util.Scanner;

public class FactorialValue //created class to find out factorial value
{
    public static void main(String[] args) //main method
    {
        Scanner scanner = new Scanner(System.in);//object created and will be used for user's input
        System.out.println("Enter any number through keybord :");//printing statement asking user to enter number
        int num = scanner.nextInt();//storing user's input
        int fact = 1;//
        int i;//local variable
        for(i=1;i<=num;i++)//using for loop statemenet to find factorial value
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is = " +fact);//printing statement foe result

    }
}
