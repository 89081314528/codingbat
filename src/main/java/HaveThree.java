public class HaveThree {
    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {1};
        int[] nums3 = {1, 1, 3, 3};
        int[] nums4 = {7, 7, 3, 1, 3, 1, 3};
        int[] nums5 = {3, 2, 3, 7, 3, 4};
        int[] nums6 = {1, 3, 3, 2, 4, 7};
        System.out.println(haveThree(nums1));
        System.out.println(haveThree(nums2));
        System.out.println(haveThree(nums3));
        System.out.println(haveThree(nums4));
        System.out.println(haveThree(nums5));
        System.out.println(haveThree(nums6));
    }

    public static boolean haveThree(int[] nums) {
        if (nums.length < 5) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < nums.length - 1; i ++) {
            if (nums[i] == 3) {
                count ++;
            }
            int current = nums[i];
            int next = nums[i + 1];
            if (current == 3 && next ==3) {
                return false;
            }
            if (i == nums.length - 2 && next == 3) {
                count ++;
            }
        }
        return count == 3;
    }
}
