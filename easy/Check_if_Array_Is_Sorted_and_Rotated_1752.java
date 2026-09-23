class Solution {
    public boolean check(int[] nums) {
        boolean flag=true;
        int count=0;
        int size=nums.length;
       
        for(int i=0;i<size;i++){
            if(nums[i]>nums[(i+1) % size] ){
                count++;
            }
        }
        if(count>1)
            flag=false;

        return flag;
    }
}