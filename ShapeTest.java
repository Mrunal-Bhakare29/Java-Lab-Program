import java.util.Scanner;

interface Shape {
    double area();
}


class Rectangle implements Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    public double area() {
        return length * breadth;
    }
}

class Triangle implements Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

   
    public double area() {
        return 0.5 * base * height;
    }
}


public class ShapeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter length of Rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of Rectangle: ");
        double breadth = sc.nextDouble();

        System.out.print("Enter base of Triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of Triangle: ");
        double height = sc.nextDouble();

        
        Shape rectangle = new Rectangle(length, breadth);
        Shape triangle = new Triangle(base, height);

      
        System.out.println("\nArea of Rectangle: " + rectangle.area());
        System.out.println("Area of Triangle: " + triangle.area());

        sc.close();
    }
}
