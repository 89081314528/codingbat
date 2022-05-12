import java.util.Arrays;

public class TenRun {
    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {1, 3};
        int[] nums3 = {1, 10, 2, 3};
        int[] nums4 = {7, 10, -100, -99, 20, 1, 3};
        int[] nums5 = {3, 20, 3, 2, 8, 10};
        System.out.println(Arrays.toString(tenRun(nums1)));
        System.out.println(Arrays.toString(tenRun(nums2)));
        System.out.println(Arrays.toString(tenRun(nums3)));
        System.out.println(Arrays.toString(tenRun(nums4)));
        System.out.println(Arrays.toString(tenRun(nums5)));
    }

    public static int[] tenRun(int[] nums) {
        int current = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                current = nums[i];
                count = 1;
            }
            if (count == 1) {
                nums[i] = current;
            }
        }
        return nums;
    }
}
