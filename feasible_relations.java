import java.util.*;
import java.io.*;
class TestClass {

    static class ed
    {
        int u;
        int v;
        ed(int u,int v)
        {
            this.u=u;
            this.v=v;
        }
    }

     static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
    static int visited[]=new int[1000009];
    static int grp[]=new int[1000009];
    static Map<Integer,List<Integer>> graph=new HashMap<>();
    
    public static void main(String args[] ) throws Exception {
      
        FastReader sc=new FastReader();
        
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            
            for(int i=1;i<=n;i++)
            {
                //graph.get(i).clear();
                graph.put(i,new ArrayList<Integer>());
                visited[i]=0;
                grp[i]=0;
            }
                
            List<ed> ne=new ArrayList<>();
            for(int i=1;i<=m;i++)
            {
                int u=sc.nextInt();
                String e=sc.next();
                int v=sc.nextInt();
                if(e.equals("="))
                {
                    graph.get(u).add(v);
                    graph.get(v).add(u);
                }
                else
                {
                    ne.add(new ed(u,v));
                }
            }
            int count=1;
            for(int i=1;i<=n;i++)
            {
                if(visited[i]==0)
                {
                    dfs(i,count);
                    count++;
                }
            }
            int bf=0;
            for(ed temp:ne)
            {
                if(grp[temp.u]==grp[temp.v])
                {
                    bf=1;
                    break;
                }
            }
            if(bf==1)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
    public static void dfs(int v,int g)
    {
        visited[v]=1;
        grp[v]=g;
        for(int node:graph.get(v))
        {
            if(visited[node]==0)
            {
                dfs(node,g);
            }
        }
        return;
    }
}
