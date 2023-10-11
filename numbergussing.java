package NumberGussingGame;
import java.util.Scanner;
public class Task1 
{

	public static void
	    main(String arg[])
	    {

	        numberguess();
	    }

	    public static void
	    numberguess()
	    {
	        try (Scanner sc = new Scanner(System.in)) {
				int number = 1 + (int)(100* Math.random());
				int K=5;
				int i, guess;
				System.out.println("Welcome to Guess Number Game\n"+
				        "You Will Be Asked To Guess A Number To win The Game\n"+
				     "You have Maximum Five Attemp Limit");
				for (i = 0; i < K; i++)
				{

				    System.out.println(
				            "Enter a guess number between 1 to 100:");
				    guess = sc.nextInt();
				    if (number == guess) {
				        System.out.println("OOhhOO!,correct.You win the Game!");
				        break;
				    }
				    else if (number > guess
				            && i != K - 1) {
				        System.out.println("number is Greater than "+ guess);
				    }
				    else if (number < guess
				            && i != K - 1) {
				        System.out.println("number is smaller than "+ guess);
				    }
				}

				if (i == K) {
				    System.out.println("You have exhausted  5 trials.\n The number was " + number);
				}
			}
	    }
	}