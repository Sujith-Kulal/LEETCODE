import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int[] merge = new int[nums1.length+nums2.length];

        // Use System.arraycopy to replace duplicated loops
        System.arraycopy(nums1, 0, merge, 0, nums1.length);
        System.arraycopy(nums2, 0, merge, nums1.length, nums2.length);

        Arrays.sort(merge);

        int n = merge.length;


        if(n % 2 == 0)
        {
            return (merge[n/2 -1]+merge[n/2])/2.00;
        }
            else
            {
            return merge[n/2];
            }
    }
}