class Solution {
    public int maxProfit(int[] prices) {
        int maxi=0;
        
        int n=prices.length;
        int j=n;
        int low=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<n;i++){
            if(prices[i]<low && i<j){
                low=prices[i];
                System.out.println(low);
            }

            maxi=prices[i]-low;
            if(ans<maxi){
                ans=maxi;
            }
            

        }
        return ans;
        
    }
}
