import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        int size = nums.length;
        
        if (size <= 2) {
            return Arrays.stream(nums).max().getAsInt();
        }
        
        Arrays.sort(nums);
        
        int count = 1;
        int n = nums[size - 1];   // start from the largest
        
        for (int i = size - 1; i > 0; i--) {
            if (nums[i] != nums[i - 1]) {
                count++;
                if (count == 3) {
                    n = nums[i - 1];
                    break;
                }
            }
        }
        
        if (count == 3) 
            return n;
        else 
            return Arrays.stream(nums).max().getAsInt();
    }
}