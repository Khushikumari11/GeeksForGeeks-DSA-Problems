public class SearchInRotatedSorted {
     
        int search(int[] arr, int key) {
            int pivot = findPivot(arr);
            //if pivot not found:
            if(pivot==-1){
              return binarySearch(arr,key,0,arr.length-1);
            }
            //if pivot is found:
            if(arr[pivot]==key){
                return pivot;
            }
            if(key>=arr[0] ){
                return binarySearch(arr, key, 0, pivot-1);
            }
            return binarySearch(arr, key, pivot+1, arr.length-1);
        }
        
        int binarySearch(int[] arr, int key, int start, int end){
            while(start<= end){
                int mid = start+(end - start)/2;
                if(key<arr[mid]){
                    end = mid-1;
                }
                else if(key> arr[mid]){
                    start = mid+1;
                }
                else{
                    return mid;
                }
            }
            return -1;
        }
        int findPivot(int[] arr){
            int start =0;
            int end = arr.length-1;
            while(start<=end){
                int mid = start+(end -start)/2;
                // four cases:
                if(mid<end && arr[mid]>arr[mid+1]){
                    return mid;
                }
                if(mid> start && arr[mid-1]>arr[mid]){
                    return mid-1;
                }
                if(arr[mid]<=arr[start]){
                    end = mid-1;
                }
                else{
                    start= mid+1;
                }
            }
            return -1;
        }
    }

