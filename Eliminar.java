public class Eliminar {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 9, 8};
        int numAEliminar = 1;
        moverElementoAlFinal(nums, numAEliminar);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }public static void moverElementoAlFinal(int[] nums, int numAEliminar) {
        int temp = nums[numAEliminar];

        for (int i = numAEliminar; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = temp;
    }
}