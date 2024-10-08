import java.util.Arrays;
public class TrippletsSumZero {

    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
       Arrays.sort(arr);
       for(int i=0; i<n;i++){
           int j = i+1;
           int k = n-1;
           while(j<k){
               if(arr[i]+arr[j]+arr[k]>0){
                   k--;
               }
               else if(arr[i]+arr[j]+arr[k]<0){
                   j++;
               }
               else{ // equal to zero 
                   return true;
               }
           }
           
       }
       return false;
    }
}

