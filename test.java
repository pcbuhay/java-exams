import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Test{
public static void main(String args[]){

int[] testin42 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,41,43,44,45,46,47,48,49,50};

 testin42(testin42);
 for (int i = 0; i < testin42.length; i++)
  {
  System.out.print(testin42[i] + " ");
 }
System.out.println();
  }

  
 static void testin42(int[] ar)
  {
 Random rnd = ThreadLocalRandom.current();
    for (int i = ar.length - 1; i > 0; i--)
    {
      int wazzubi = rnd.nextInt(i + 1);
 
      int a = ar[wazzubi];
      ar[wazzubi] = ar[i];
      ar[i] = a;
    }
  }
}