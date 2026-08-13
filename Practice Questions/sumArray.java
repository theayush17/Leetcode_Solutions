import java.util.*;

public class sumArray {

    //main method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int arrSize=sc.nextInt();
        int[] arr=new int[arrSize];

        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<arrSize;i++){
            arr[i]=sc.nextInt();
        }
        printArray(arr);
        System.out.println("\nThe sum of the array is : "+printSum(arr));
    }

    //print the array
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //summation of the array
    public static int printSum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}

