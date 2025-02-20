import java.util.*;
public class PrimeNo
{
public static void main(String args[])
{
 int n,count=0;
 if(args.length==0)
 {
 System.out.println("No any parameters passed");
  }
  else
  {
  n=Integer.parseInt(args[0]);
  for(int i=2;i<n;i++)
  {
	  if(n%i==0)
	  {
		  count++;
	  }
	  
  }
  
  if(count==0)
  {
	  System.out.println("Prime No");
  }
  else{
	  System.out.println("Not a Prime No");
  }
}
}
}