package StudentGradeCalculator;
import java.util.Scanner;
public class Task2 {

public static void main(String[] args)
	{
		try (Scanner obj = new Scanner(System.in)) 
		{
			int []marks =new int[100];
			int sub,total=0;
			float per;
			System.out.println("Enter Total Subject:");
			sub=obj.nextInt();
			System.out.println("Enter marks of all subject one by one(out of 100)");
			for (int i=0;i<sub;i++)
			{
				marks[i]=obj.nextInt();
			}
			for( int i=0;i<sub;i++)
			{
				total=total+marks[i];
			}
			per=(total/sub);
			System.out.println("Total Marks="+total);
			System.out.println("\nAverage Percentage="+per+"%\n");
			if(per<40)
			{
				System.out.println("Grade= F");
			}

			else if(per>=40 && per<50)
			{
				System.out.println("Grade= C");
			}

			else if(per>=50 && per<60)
			{
				System.out.println("Grade= B");
			}

			else if(per>=60 && per<70)
			{
				System.out.println("Grade= A");
			}

			else if(per>=70 && per<80)
			{
				System.out.println("Grade= A+");
			}

			else
			{
				System.out.println("Grade= O");
			}
		}


	}

}