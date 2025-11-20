package day1;

public class Sort012 {
    public static void Sort(int[] nums1) {
        //int[] nums1 = {0, 1, 2, 0, 1, 2, 1, 0};
        int low = 0, mid = 0;
        int high = nums1.length - 1;

        while (mid <= high) {
            if (nums1[mid] == 0) {
                swap(nums1, low, mid);
                low++;
                mid++;
            } else if (nums1[mid] == 1) {
                mid++;
            } else {
                swap(nums1, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
