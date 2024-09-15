import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[][] overlappedInterval(int[][] Intervals) {
        // Sort the intervals based on their starting point
        Arrays.sort(Intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        // Create a list to store the merged intervals
        ArrayList<int[]> res = new ArrayList<>();
        
        // Initialize newInterval with the first interval in the sorted array
        int[] newInterval = Intervals[0];
        
        // Loop through the rest of the intervals starting from index 1
        for (int i = 1; i < Intervals.length; i++) {
            // Check if the current interval overlaps with the newInterval
            if (newInterval[1] >= Intervals[i][0]) {
                // Merge the intervals by updating the end of newInterval
                newInterval[1] = Math.max(newInterval[1], Intervals[i][1]);
            } else {
                // If no overlap, add the current newInterval to the result list
                res.add(newInterval);
                // Update newInterval to the current interval
                newInterval = Intervals[i];
            }
        }
        
        // Add the last interval (since the loop exits before adding it)
        res.add(newInterval);
        
        // Convert the result list to a 2D array and return it
        return res.toArray(new int[res.size()][]);
    }
}
