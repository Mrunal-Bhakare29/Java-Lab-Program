import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int arr1[]=new int[10];
        int arr2[]=new int[5];
        System.out.println("Enter 1st Array Elements");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter 2nd Array Elements");
        for(int i=0;i<5;i++)
        {
            arr2[i]=sc.nextInt();
        }
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        int j=0;
        for(int i=5;i<10;i++)
        {
            
            arr1[i]=arr2[j];
            j++;
            
        }
        Arrays.sort(arr1);
        System.out.println("Sorted Array Elements");

        for(int i=0;i<10;i++)
        {
            System.out.println(arr1[i]);
        }
    }
}
