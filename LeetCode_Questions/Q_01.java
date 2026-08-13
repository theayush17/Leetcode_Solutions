import java.util.Scanner;

public class Q_01 {

    public int[] twoSum(int[] nums, int target) {

        int[] idx = new int[2];

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                int sum = nums[i] + nums[j];

                if (sum == target) {
                    idx[0] = i;
                    idx[1] = j;
                    return idx;
                }
            }
        }

        return idx;
    }

    //main method
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the target value");
        int target=sc.nextInt();
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter elements in the array");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        Q_01 q=new Q_01();
        System.out.println(q.twoSum(arr,target));
    }
}
