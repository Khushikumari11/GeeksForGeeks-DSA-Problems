import java.util.ArrayList;
import java.util.Collections;

class FindDuplicates {
    public static void main(String[] args){
        int[] arr = {2,5,3,5,1,7,6,6};
        System.out.println(duplicates(arr));
    }
    public static ArrayList<Integer> duplicates(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int index=0; index<arr.length; index++){
              if (arr[index] != index && !ans.contains(arr[index])) {
                ans.add(arr[index]);
            }
        }
         if (ans.isEmpty()) {
            ans.add(-1);
        }else {
            Collections.sort(ans);  // Sort the result to meet expected output
        }
        return ans;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }
}