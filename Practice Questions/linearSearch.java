import java.util.*;

public class linearSearch {

    //main method
    static void main() {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int [] arr=new int[n];

        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        System.out.print("Write the target element: ");
        int target=sc.nextInt();

        printArray(arr);
        targetSearch(arr,target);
    }

    //print the array
    static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    //linear search for the target element
    static int targetSearch(int[] arr,int target) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==target) {
                return i;
            }
        }
        return -1;
    }
}
