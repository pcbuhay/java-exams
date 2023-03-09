paul christian buhay
test

1.)

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


2.)

public class testno2 {
     
    
    static double bahala(int a[], int n)
    {
         
        
        int sum = 0;
         
        for (int i = 0; i < n; i++)
            sum += a[i];
     
        return (double)sum / n;
    }
     
    public static void main (String[] args)
    {
         
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,41,43,44,45,46,47,48,49,50};
        int n = arr.length;
     
 System.out.println(bahala(arr, n));
}
}
 


3.)

public class reversetwo {


	 static void reverse (int a[], int n) 
{
	int i, k, t;
	for (i = 0; i < n / 2; i++ ){
	t =a [i];
	a[i] = a[n - i - 1];
	a[n - i - 1] = t;
	
}


System.out.println("kabaliktaran nito : \n ");
for (k = 0 ; k < n; k++) {
System.out.println(a[k]);
}
}
public static void main(String args[])
{

int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,41,43,44,45,46,47,48,49,50};
reverse(arr, arr.length);
}
}

4.)1.	{A, 30(weight)}, {B, 40(weight)},{C,20(weight)},{D,10(weight)}, random a number(20), output A, random a number(80), output C 


5.)1.	Binary search using recursion
function binsearch($x,$a)

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

6.)Given two binary strings a and b , return their sum as a binary string.
Example :  Input: a = "1010", b = "1011"   Output: "10101"

public class pcbtest{
 

    static String addBinary(String A, String B)
    {  

        int binary1 = A.length()-1;

        int binary2 = B.length()-1;
 
        int carry = 0;

        int sum = 0;
        StringBuilder result =  new StringBuilder();
        while(binary1>=0 || binary2>=0 || carry == 1){
            sum = carry;
            if(binary1>=0) sum = sum+A.charAt(binary1)-'0';
            if(binary2>=0) sum = sum+B.charAt(binary2)-'0';
            result.append((char)(sum%2+'0'));
            carry = sum/2;
            binary1--;
            binary2--;
        }
        return result.reverse().toString();
    }
 

    public static void main(String args[])
    {
        String a = "1010", b="1011";
         
        System.out.print(addBinary(a, b));
    }
}

7.)Use function recursion to find the factorial of 100

public class Factorial {

 //100! = 100 x 99 x 98 x 97 x 96 x 95 x 94 x 93 x 92 x 91 x 90 x89 x 88 x87 x 86 x 85 x 84 x 83 x82 x 83 82.... 1
    public static void main(String[] args) {

System.out.println(factorial(100));

       }

public static int factorial(int n) {
	if(n == 1) {
return 1;

}
else 

{
	return n *(n -1 );
}

}
}


8.)Merge two sorted arrays    nums1   nums2

import java.util.*;
  
public class pagkabit {
    public static void main(String[] args) {
        int watch1[] = {};
        int nums1 = watch1.length;
  
        int watch2[] = {};
        int nums2 = watch2.length;
  
        int watch3[] = new int[nums1 + nums2];
        mergeArrays(watch1, watch2, nums1, nums2, watch3);
  
        System.out.println("RESULTA");
        for (int i=0; i < nums1+nums2; i++)
            System.out.print(watch3[i] + " ");
              
    }
      
    public static void mergeArrays(int[] watch1, int[] watch2, int nums1, int nums2, int[] watch3){
     int A = 0;  
     int B = 0;  
     int C = 0;  

        while(A < nums1){   
         watch3[C++] = watch1[A++];   
        }   
          

        while(B < nums2){   
         watch3[C++] = watch2[B++];   
        }   
          

        Arrays.sort(watch3);   
    }
}


  	