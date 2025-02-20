import java.util.*;
public class Stack
{
int arr[]=new int[5];
 int i=0;
int val;

Scanner sc=new Scanner(System.in);

 public void push()
 {
  if(i<5)
  {
  System.out.println("Enter value to push in stack");
  val=sc.nextInt();
  arr[i]=val;
  i++;
 }
 else{
   System.out.println("Stack is Full");
 }
 }
 
 public void pop()
 {
  if(i>0)
  {
   arr=Arrays.copyOf(arr,i-1);
   i--;
   System.out.println("Element Poped");
 }
 else{
   System.out.println("Stack is Empty");
 }
 }
  public void display()
 {
	 for(int j=0;j<i;j++)
	 {
		System.out.println(arr[j]);
	 }
 }
public static void main(String args[])
{

 Stack obj=new Stack();
 boolean b=true;
 Scanner sc=new Scanner(System.in);

 do{
 System.out.println("Enter 1:Push Element\n 2:Pop Element\n 3:Display Element\n");
 int ch=sc.nextInt();

 switch(ch)
 {
  case 1:
   obj.push();
   break;
  case 2:
   obj.pop();
   break;
  case 3:
   obj.display();
   break;
   default:
   System.out.println("Invalid Choice");
 }
  System.out.println("Do you want to perform push and pop operation??Y/N");
  char y=sc.next().charAt(0);
 if('Y'==y || 'y'==y)
 {
	 b=true;
 }
 else{
     b=false;
 }
 }while(b);
 
}
}