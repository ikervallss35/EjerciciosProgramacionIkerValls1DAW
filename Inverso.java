import java.util.Arrays;
public class Inverso {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 9, 8};
        int[] inv = invertirArray(nums);
        System.out.println(Arrays.toString(inv));
    }public static int[] invertirArray(int[] nums) {
        int[] inv = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            inv[i] = nums[nums.length - 1 - i];
        }return inv;
    }
}