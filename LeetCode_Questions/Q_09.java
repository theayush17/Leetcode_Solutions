import java.util.*;

public class Q_09 {
    public boolean isPalindrome(int x) {
        if (x<0)
            return false;

        int n=x;
        int rev=0;

        while(n!=0){
            int a=n%10;
            rev=rev*10+a;
            n/=10;
        }

        return x==rev;
    }

    //main method
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the target value");
        int target=sc.nextInt();
        Q_09 q=new Q_09();
        System.out.println(q.isPalindrome(10));
    }
}
