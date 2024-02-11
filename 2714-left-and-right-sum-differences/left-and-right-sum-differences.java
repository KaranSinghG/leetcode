class Solution {
    public int[] leftRightDifference(int[] nums) {

        int[] rightSum = getRightSum(nums);
        int[] leftSum = getLeftSum(nums);

        return getDifference(leftSum,rightSum);
    }

    public int[] getRightSum(int[] nums){
        int[] rightSum = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i+1;j<nums.length;j++){
                sum+=nums[j];
            }
            rightSum[i]=sum;
        }
        return rightSum;
    }

    public int[] getLeftSum(int[] nums){
        int[] leftSum = new int[nums.length];
        for (int i=nums.length-1;i>=0;i--){
            int sum = 0;
            for(int j=i-1;j>=0;j--){
                sum+=nums[j];
            }
            leftSum[i]=sum;
        }
        return leftSum;
    }

    public int[] getDifference(int[] leftSum, int[] rightSum){
        int[] ans = new int[leftSum.length];
        for(int i=0;i<leftSum.length;i++){
            int a =leftSum[i]-rightSum[i];
            if(a<0){
                a*=(-1);
            }
            ans[i]=a;
        }
        return ans;
    }
}