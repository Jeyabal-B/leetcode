class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int sum = 0;

        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                if(sum==0){
                    sum=nums[i];
                }
                sum += nums[i+1];
            }else{
                if(sum>maxSum){
                    maxSum=sum;
                }
                sum=0;   
            }
        }
        if(sum>maxSum){
            maxSum=sum;
        }
        return maxSum;
    }
}
