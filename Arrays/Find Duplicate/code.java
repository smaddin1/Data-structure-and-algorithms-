class Solution {
    public int findDuplicate(int[] nums) {
        
        int sum=Arrays.stream(nums).sum();
        int n=nums.length;
        int[] arr=new int[n];
        int ans=0;
        for(int i=0;i<n;i++){
           
            arr[nums[i]-1]++;
            System.out.println(arr[nums[i]-1]);
        
            if(arr[nums[i]-1]>1){
                ans=nums[i];
                break;
            }
        }
        return ans;
    }
}
