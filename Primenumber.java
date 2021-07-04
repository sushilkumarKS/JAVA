class Primenumber
{
 public static void main(String args[])
 {
	int i,j,count;
	System.out.println("The prime numbers till 50 are: \n");
	for (j=2;j<=50;j++)
	{
		count=0;
		for (i=2;i<j;i++)
		{
			if((j%i)==0)
			{
				count=1;
				break;
			}
		}
		if(count==0)
		{
			System.out.println(j);		 	
		}
	
	}
 }
}