import java.io.*;
import java.util.*;
public class Main{

//https://codeforces.com/contest/1367/problem/C
//Social Distance

public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    
    int t=sc.nextInt();

    while(t-->0)
    {
        int n=sc.nextInt();
        int k=sc.nextInt();
        String state=sc.next();
        char res[]=state.toCharArray();
        //System.out.println("res"+res.length);
        int nexttable[]=new int[n];
        int fill=-1;
        for(int i=n-1;i>=0;i--)
        {
            if(res[i]=='1')
                fill=i;
            nexttable[i]=fill;
        }
        int prev=-1;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(res[i]=='0' && (i-prev-1>=k || prev==-1) && (nexttable[i]-i-1>=k || nexttable[i]==-1) )
            {
                count++;
               // System.out.println("at= "+i);
                res[i]='1';
            }
            if(res[i]=='1')
                prev=i;
        }
        System.out.println(count);
    }       

}

}

