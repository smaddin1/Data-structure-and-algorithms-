class Solution {
    public int majorityElement(int[] nums) {
        
        int n=nums.length;
        int c=0;
        int ele=0;
        for(int i=0;i<n;i++){
            if(c==0){
                c=1;
                ele=nums[i];
            }else if(ele ==nums[i]){
                c++;
            }else{
                c--;
            }
        }
        return ele;
    }
}
