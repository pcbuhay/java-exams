import java.util.Arrays;
 

public class testinbinsearch {
 
    // Main driver method
    public static void main(String[] args)
    {

      
        char charArr[] = { 'x', 'a' };

        Arrays.sort(charArr);
 
        char charKey = 'x';
         char charKey2 = 'a';

        System.out.println(
            charKey + " found at index = "
            + Arrays.binarySearch(charArr, charKey));
            
             System.out.println(
            charKey2 + " found at index = "
            + Arrays.binarySearch(charArr, charKey2));
      
    }
}