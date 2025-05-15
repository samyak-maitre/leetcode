import java.util.*;

class Solution{
    public static void checkPalindromeNumber(int n){
        int original = n;
        int reversed = 0;

        while(n!=0){
            int lastDigit = n%10;
            reversed = reversed*10 + lastDigit;
            n /= 10;
        }

        if(reversed == original){
            System.out.println("Its a palindorme.");
        }
        else{
            System.out.println("Not a palindrome.");
        }
    }
}
