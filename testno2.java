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