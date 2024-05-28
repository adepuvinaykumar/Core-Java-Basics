import java.util.*;
class Input
{
	public static void main(String args[])
	{
		System.out.println("please enter your age:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Please enter your name:");
		String b=sc.next();
		sc.close();
		if(a>=18)
		{
			System.out.println("Hi "+b+ " Welcome to the show");
			
		}
			else
			{
				System.out.println("Hi " +b+ " You are not allowed to the show");
			}
	}
}