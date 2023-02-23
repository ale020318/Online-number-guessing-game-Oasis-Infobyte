import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class numbgus
{
	void numain()
	{
		Scanner sc = new Scanner(System.in);
		Random re = new Random();
		int num1 = re.nextInt(1, 100);
		int k = 6;
		int gus ;
		int i;
		System.out.println("Welcome to number guessing game ");
		System.out.println("********************************* ");
		System.out.println(" You have to guess one number  ");
		System.out.println("------------------- YOU HAVE 6 TRIALS TO GUESS THE NUMBER -----------------");
		System.out.println(" ENTER YOUR NAME ");
		String nam1;
		nam1 = sc.nextLine();
		System.out.println("READY !!!!!! ......LETS GOOOOOOOOOOO");
			
		int turn = 1;
		for (i  = 1; i <= k; i++) 
		{
			System.out.println(" Guess the number  !!!!!!!!!!!");
			gus = sc.nextInt();
			if (gus==num1)
			{
				System.out.println ("Congratulations!" + nam1 + " You guessed the number right .");
				System.out.println(" your score is " + (turn *100) +" well played ");
			}
			else if(gus<num1) 
			{
				System.out.println(" The number you have entered is less then the  number ");
			} 
			else 
			{
				System.out.println(" the number you haev entered is greater then the number  ");
			}
             
			if (i == k-5) 
			{
				System.out.println(" you have more 5 trials more to goo");
			} 
			else if(i == k-4)
			{
				System.out.println(" you have more 4 trials more to goo");
			}
			else if(i == k-3)
			{
				System.out.println(" you have more 3 trials more to goo");
			}
			else if(i == k-2)
			{
				System.out.println(" you have more 2 trials more to goo");
			}
			else if(i == k-1)
			{
				System.out.println(" you have more 1 trials more to goo");
				System.out.println(" This is your last try to guess the number ");
			}
			if (k==i && gus !=num1)
			{
				System.out.println(" opssss!!!!....... Sorry you have Miss this games this time ......Better luck next time ");
				System.out.println(" the number was " + num1);
			}
               turn = turn +1;

		}

		
			
		}


	}


public class nnumber
{
    public static void main(String[] args) 
	{
		numbgus li = new numbgus();
		li.numain();
    }
}








 
