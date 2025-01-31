import java.util.Scanner;
public class BellmanFord
{
	int n;
	int [][]a;
	int []d;
	int []p;
	int s;
	public final static int INFTY=999;
	BellmanFord()
	{
		this.n=n;
		a=new int [n][n];
		d=new int [n];
		p=new int [n];
	}
	void bellmanFord()
	{
		for(int i=0;i<n;i++)
		{
			d[i]=a[s][i];
			p[i]=a[s][i]==INFTY ? -1:s;
		}
		p[s]=-1;
		for(int i=0;i<n-1;i++)
		{
			for(int u=0;u<n;u++)
			{
				for(int v=0;v<n;v++)
				{
					if(d[v]>d[u]+a[u][v])
					{
						d[v]=d[u]+a[u][v];
						p[v]=u;
					}
				}
			}
		}
	}
	void input(Scanner scanner)
	{
		System.out.println("Enter G");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=scanner.nextInt();
				if(i!=j&&a[i][j]==0) a[i][j]=INFTY;
			}
		}
		System.out.println("Enter the source vertex");
		s=scanner.nextInt();
		scanner.close();
			}
		}
void path(int v)
{
	if(v==-1) return;
	path(p[v]);
	System.out.println("."+v);
	}
void output()
{
	
}