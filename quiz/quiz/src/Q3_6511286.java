public class Q3_6511286 {
    public static void main(String[] args) {
        int[] arr1 = {9, 9};
        System.out.println(has99(arr1));
    }
    public static boolean has99(int[] nums) {
        int count = 0;

        if (nums[0] == 9 && nums[1] == 9) {
            return true;
        }

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 9 && nums[i+1] == 9) {
                return true;
            }

            if (nums[i] == 9 && nums[i+2] == 9){
                return true;
            }
        }
        return false;
    }
}
