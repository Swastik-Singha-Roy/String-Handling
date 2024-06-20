import java.util.*;
public class palindromeWord 
{
    public static void main(String args[])
    {
        String str = "Bob";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String str)
    {
        if(str == null || str.length() == 0)
            return true;
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) 
        {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) 
            {
                return false;
            }
        }
        return true;
    }
}
