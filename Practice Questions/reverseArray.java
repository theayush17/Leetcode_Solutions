import java.util.*;

public class reverseArray {

    //main method
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        printArray(arr);
        reverseArray(arr);
    }

    //print the array
    static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    //reverse the array
    public static void reverseArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        //array after reversing
        System.out.println("The reversed array is: ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
