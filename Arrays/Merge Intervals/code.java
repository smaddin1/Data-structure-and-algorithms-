class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals ==null || intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        List<int[]> mergedIntervals=new ArrayList<>();
        int[] currentInterval=intervals[0];
        for(int i=1;i<intervals.length;i++){
            int[] interval=intervals[i];
            if(currentInterval[1]>=interval[0]){
                currentInterval[1]=Math.max(currentInterval[1],interval[1]);
            }else{
                mergedIntervals.add(currentInterval);
                currentInterval=interval;

            }

        }
        mergedIntervals.add(currentInterval);
        int[][] result =new int[mergedIntervals.size()][2];
        for(int i=0;i<mergedIntervals.size();i++){
            result[i]=mergedIntervals.get(i);
        }
        return result;

        
    }
}
