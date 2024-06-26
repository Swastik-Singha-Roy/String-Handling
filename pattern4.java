import java.util.*;
public class pattern4
{
    public static void main()
    {
        pattern(5);
    }
    public static void pattern(int n)
    {
        for(int r = 0; r< 2*n; r++)
        {
            int totalCols = r > n ? 2 * n - r: r;
            int space = n - totalCols;
            for(int s = 0; s < space; s++)
                System.out.print(" ");
            for(int c = 0; c < totalCols; c++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
