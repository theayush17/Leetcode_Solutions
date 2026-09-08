import java.util.Scanner;

public class palindromeString {

    //main method
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(palindrome(s));
    }

    static boolean palindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
