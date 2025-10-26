package Challenge;
import java.util.*;
public class MergeArrays {
    public static int[] merge(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        // Merge while both arrays have elements
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }

        // Copy remaining elements from nums1
        while (i < nums1.length) {
            result[k++] = nums1[i++];
        }

        // Copy remaining elements from nums2
        while (j < nums2.length) {
            result[k++] = nums2[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 7};
        int[] nums2 = {2, 4, 6, 8};

        int[] merged = merge(nums1, nums2);
        System.out.println("Merged array: " + Arrays.toString(merged));
    }
}
