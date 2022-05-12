import java.util.Arrays;

public class ZeroMax {
    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {0, 3};
        int[] nums3 = {0, 10, 0, 3};
        int[] nums4 = {7, 0, 1, 2, 3, 0, 5};
        int[] nums5 = {3, 20, 3, 2, 8, 0};
        System.out.println(Arrays.toString(zeroMax(nums1)));
        System.out.println(Arrays.toString(zeroMax(nums2)));
        System.out.println(Arrays.toString(zeroMax(nums3)));
        System.out.println(Arrays.toString(zeroMax(nums4)));
        System.out.println(Arrays.toString(zeroMax(nums5)));
    }

    public static int[] zeroMax(int[] nums) {
        if(nums.length < 2) {
            return nums;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                int max = 0;
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] % 2 != 0 && nums[j] > max) {
                        max = nums[j];
                    }
                }
                nums[i] = max;
            }
        }
        return nums;
    }

}
