import java.io.*;
import java.util.*;
public class Main{

//https://codeforces.com/contest/1367/problem/B
//Even Array

public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    
    int t=sc.nextInt();

    while(t-->0)
    {
        int n=sc.nextInt();
        int nums[]=new int[n];
        int even_mismatch=0;
        int odd_mismatch=0;
        for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
        for(int i=0;i<n;i++) 
        {
            if(i%2==0)
            {
                if(nums[i]%2!=0)
                    even_mismatch++;
            }
            else
            {
                if(nums[i]%2==0)
                    odd_mismatch++;
            }
        }
        if(even_mismatch==0 && odd_mismatch==0)
            System.out.println(0);
        else if(even_mismatch==odd_mismatch)
            System.out.println(even_mismatch);
        else
            System.out.println(-1);
    }       

}

}

