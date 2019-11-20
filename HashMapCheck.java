package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapCheck {
public static void main(String args[])
{
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	Scanner o=new Scanner(System.in);
	System.out.println("Enter test cases");
	int t=o.nextInt();
	System.out.println("Enter Boarding number and Person Name ");
    for(int i=0;i<t;i++)
    {  Integer num=o.nextInt();
       String name=o.next();
    	if(hm.containsKey(num))
    	{
    		System.out.println("Duplicate");
    		
    
    	}
    	else
    	{   hm.put(num,name);
    	System.out.println("Checked");
    		
    	}
    }
    System.out.println(hm);
}
}
