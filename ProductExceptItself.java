import java.util.Arrays;
public class ProductExceptItself {
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        long[] ans = productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static long[] productExceptSelf(int nums[]) {
        int n = nums.length;
        long[] ans = new long[n];
        //prefix code:
        ans[0]=1;
        for(int i=1;i<n;i++){
            ans[i]= ans[i-1]*nums[i-1];
        }
        //suffix code:
        long suffix=1;
        for(int j=n-1;j>=0;j--){
            ans[j]=ans[j]*suffix;
            suffix= suffix*nums[j];
        }
        return ans;
    }
}

