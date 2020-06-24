import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		
		for(int t=1;t<=test;t++)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			int visited[]=new int[n+1];
			int color[]=new int[n+1];
			Map<Integer,List<Integer>> al=new HashMap<>();
			for(int i=1;i<=n;i++)
				al.put(i,new ArrayList<Integer>());
			for(int i=0;i<m;i++)
			{
				int u=sc.nextInt();
				int v=sc.nextInt();
				al.get(u).add(v);
				al.get(v).add(u);
			}
			boolean ans=true;
			for(int i=1;i<=n;i++)
			{
				if(visited[i]==0)
				{
					boolean ca=check(i,0,al,visited,color);
					if(ca==false)
						ans=false;
				}
			}
			
			System.out.println("Scenario #"+t+":");
			
			if(ans==false)
			{
				System.out.println("Suspicious bugs found!");
			}
			else
			{
				System.out.println("No suspicious bugs found!");
			}
		}
	}
	public static boolean check(int v,int c,Map<Integer,List<Integer>> al,int visited[],int color[])
	{
		visited[v]=1;
		color[v]=c;
		//System.out.println("trace "+v+" "+color[v]);
		for(int node:al.get(v))
		{
			if(visited[node]==0)
			{
				c=c^1;
				boolean ans=check(node,c,al,visited,color);
				if(ans==false)
					return false;
			}
			else
			{
		//		System.out.println("tr "+v+" "+color[v]+" "+node+" "+color[node]);
				if(color[v]==color[node])
					return false;
			}
		}
		return true;
	}
}
