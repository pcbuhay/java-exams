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