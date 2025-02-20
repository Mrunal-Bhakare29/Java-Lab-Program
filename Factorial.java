import java.util.Scanner;
public class Factorial
{
 public static void main(String []args)
 {
 
 int factorial=1;
 int num;

 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Number");
 num=sc.nextInt();
 for(int i=1;i<=num;i++)
 {
	 factorial=factorial*i;
 }
 System.out.println("factorial of"+ num +"is"+factorial);
 }
 }