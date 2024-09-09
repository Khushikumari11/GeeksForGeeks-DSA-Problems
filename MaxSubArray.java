public class MaxSubArray {
    public static void main(String[] args){
        int[] arr = {-2, 6, -3, -10, 0, 2};
        System.out.println(maxSubarraySum(arr));
    }
    
   static  int maxSubarraySum(int[] arr) {

        int sum = 0;
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum > max){
                max = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }
}

