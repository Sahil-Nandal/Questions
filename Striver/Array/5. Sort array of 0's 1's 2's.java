class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int z=0;
        int o=0;
        int t=0;

        for(int i=0; i<len; i++){
            if(nums[i]==0){
                z++;
            }
            else if(nums[i]==1){
                o++;
            }
            else if(nums[i]==2){
                t++;
            }
        }

        for(int i=0; i<z; i++){
            nums[i]=0;
        }
        for(int i=z; i<z+o; i++){
            nums[i]=1;
        }
        for(int i=z+o; i<z+o+t; i++){
            nums[i]=2;
        }
    }
}
