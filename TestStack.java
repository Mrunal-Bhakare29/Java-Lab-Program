import java.util.*;
interface Stack {
    int size = 5; 
    void push();
    int pop();
    void display();
    boolean overflow();
    boolean underflow();
}

 class IntegerStack implements Stack {
    int[] stack = new int[size];
    int top = -1;

   
      public void push() {
        System.out.println("Enter Element:");
        Scanner sc=new Scanner(System.in);
        int element=sc.nextInt();
        if (overflow()) {
            System.out.println("Stack Overflow! Cannot push " + element);
            return;
        }
        top++;
        stack[top] = element;
        System.out.println("Pushed: " + element);
    }

  
    public int pop() {
        if (underflow()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        }
        int poppedElement = stack[top--];
        System.out.println("Popped: " + poppedElement);
        return poppedElement;
    }

  
    public void display() {
        if (underflow()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public boolean overflow() {
        return top == size - 1;
    }

    public boolean underflow() {
        return top == -1;
    }
}

public class TestStack {
    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack();
        int ch,yes;
        
        do{
        System.out.println("Enter Choice: \n1:Push\n2:Pop\n3:Display");
        Scanner sc=new Scanner(System.in);
        ch=sc.nextInt();
        
        switch(ch)
        {
            case 1:
            stack.push();
            break;
            case 2:
            int el=stack.pop();
            break;
            case 3:
            stack.display();
            break;
            default:
            System.out.println("Invalid Choice");
            
        }
        System.out.print("Do you perform again stack operation:1:Yes 2:No");
        yes=sc.nextInt();
    }while(yes!=2);
    }
}