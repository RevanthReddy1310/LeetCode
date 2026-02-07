class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int sum=0;
        int sum1=0;
        int ans = Integer.MAX_VALUE;
        for(int h=0;h<nums.length;h++){
            sum+=nums[h];
        }
        if(sum<target){
            return 0;
        }
        for(int j=0;j<nums.length;j++){
            sum1+=nums[j];
            while(sum1>=target){
                ans = Math.min(ans,j-i+1);
                sum1-=nums[i];
                i++;
            }
        }
        return ans;
    }
}