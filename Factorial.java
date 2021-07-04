import java.util.*;
class Factorial
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int fact=1,i,number;
		number = sc.nextInt();
		for(i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of "+ number +" is: "+ fact);
	}
 
}