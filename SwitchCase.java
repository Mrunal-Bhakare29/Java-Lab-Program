import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int arr1[][]=new int[2][2];
        int arr2[][]=new int[2][2];
        int res[][]=new int[2][2];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 X 2 1st matrix:");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter 2 X 2 2nd matrix:");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter 1:Addition\n 2:Multiplication\n 3:Subtraction\n");
        int ch=sc.nextInt();
        switch (ch) {
            case 1:
            for(int i=0;i<2;i++)
            {
                for(int j=0;j<2;j++)
                {
                    res[i][j]=arr1[i][j]+arr2[i][j];
                }
            }
            for(int i=0;i<2;i++)
            {
                for(int j=0;j<2;j++)
                {
                    System.out.print(res[i][j]+" ");
                }
                System.out.println();
            }  
                break;
            case 2:
                for(int i=0;i<2;i++)
                {
                    for(int j=0;j<2;j++)
                    {
                        res[i][j]=arr1[i][j]*arr2[i][j];
                    }
                }
                for(int i=0;i<2;i++)
                {
                    for(int j=0;j<2;j++)
                    {
                        System.out.print(res[i][j]+" ");
                    }
                    System.out.println();
                }  
                    break;
            case 3:
                    for(int i=0;i<2;i++)
                    {
                        for(int j=0;j<2;j++)
                        {
                            res[i][j]=arr1[i][j]-arr2[i][j];
                        }
                    }
                    for(int i=0;i<2;i++)
                    {
                        for(int j=0;j<2;j++)
                        {
                            System.out.print(res[i][j]+" ");
                        }
                        System.out.println();
                    }  
                        break;
                
            default:
            System.out.println("Invalid Choice");
                break;
        }
    }
}
