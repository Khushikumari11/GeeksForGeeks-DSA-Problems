class MaxProductSubarray {
    public static void main(String[] args){
        int[] arr = {-8,0};
        int n = arr.length;
        System.out.println (maxProduct(arr, n));
    }
    static long maxProduct(int[] arr, int n) {
        long max= arr[0];
        long min = arr[0];
        long result = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]==0){
                max = 1;
                min = 1;
                result = Math.max(result, 0);
                continue;
            }
            long temp1 = arr[i]*max;
            long temp2 = arr[i]*min;
            max = Math.max(temp1, temp2);
            max = Math.max(max, arr[i]);
            min = Math.min(temp1, temp2);
            min = Math.min(min, arr[i]);
            result = Math.max(result, max);
        }
        return result;
    }
}
