public class Pro_010 {
    public static void main(String[] args) {

        int[][] nums = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int sum;

        // Row wise sum
        for(int i=0;i<nums.length;i++){
            sum = 0;
            for(int j:nums[i]){
                sum += j;
            }
            System.out.println("Sum of Elements in Row "+(i+1)+" is "+sum);
        }

        // Column Wise Sum
        for(int i=0;i<nums[0].length;i++){
            sum = 0;
            for (int[] num : nums) {
                sum += num[i];
            }
            System.out.println("Sum of Elements in Column "+(i+1)+" is "+sum);
        }
    }
}
