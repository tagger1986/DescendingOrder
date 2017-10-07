
package descendingorder;

import java.util.Arrays;


public class DescendingOrder 
{
    public static int sortDesc(final int num) 
    {
        String[] broj = (Integer.toString(num)).split("");
        Arrays.sort(broj);
        String result = "";
            for(String s : broj)
                {
                 result = s + result;
                }
        return Integer.parseInt(result);
    }

    public static void main(String[] args) 
    {
    System.out.println(sortDesc(12345));
    }

}
