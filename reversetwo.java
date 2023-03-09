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