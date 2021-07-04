import java.util.*;
class Primeno
{
  public static void main(String [] args)
  {
	Scanner sc =  new Scanner(System.in);  
	int number,i,count=0 ;
	number = sc.nextInt();
	
	for(i=2;i<number;i++)
	{
		if((i%number)==0)
		{
			count++;
			break;
		}
	}	
	if(count==1)
	{
		System.out.println("Not prime");
	}
	else
	{
		System.out.println("Prime !");	
	}
	sc.close();
  }
}