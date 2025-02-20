import java.util.*;
public class Sort
{
public static void main(String args[])
{
 int arr[]=new int[10];
 int i;
 System.out.println("Enter array elements");
 Scanner sc=new Scanner(System.in);
 for(i=0;i<10;i++)
 {
  arr[i]=sc.nextInt();
 }
 int small;
  for(i=0;i<10;i++)
 {
 for(int j=0;j<10;j++)
 {
   if(arr[i]<arr[j])
   {
     small=arr[i];
	 arr[i]=arr[j];
	 arr[j]=small;
     
  }
 }
 }
 System.out.println("Sorted Array=");
  for(i=0;i<10;i++)
 {
  System.out.println(arr[i]);
 }
}
}