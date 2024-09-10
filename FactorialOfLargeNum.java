import java.util.ArrayList;

public class FactorialOfLargeNum {
    
    public static ArrayList<Integer> factorial(int N) {
        // declare an arraylist:
        ArrayList<Integer> result = new ArrayList<>();
        int size =0;
        int c = 0;
        //Adding 1 at 0th index:
        result.add(0,1);
        //updating size:
        size=1;
        //declare variable to traverse from 2 to n:
        int val = 2;
        while(val<=N){
            //traverse arraylist from right to left:
            for(int i=size-1; i>=0;i--){
                //update value in the arraylist:
                int temp = result.get(i)*val+c;
                //store the last digit at the index and add remaining to the carry:
                result.set(i,temp%10);
                //update carry:
                c = temp/10;
            }
            //if carry not consumed insert it digit by digit into the beginning to AL:
            while(c!=0){
                result.add(0,c%10);
                c=c/10;
                size++;
            }
            val++;
        }
        return result;
    }
}

