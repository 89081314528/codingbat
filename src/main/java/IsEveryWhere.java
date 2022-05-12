public class IsEveryWhere {
    public static void main(String[] args) {
        int[] nums1 = {}; // false
        int[] nums2 = {1}; // true
        int[] nums3 = {1, 2, 3, 1, 1}; // true
        int[] nums4 = {1, 2, 2, 2, 2, 3}; // false
        int val = 1;
        System.out.println(isEveryWhere(nums1, val));
        System.out.println(isEveryWhere(nums2, val));
        System.out.println(isEveryWhere(nums3, val));
        System.out.println(isEveryWhere(nums4, val));
    }

    public static boolean isEveryWhere(int[] nums, int val) {
        if (nums.length == 0) {
            return false;
        }
        if (nums.length == 1 && nums[0] == val) {
            return true;
        }
        if (nums.length == 1 && nums[0] != val) {
            return false;
        }
        for (int i = 0; i < nums.length; i = i + 2) {
            if (i == nums.length - 1) {
                if (nums[i] != val) {
                    return false;
                } else {
                    return true;
                }
            }
            int current = nums[i];
            int next = nums[i + 1];
            if (current != val && next != val) {
                return false;
            }
        }
        return true;
    }
}
