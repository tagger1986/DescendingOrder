
package descendingorder;

import java.util.Arrays;


public class DescendingOrder 
{
    public static int sortDesc(final int num) 
    {
        String[] broj = (Integer.toString(num)).split("");
        Arrays.sort(broj); //sortiranje niza koji je prebacen u String
        String result = "";
            for(String s : broj)
                {
                 result = s + result; // moye npr i preko StringBulidera
                }
        return Integer.parseInt(result); //String parsiran ponovo u Integer
    }

    public static void main(String[] args) 
    {
    System.out.println(sortDesc(12345));
    }

}
