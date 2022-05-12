public class Sum28 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {1, 2, 2, 2, 2, 3};
        System.out.println(sum28(nums1));
        System.out.println(sum28(nums2));
    }

    public static boolean sum28(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 2) {
                count++;
            }
        }
        return count == 4;
    }
}
