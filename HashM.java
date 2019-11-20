package Hashing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;
public class HashM {
	public static void main(String args[])
	{
		Scanner o=new Scanner(System.in);
		System.out.println("Enter the number of key:value entries")
	    int t=o.nextInt();
	    HashMap<String,Integer> hm=new  HashMap<String, Integer>();
	    for(int i=0;i<t;i++)
	    {
	    	hm.put(o.next(),o.nextInt());
	    }
	    System.out.println(hm);
	    Integer value=o.nextInt();
	    if(hm.containsValue(value))
	    {
	   // ArrayList<String> al=new ArrayList<String>();
	    	for(String key : hm.keySet())
	    	{
	    		if(value.equals(hm.get(key)))
	    		{
	    		 // al.add(key);
	    			System.out.print(key+" ");
	    		}
	    	}
//	    	String[] str=al.toArray(new String[al.size()]);
//	    	Arrays.sort(str);
//	    	for(int i=0;i<str.length;i++)
//	    	{
//	    		System.out.println(str[i]);
//	    	}
	    }
	    else
	    {
	    	System.out.println("FALSE");
	    }
	}

}
