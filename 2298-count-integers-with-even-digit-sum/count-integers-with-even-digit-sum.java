class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
            if(getSum(i)%2==0){
                count++;
            }
        }
        return count;
    }

    public int getSum(int n){
        String num = String.valueOf(n);
        int sum=0;
        for(int i=0;i<num.length();i++){
            int digit = (int) num.charAt(i);
            sum+=digit;
        }
        return sum;
    }
}