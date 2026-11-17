class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int len1 = nums1.length, len2 = nums2.length;
        int i;
        int[] merged = new int[len1 + len2];
        for (i = 0; i < len1; i++) {
            merged[i] = nums1[i];
        }

        for (int j = i; j < len1 + len2; j++ ) {
            merged[j] = nums2[j - len1];
        }

        Arrays.sort(merged);

        int totalLen = merged.length;
        if (totalLen % 2 == 0) {
            return (merged[totalLen / 2 - 1] + merged[totalLen / 2])/ 2.0;
        }

        return merged[totalLen / 2];
    }
}
