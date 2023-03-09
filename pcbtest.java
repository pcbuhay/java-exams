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