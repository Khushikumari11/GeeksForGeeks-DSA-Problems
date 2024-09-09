class TwoSum{
    public static void main(String[] args){
        int[] arr = {6,2,10,3,5,13};
        int x = 16;
        boolean ans = hasArrayTwoCandidates(arr, x);
        System.out.println(ans);
    }
    public static boolean hasArrayTwoCandidates(int arr[], int x) {
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==x){
                    return true;
                }
            }
           
        }
         return false;
    }
}