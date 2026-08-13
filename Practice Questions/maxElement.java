import java.util.*;

public class maxElement {

    //main method
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the elements of the array: ");
        int arrSize=sc.nextInt();
        int[] arr=new int[arrSize];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<arrSize;i++)
            arr[i]=sc.nextInt();

        printArray(arr);
        System.out.println("The maximum element is: "+maxElement(arr));
    }

    //print the array
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }

    //maximum element method
    public static int maxElement(int[] arr) {
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
}
