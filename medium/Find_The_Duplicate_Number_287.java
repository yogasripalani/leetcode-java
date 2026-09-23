class Solution {
    public int findDuplicate(int[] nums) {
        // int n=0,count=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             return nums[i];
        //         }
        //     }
        // }
        // return -1;
        HashMap<Integer,Integer> HM=new HashMap<>();
        int ans=0;
        for(int index=0;index<nums.length;index++){
            if(HM.containsKey(nums[index])){
                HM.put(nums[index],(HM.get(nums[index]))+1);
                ans=nums[index];
                break;
            }
            else{
                HM.put(nums[index],1);
            }
        }
        return ans;
    }
}