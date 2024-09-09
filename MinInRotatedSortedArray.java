
class MinInRotatedSortedArray {

    // Function to find the minimum element in a rotated sorted array
    public static int findMin(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            
            if (arr[low] <= arr[high])
                return arr[low];

           
            int mid = (low + high) / 2;

            if (arr[mid] > arr[high])
                low = mid + 1;

            else
                high = mid;
        }

        return arr[low];
    }

    
}