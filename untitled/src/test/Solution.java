package test;

class Solution {
    public static void main(String[] args) {
        System.out.println("asdadssad");
    }
    public int maxRotateFunction(int[] nums) {
int fResult =0;
int sum = 0;
int length = nums.length;
for(int i=0;i<nums.length;i++){

    fResult = fResult + i*nums[i];
    sum = sum +nums[i];
}

        int result =  fResult;
for(int i = length-1;i>=0;i--){

    fResult =fResult + sum - length*nums[i];
    if(fResult > result){
        result = fResult;
    }
}

        return result;
    }
}