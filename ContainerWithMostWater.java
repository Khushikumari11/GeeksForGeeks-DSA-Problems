public class ContainerWithMostWater {
    
    
        long maxArea(int A[], int len){
            int b1= 0;
            int b2= len-1;
            long r =0;
            while(b1<b2){
                int curMax = (b2-b1)*Math.min(A[b2], A[b1]);
                if(A[b1]<A[b2]){
                    b1++;
                }
                else{
                    b2--;
                }
                r = Math.max(r,curMax);
            }
            return r;
            
        }
        
    }

