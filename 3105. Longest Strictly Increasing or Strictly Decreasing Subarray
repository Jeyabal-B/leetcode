class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int countAsc = 1;
        int countDsc = 1;
        int finalCountAsc = 1;
        int finalCountDsc = 1;
        int n = nums.length;
        boolean IsReset = false;

        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                countAsc++;
            }else{
                IsReset = true;
                if(countAsc>finalCountAsc){
                    finalCountAsc = countAsc;
                }
                countAsc=1;
            }
            if(countAsc>1){
                if(finalCountAsc < countAsc){
                    finalCountAsc = countAsc;
                }

            }
                
        }

        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                countDsc++;
            }else{
                if(countDsc>finalCountDsc){
                    finalCountDsc = countDsc;
                }
                countDsc=1;
            }    
            if(countDsc>1){
                if(finalCountDsc < countDsc){
                    finalCountDsc = countDsc;
                }
            }
        }

        if(finalCountAsc>finalCountDsc){
            return finalCountAsc;
        }else{
            return finalCountDsc;
        }
    }
}
