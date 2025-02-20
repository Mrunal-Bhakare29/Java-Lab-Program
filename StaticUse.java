import java.util.*;
public class StaticUse
{
static int count=0;
static String name="Mrunal";

void increment()
{
 count++;
 System.out.println(count);
}
static void display()
{
	System.out.println(name);
}
static
{
	System.out.println("Static block executed");
}

public static void main(String args[])
{
 StaticUse obj=new StaticUse();
 obj.increment();
 obj.increment();
 StaticUse.display();
 StaticUse.count=0;
 StaticUse.name="Madhura";
 StaticUse.display();
 obj.increment();
 StaticUse obj1=new StaticUse();
 obj1.increment();
  StaticUse.display();

}
}