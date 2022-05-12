public class Only14 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {1, 2, 2, 2, 2, 3};
        System.out.println(only14(nums1));
        System.out.println(only14(nums2));
    }

    public static boolean only14(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num != 1 || num != 4) {
                return false;
            }
        }
        return true;
    }
}
