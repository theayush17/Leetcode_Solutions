import java.util.*;

public class countEven_Odd {

    //main method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int arrSize=sc.nextInt();
        int[] arr=new int[arrSize];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<arrSize;i++)
            arr[i]=sc.nextInt();

        printArray(arr);
        System.out.println("Odd elements are: "+oddCount(arr));
        System.out.println("Even elements are: "+evenCount(arr));
    }

    //pint the array
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //count the elements for ODD
    public static int oddCount(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count++;
            }
        }
        return count;
    }

    //count the elements for EVEN
    public static int evenCount(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }
}
