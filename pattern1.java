import java.util.*;
public class pattern1 
{
    public static void main(String args[]) 
    {
        int stars = 6;
        for(int rows = 1; rows < 2 * stars; rows++)
        {
            int totalCols = (rows > stars) ? 2 * stars - rows: rows;
            for(int cols = 0; cols < totalCols; cols++)
                System.out.print(" *");
            System.out.println();
        }
    }
}
