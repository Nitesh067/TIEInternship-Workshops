import java.util.*;
public class LeakyBucket
{
	int burst;
	int rate;
	int size;
	int incoming;
	int overflow;
	int pending;
	int outgoing;
	LeakyBucket()
	{
		incoming=0;
		pending=0;
		overflow=0;
		outgoing=0;
	}
	void LeakyBucket()
	{
		System.out.println("Time incoming pending overflow outgoing");
		Random rand=new Random();
		int time=0;
		while(time<8)
		{
			incoming=rand.nextInt(burst);
			if((pending+incoming)>size)
			{
				overflow=(pending+incoming)-size;
				pending=size;
			}
			else { 
				overflow=0; 
				pending+=incoming;
			}
			output(time,incoming,pending,overflow,outgoing);
			outgoing=Math.min(rate,pending);
			pending-=outgoing;
			incoming=0;
			++time;
		}
	}
	void input()
	{
		Scanner scanner=new Scanner(System.in);
				System.out.println("Enter the burst size");
		burst=scanner.nextInt();
		System.out.println("Enter the Bucket size");
		size=scanner.nextInt();
		System.out.println("Enter the rate");
		rate=scanner.nextInt();
		scanner.close();
	}
	void output(int time,int incoming,int pending,int overflow,int outgoing)
	{
		System.out.printf("%d\t%d\t%d\t%d\t%d\n",time,incoming,pending,overflow,outgoing);
	}
	public static void main(String[] agrs)
	{
		LeakyBucket lb=new LeakyBucket();
		lb.input();
		lb.LeakyBucket();
	}
}