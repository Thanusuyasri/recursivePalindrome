import java.util.Scanner;

public class recursivePalindrome {
    public static int palindrome(String s,int start,int end)
    {
        if(start>end)
        {
            return 1;
        }
        if(s.charAt(start)!=s.charAt(end))
        {
            return 0;
        }
        return palindrome(s,start+1,end-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        System.out.println(palindrome(a,0,a.length()-1));
    }
}
