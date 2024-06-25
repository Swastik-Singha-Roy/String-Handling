import java.util.*;
public class pattern2
{
    public static void main(String args[])
    {
        int n = 4;
        pattern(n);
    }
    public static void pattern(int n)
    {
        int ogN = n;
        n = 2 * n;
        for(int r = 0; r <= n; r++)
        {
            for(int c = 0; c <= n; c++)
            {
                int idx = ogN - Math.min(Math.min(r, c), Math.min(n - r, n - c));
                System.out.print(idx + " ");
            }
            System.out.println();
        }
    }
}
