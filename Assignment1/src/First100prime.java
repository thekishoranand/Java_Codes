public class First100prime 
{
public static void main(String[] args)
{
		
     int c = 0,n=0, i=1,j=1;
		while(n<25)
		{
		c = 0;
		j=1;
		while(j<=i)
		{
			if(i%j==0)
				c++;
				j++;
			}
			if(c==2)
			{
				System.out.printf("%d",i);
				n++;
			}
			i++;
	}

}
}

