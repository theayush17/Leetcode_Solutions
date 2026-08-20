import java.util.*;

public class subArraySum {

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

        System.out.print("Enter the target element: ");
        int target=sc.nextInt();

        printArray(arr);
        System.out.println("Exists? "+subArray(arr,target));
    }

    //print the array
    public static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    //find the sum of subarray in array
    public static boolean subArray(int[] arr,int target) {
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==target){
                    return true;
                }
            }
        }
        return false;
    }
}
