class ChocolateDistribution{
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
       if(a.size()==0){
           return 0;
       }
       Collections.sort(a);
       long result = Long.MAX_VALUE;
       for(int i=0;i<n-m+1;i++){
           int minElement = a.get(i);
           int maxElement = a.get(i+m-1);
           result = Math.min(result, maxElement-minElement);
       }
       return result;
    }
}
}