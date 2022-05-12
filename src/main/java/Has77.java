public class Has77 {
    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {1};
        int[] nums3 = {1, 1};
        int[] nums4 = {7, 7};
        int[] nums5 = {1, 2, 7, 7, 9};
        int[] nums6 = {1, 2, 2, 2, 4, 7};
        System.out.println(has77(nums1));
        System.out.println(has77(nums2));
        System.out.println(has77(nums3));
        System.out.println(has77(nums4));
        System.out.println(has77(nums5));
        System.out.println(has77(nums6));
    }

    public static boolean has77(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return false;
        }
        if (nums.length == 2 && nums[0] == 7 && nums[1] == 7) {
            return true;
        }
        if (nums.length == 2 && nums[0] != 7 && nums[1] != 7) {
            return false;
        }
        for (int i = 0; i < nums.length - 2; i ++) {
            int current = nums[i];
            int next = nums[i + 1];
            int nextNext = nums[i + 2];
            if ((current == 7 && next == 7) || (current == 7 && nextNext == 7) || (next == 7 && nextNext == 7)) {
                return true;
            }
        }
        return false;
    }
}
