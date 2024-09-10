public class TrappingRainWater {
    static long trappingWater(int arr[]) {
        int n = arr.length;
        int leftMax= 0;
        int rightMax = 0;
        long ans = 0;
        int l=0;
        int r= n-1;
        
        while(l<r){
            if(arr[l]>leftMax){
                leftMax = Math.max(leftMax, arr[l]);
                
            }
            if(arr[r]>rightMax){
                rightMax = Math.max(rightMax, arr[r]);
               
            }
            if(leftMax < rightMax){
                ans = ans+ (leftMax - arr[l]);
                l++;
            }
            else{
                ans = ans + (rightMax - arr[r]);
                r--;
            }
        }
        return ans;
    }
}
