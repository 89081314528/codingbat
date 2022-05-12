public class TripleUp {
    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {1, 3};
        int[] nums3 = {1, 1, 2, 3};
        int[] nums4 = {7, 7, -100, -99, -98, 1, 3};
        int[] nums5 = {3, 2, 3, 2, 3, 4};
        System.out.println(tripleUp(nums1));
        System.out.println(tripleUp(nums2));
        System.out.println(tripleUp(nums3));
        System.out.println(tripleUp(nums4));
        System.out.println(tripleUp(nums5));

    }

    public static boolean tripleUp(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        for (int i = 0; i < nums.length - 2; i ++) {
            int current = nums[i];
            int next = nums[i + 1];
            int nextNext = nums[i + 2];
            if ((next - current) == 1 && (nextNext - next) == 1) {
                return true;
            }
        }
        return false;
    }
}
