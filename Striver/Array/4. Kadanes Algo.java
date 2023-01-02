class Solution {
    public int maxSubArray(int[] nums) {
        int msf=Integer.MIN_VALUE , meh=0 ; 
        int s=0;
        for(int i=0;i<nums.length;i++){ 
            meh+=nums[i]; 
            
            if(meh>msf)
            { 
                
                msf=meh; 
                 
            } 
            if(meh<0)
            {
                meh=0; 
                s=i+1;
                
            } 
        } 
 
        return msf; 
    }
}
