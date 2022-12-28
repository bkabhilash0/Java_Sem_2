import java.util.Arrays;

public class Prg_009 {
    public static void main(String[] args) {
        int[] nums = new int[]{5,4,7,2,9};
        System.out.println("Before Sorting "+ Arrays.toString(nums));
        for(int i = 0;i < nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[j] < nums[i]){
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }

        System.out.println("After Sorting "+Arrays.toString(nums));
    }
}
