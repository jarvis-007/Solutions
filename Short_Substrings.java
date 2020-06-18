import java.io.*;
import java.util.*;
public class Main{
 
// https://codeforces.com/contest/1367/problem/A

public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    
    int t=sc.nextInt();
 
    while(t-->0)
    {
        String b=sc.next();
        int blen=b.length();
        if(blen==2)
            System.out.println(b);
        else
        {
            String ans="";
            ans+=b.charAt(0);
            for(int i=1;i<blen-1;i+=2)
            {
                ans+=b.charAt(i);
            }
            ans+=b.charAt(blen-1);
            System.out.println(ans);
        }
    }       
 
}
 
}
