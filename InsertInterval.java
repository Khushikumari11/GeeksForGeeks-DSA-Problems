import java.util.ArrayList;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval){
        ArrayList<int[]> res = new ArrayList<>();

        //store intervals before overlap:
        int i=0; 
        int n = intervals.length;
        while(i<n && intervals[i][1]< newInterval[0]){
            res.add(intervals[i]);
        }
        // merge overlaping intervals:
        while(i<n && newInterval[1]>= intervals[i][0]){
            newInterval[0]=Math.min(newInterval[0], intervals[0]);
            newInterval[1]= Math.max(newInterval[1],intervals[1]);
            i++;
        }
        res.add(newInterval);
        //append the remaining intervals:
        while(i<n){
            res.add(intervals[i]);
            i++;
        }
        return res.toArray(new int[res.size()][2]);
    }
}
