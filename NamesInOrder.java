import java.util.*;
public class NamesInOrder {
    public static void main(String[] args) {
        String arr[]=new String[10];
        System.out.println("Enter 10 names of students");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextLine();
        }
        Arrays.sort(arr);
        System.out.println("After sorting names:");
        for(int i=0;i<10;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
