/* tjudge3 - Array Mean Method*/
public class arrMeth {
    public static double mean(int arr[])
    {
    	double sum = 0;
        for(int i = 0; i < arr.length;i++)
        {
            sum += arr[i];
        }
    return sum/arr.length;
    }
    public static void main(String args[])
    {
        int i;
        int arr[] = {1,5,8,3,9};
        for(i = 0; i < 5; i++) {
        }
     System.out.println("The arithmetic mean is :" + mean(arr));
    }
}
