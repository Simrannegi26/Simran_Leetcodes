class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int []arr = new int[n+m];

        int i= 0;
        int j= 0;
        int k= 0;

        // merge both sorted arrays

        while(i< n && j< m){

            if(nums1[i]< nums2[j]){
                arr[k] = nums1[i];
                i++;
            }
            else{
                arr[k]= nums2[j];
                j++;
            }
            k++;
        }

        //remaining elements of nums1 and nums2
        while(i< n){
            arr[k]= nums1[i];
            i++;
            k++;

        }
        while(j< m){
            arr[k]= nums2[j];
            j++;
            k++;

        }

        int total = n+m;

         // Odd number of elements
        if (total % 2 != 0) {
            return arr[total / 2];
        }

        // Even number of elements
        return ((double) arr[total / 2 - 1] + arr[total / 2]) / 2;  
    }
}