import java.util.Arrays;

public class notAlone {
    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {1, 3};
        int[] nums3 = {1, 10, 2, 3};
        int[] nums4 = {7, 2, -100, 2, 20, 1, 3};
        int[] nums5 = {3, 20, 3, 2, 8, 2};
        int val = 2;
        System.out.println(Arrays.toString(notAlone(nums1, val)));
        System.out.println(Arrays.toString(notAlone(nums2, val)));
        System.out.println(Arrays.toString(notAlone(nums3, val)));
        System.out.println(Arrays.toString(notAlone(nums4, val)));
        System.out.println(Arrays.toString(notAlone(nums5, val)));
    }

    public static int[] notAlone(int[] nums, int val) {
       if(nums.length < 3) {
           return nums;
       }
        for (int i = 1; i < nums.length - 1; i++) {
            int previous = nums[i -1];
            int current = nums[i];
            int next = nums[i + 1];
            if (current == val && previous != val && next != val) {
                if (previous > next) {
                    nums[i] = previous;
                } else {
                    nums[i] = next;
                }
            }
        }
        return nums;
    }
}
