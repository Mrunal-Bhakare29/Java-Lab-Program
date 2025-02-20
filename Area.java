import java.util.*;
public class Area
{
double length,width,result;
void setDim()
{
System.out.println("Enter length and width of rectangle");
Scanner sc=new Scanner(System.in);
length=sc.nextDouble();
width=sc.nextDouble();
}
double getArea()
{
result=length*width;
return result;
}
public static void main(String args[])
{
 Area obj=new Area();
 obj.setDim();
 System.out.println("Area of Rectangle="+obj.getArea());
}
}